package com.example.myboswoapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.example.myboswoapp.models.DashboardStart
import com.example.myboswoapp.models.QuickAction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DashboardViewModel:ViewModel(){
    private val _stats= MutableStateFlow(
        listOf(
            DashboardStart("Revenue", "12000",Icons.Default.Phone,Color.Magenta),
            DashboardStart("User","1223",Icons.Default.Person,Color.Cyan)

        )
    )
    val stat:StateFlow<List<DashboardStart>>get()=_stats
    private val _quickaction = MutableStateFlow(
        listOf(
            QuickAction("Add new user",Icons.Default.Person),
            QuickAction("Generate report",Icons.Default.AccountCircle),
            QuickAction("Settings",Icons.Default.Settings)
        )
    )
    val quickAction:StateFlow<List<QuickAction>>get()=_quickaction
}