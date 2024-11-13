package com.uci.webtooncii.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.uci.webtooncii.data.DummyData
import com.uci.webtooncii.model.Webtoonh
import kotlin.collections.get


@Composable
fun DetailWebtoonScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    webtoonsId: Int?
) {
    val newWebtoonList = DummyData.listwebtoon.filter { webtoon ->
        webtoon.id == webtoonsId
    }
    Column(
        modifier = modifier
    ) {
        DetailWebtoonContent(newWebtoonsList = newWebtoonList, navController = navController)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DetailWebtoonContent(
    newWebtoonsList: List<Webtoonh>,
    modifier: Modifier = Modifier,
    navController: NavController
) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
        ) {
            Image(
                painter = painterResource(id = newWebtoonsList[0].image),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .offset(x = 120.dp, y = 5.dp)
                    .size(height = 250.dp, width = 200.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentDescription = "Poster"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .padding(4.dp)
            ) {
                Text(
                    text = "\n${newWebtoonsList[0].title}",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "(${newWebtoonsList[0].author})\n",
                    style = MaterialTheme.typography.titleSmall,
                )
                Text(
                    text = "${newWebtoonsList[0].genre}\n",
                    style = MaterialTheme.typography.titleSmall,
                )
                Text(
                    text = "${newWebtoonsList[0].preview}",
                    style = MaterialTheme.typography.titleSmall,
                )
            }
        }
}

//@Preview(showBackground = true)
//@Composable
//private fun DetailWebtoonPreview() {
//    DetailWebtoonContent(newWebtoonsList = DummyData.listwebtoon)
//}