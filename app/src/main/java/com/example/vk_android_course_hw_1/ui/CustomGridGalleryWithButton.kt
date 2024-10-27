package com.example.vk_android_course_hw_1.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.vk_android_course_hw_1.R

@Composable
fun CustomGridGalleryWithButton(
    modifier: Modifier = Modifier,
    itemCount: Int,
    onAddItem: () -> Unit
) {
    val configuration = LocalConfiguration.current
    val columns = if (configuration.orientation == android.content.res.Configuration.ORIENTATION_PORTRAIT) 3 else 4

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        LazyVerticalGrid(
            modifier = Modifier.wrapContentHeight(),
            columns = GridCells.Fixed(columns),
        ) {
            itemsIndexed(List(itemCount) { it }) { index, _ ->
                CustomGridGalleryItem(index = index)
            }
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(horizontal = 8.dp),
            onClick = onAddItem
        ) {
            Text(stringResource(R.string.add_item))
        }
    }
}


