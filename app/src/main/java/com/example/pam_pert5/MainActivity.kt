package com.example.pam_pert5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.pam_pert5.ui.theme.PAM_Pert5Theme
import com.example.pam_pert5.view.DataApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PAM_Pert5Theme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    DataApp()
                }
            }
        }
    }
}