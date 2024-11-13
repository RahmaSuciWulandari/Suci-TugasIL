package com.uci.webtooncii.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.uci.webtooncii.data.DummyData
import com.uci.webtooncii.model.Webtoonh
import com.uci.webtooncii.model.Webtoon
import com.uci.webtooncii.navigation.Screen
import com.uci.webtooncii.presentation.component.WebtoonItem
import com.uci.webtooncii.ui.theme.WebToonCiiTheme
import com.uci.webtooncii.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    webtoons: List<Webtoonh> = DummyData.listwebtoon,
//    webtoonsy: List<Webtoon> = DummyData.listwebtoon4,
) {
val webtoon1 = webtoons.take(10)
    val webtoon2 = webtoons.takeLast(10)



                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = modifier
                        .fillMaxSize()
                        .offset(y=14.dp)
                ) {
                    item{
                        Image(
                            painter = painterResource(id = R.drawable.poster),
                            contentDescription = "saya",
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    item {
                        Text(
                            text = "Recommendations\n",
                            style = MaterialTheme.typography.titleSmall,
                            modifier = Modifier
                                .padding(horizontal = 16.dp)
                        )
                        LazyRow(
                            contentPadding = PaddingValues(horizontal = 16.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            items(webtoon1, key = { it.id }) { webtoon ->
                                WebtoonItem(webtoon = webtoon) { webtoonId ->
                                    navController.navigate(Screen.Detail.route + "/$webtoonId")
                                }
                            }
                        }
                    }
                    items(webtoon2, key = { it.id }) { webtoon ->
                        WebtoonItem2(
                            webtoon2 = webtoon,
                            modifier = Modifier.padding(horizontal = 16.dp)
                        ){webtoonId ->
                            navController.navigate(Screen.Detail.route + "/$webtoonId")
                        }
                    }
                }

        }

@Composable
fun WebtoonItem2(
    webtoon2: Webtoonh,
    modifier: Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .clickable{onItemClicked(webtoon2.id)}
    ) {
        Image(
            painter = painterResource(id = webtoon2.image),
            contentDescription = "judul webtoon",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = webtoon2.title, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = webtoon2.genre, color = MaterialTheme.colorScheme.primary)
            }
        }
    }
}




