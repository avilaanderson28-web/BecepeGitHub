package com.example.becepe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.becepe.ui.navigation.AppNavigation
import com.example.becepe.ui.theme.BecepeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BecepeTheme {
                AppNavigation()
            }
        }
    }
}
