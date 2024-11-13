package com.uci.webtooncii.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Help
import androidx.compose.material.icons.automirrored.filled.LibraryBooks
import androidx.compose.material.icons.automirrored.filled.MobileScreenShare
import androidx.compose.material.icons.automirrored.filled.SendToMobile
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uci.webtooncii.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen() {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Image(
                painter = painterResource(id = R.drawable.ucii),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .offset(x = 120.dp, y = 5.dp)
                    .clip(CircleShape)
                    .size(200.dp),
                contentDescription = "saya"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "\nRahma Suci Wulandari",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentSize(Alignment.Center)
                )
                Text(
                    text = "(Suci/Cici)",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentSize(Alignment.Center)
                )
                Text(
                    text = "\"Jika kamu lelah kuliah, maka ingatlah kedua orang tuamu\"\n",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentSize(Alignment.Center)
                )
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(x=15.dp)
                ){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.Help,
                            contentDescription = " "
                        )
                        Text(
                            text = "  2212110026@gmail.com\n",
                            style = MaterialTheme.typography.bodyMedium,
                        )
                    }
                    Row {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.LibraryBooks,
                            contentDescription = " "
                        )
                        Text(
                            text = "  Universitas Qommaruddin Gresik\n",
                            style = MaterialTheme.typography.bodyMedium,
                        )
                    }
                    Row {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.MobileScreenShare,
                            contentDescription = " "
                        )
                        Text(
                            text = "  Teknik\n",
                            style = MaterialTheme.typography.bodyMedium,
                        )
                    }
                    Row {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.SendToMobile,
                            contentDescription = " "
                        )
                        Text(
                            text = "  Teknik Informatika\n",
                            style = MaterialTheme.typography.bodyMedium,
                        )
                    }
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun DetailWebtoonPreview() {
    AboutScreen()
}