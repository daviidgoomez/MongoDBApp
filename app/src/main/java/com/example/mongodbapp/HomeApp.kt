package com.example.mongodbapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mongodbapp.ui.theme.MongoDBAppTheme

@Composable
fun MyHome(navController: NavHostController) {
    Column(modifier = Modifier
        .padding(20.dp)
        .fillMaxSize()) {
    Title()
        IberdrolaMenu(navController = navController)
    }
}


@Composable
fun Title() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Proyecto Iberdrola",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .weight(1f)
                .padding(end = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.iberdrola),
            contentDescription = null,
            modifier = Modifier.size(88.dp)
        )
    }
    Divider(modifier = Modifier.padding(0.dp))
}

@Composable
fun IberdrolaMenu(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Button(
            onClick = { /* Acción del botón 1 */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Botón 1")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Acción del botón 2 */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Botón 2")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Acción del botón 3 */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Botón 3")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Acción del botón 4 */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Botón 4")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Acción del botón 5 */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(text = "Botón 5")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun MainPreview() {
    MongoDBAppTheme {
        val navController = rememberNavController()
        MyHome(navController = navController)
    }
}