package com.example.vk_android_course_hw_1.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomGridGalleryItem(
    modifier: Modifier = Modifier,
    index: Int
) {
    Box(
        modifier = modifier
            .padding(4.dp)
            .aspectRatio(1f)
            .background(if (index % 2 == 0) Color.Red else Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "$index",
            fontSize = 20.sp,
            color = Color.White
        )

    }
}