package com.uci.webtooncii.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uci.webtooncii.ui.theme.WebToonCiiTheme
import com.uci.webtooncii.R
import com.uci.webtooncii.model.Webtoon

@Composable
fun WebtoonItem(
    webtoon: Webtoon,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(webtoon.id)
        }
    ) {
        Image(
            painter = painterResource(id = webtoon.image),
            contentDescription = webtoon.title, modifier = Modifier
                .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp, bottomStart = 15.dp, bottomEnd = 15.dp))
                .size(80.dp)
        )
        Text(
            text = webtoon.title,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
        Text(
            text = webtoon.genre,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun WebtoonItemHorizontalPreview() {
    WebToonCiiTheme {
        WebtoonItem(
            webtoon = Webtoon(1, "dedes", "Kerajaan", R.drawable.dedes),
            onItemClicked = { webtoonId ->
                println("Webtoon Id : $webtoonId")
            }
        )
    }
}