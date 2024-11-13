package com.uci.webtooncii.presentation

//import com.uci.webtooncii.presentation.component.DetailGalleryScreen
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.BrowseGallery
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.uci.webtooncii.R
import com.uci.webtooncii.navigation.NavigationItem
import com.uci.webtooncii.navigation.Screen
import com.uci.webtooncii.presentation.component.AboutScreen
import com.uci.webtooncii.presentation.component.DetailGalleryScreen
import com.uci.webtooncii.presentation.component.DetailWebtoonScreen
import com.uci.webtooncii.presentation.component.GalleryScreen
import com.uci.webtooncii.presentation.component.HomeScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WebToonCiiApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {


    Scaffold(
        topBar = {
            DynamicTopAppBar(navController = navController)
        },
        bottomBar = {
            BottomBar(navController = navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }
            composable(Screen.Gallery.route) {
                GalleryScreen(navController)
            }
            composable(Screen.About.route) {
                AboutScreen()
            }
            composable(
                Screen.Detail.route + "/{webtoonId}",
                arguments = listOf(navArgument("webtoonId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                val webtoonId = navBackStackEntry.arguments?.getInt("webtoonId")
                DetailWebtoonScreen(webtoonsId = webtoonId)
            }
            composable(
                Screen.DetailGallery.route + "/{galleryId}",
                arguments = listOf(navArgument("galleryId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                val galleryId = navBackStackEntry.arguments?.getInt("galleryId")
                DetailGalleryScreen(galleryId = galleryId)
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DynamicTopAppBar(navController: NavHostController,

) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    when (currentRoute) {
        Screen.Home.route -> {

            var isSearching by remember { mutableStateOf(false) }
            var searchText by remember { mutableStateOf("") }

            TopAppBar(
                title = {

                    if (isSearching) {
                        TextField(
                            value = searchText,
                            onValueChange = { searchText = it },
                            placeholder = { Text("Search webtoons...") },
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true,
                            trailingIcon = {
                                IconButton(onClick = {
                                    searchText = ""
                                    isSearching = false
                                }) {
                                    Icon(
                                        imageVector = Icons.Default.Close,
                                        contentDescription = "Close Search"
                                    )
                                }
                            }
                        )
                    } else {
                        Text("WebToonCii")
                    }
                },
                actions = {
                    if (!isSearching) {
                        IconButton(onClick = { isSearching = true }) {
                            Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
                        }
                    }
                }
            )
        }
        Screen.Detail.route + "/{webtoonId}" -> {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Detail WebToonCii",
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {navController.popBackStack()}) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                },
            )
        }
        Screen.Gallery.route -> {
            // TopAppBar untuk GalleryScreen
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Gallery WebToonCii"
                    )
                }
            )
        }
        Screen.DetailGallery.route + "/{galleryId}" -> {
                CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Profile Character",
                    )
                },
        navigationIcon = {
            IconButton(onClick = {navController.popBackStack()}) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Localized description"
                )
            }
        },
            )
    }
        Screen.About.route -> {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "About Ucii",
                    )
                }
            )
        }
//        else -> {
//            // Default TopAppBar jika diperlukan
//            TopAppBar(
//                title = { Text(text = "WebToonCii") }
//            )
//        }
    }
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_gallery),
                icon = Icons.Default.BrowseGallery,
                screen = Screen.Gallery
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_about),
                icon = Icons.Default.Person,
                screen = Screen.About
            )
        )

        navigationItems.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WebToonCiiAppPrev() {
    WebToonCiiApp()
}