package com.example.vk_android_course_hw_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.vk_android_course_hw_1.styles.Vk_android_course_hw_1Theme
import com.example.vk_android_course_hw_1.ui.CustomGridGalleryWithButton
import androidx.compose.runtime.collectAsState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Vk_android_course_hw_1Theme {
                val viewModel: MainViewModel = viewModel()

                val itemCount = viewModel.itemCount.collectAsState()

                CustomGridGalleryWithButton(
                    itemCount = itemCount.value,
                    onAddItem = { viewModel.updateItemCount(itemCount.value.inc()) }
                )
            }
        }
    }
}

