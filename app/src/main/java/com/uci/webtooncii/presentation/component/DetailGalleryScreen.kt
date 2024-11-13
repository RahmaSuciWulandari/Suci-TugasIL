package com.uci.webtooncii.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.uci.webtooncii.data.DummyData.profilgalery
import com.uci.webtooncii.model.Gallery
import com.uci.webtooncii.model.GalleryData
import com.uci.webtooncii.model.Webtoonh
import com.uci.webtooncii.navigation.Screen

@Composable
fun DetailGalleryScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    galleryId: Int?
) {
    // Filter untuk mendapatkan item yang sesuai dengan galleryId
    val newGalleryList = profilgalery.filter { gallery ->
        gallery.id == galleryId
    }

    Column(
        modifier = modifier
    ) {
        DetailGalleryContent(newGalleryList = newGalleryList, navController = navController)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DetailGalleryContent(
    newGalleryList: List<GalleryData>,
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .padding(16.dp)
    ) {
        // Menampilkan foto karakter
        Image(
            painter = painterResource(id = newGalleryList[0].photo),
            contentDescription = "Photo of ${newGalleryList[0].name}",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .offset(x = 120.dp, y = 5.dp)
                .size(height = 250.dp, width = 200.dp)
                .clip(RoundedCornerShape(16.dp))
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Menampilkan detail lainnya dalam kolom
        Column(
            modifier = Modifier.padding(4.dp)
        ) {
            Text(
                text = "\n${newGalleryList[0].name}",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Tanggal Lahir: ${newGalleryList[0].tl}",
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = "Golongan Darah: ${newGalleryList[0].goldar}",
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = "Tinggi Badan: ${newGalleryList[0].tb}",
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = "Berat Badan: ${newGalleryList[0].bb}",
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = "Makanan Favorit: ${newGalleryList[0].fav}",
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = "Suka: ${newGalleryList[0].suka}",
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = "Tidak Suka: ${newGalleryList[0].gsuka}",
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}
