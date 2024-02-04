package com.example.mongodbapp

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mongodbapp.ui.theme.MongoDBAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navigationController = rememberNavController()
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

            NavHost(
                navController = navigationController,
                startDestination = NavigationActivity.HomeApp.route
            ) {
                composable(NavigationActivity.HomeApp.route) {
                    MyHome(navigationController)
                }
                composable(NavigationActivity.BuildCollectionScreen.route) {

                }
            }
        }
    }
}



