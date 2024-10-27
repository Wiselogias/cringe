package com.example.vk_android_course_hw_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.vk_android_course_hw_1.styles.Vk_android_course_hw_1Theme
import com.example.vk_android_course_hw_1.ui.CustomGridGalleryWithButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Vk_android_course_hw_1Theme {
                CustomGridGalleryWithButton(
                    itemCount = 0
                )
            }
        }
    }
}