package com.example.vk_android_course_hw_1

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
    private val _itemCount = MutableStateFlow(0)

    val itemCount: StateFlow<Int> = _itemCount

    fun updateItemCount(newCount: Int) {
        _itemCount.value = newCount
    }
}



