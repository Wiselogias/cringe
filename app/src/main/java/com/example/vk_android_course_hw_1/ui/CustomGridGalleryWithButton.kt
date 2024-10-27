package com.example.vk_android_course_hw_1.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun CustomGridGalleryWithButton(
    modifier: Modifier = Modifier,
    itemCount: Int = 0
) {
    var items = remember { mutableIntStateOf(itemCount) }
    val configuration = LocalConfiguration.current
    val columns = if (configuration.orientation == android.content.res.Configuration.ORIENTATION_PORTRAIT) 3 else 4
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        LazyVerticalGrid(
            modifier = Modifier.wrapContentHeight(),
            columns = GridCells.Fixed(columns),
        ) {
            itemsIndexed(List(items.intValue) { it }) { index, item ->
                CustomGridGalleryItem(index = index)
            }
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            onClick =  { items.intValue += 1 }
        ) {
            Text("Добавь Айтем")
        }
    }
}
