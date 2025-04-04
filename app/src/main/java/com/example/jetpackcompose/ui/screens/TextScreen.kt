package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetpackcompose.R

@Composable
fun TextScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(navHostController = navController,"Text Detail")

        Text(
            text = "“The only way to do great work \n" +
                    "is to love what you do”",
            fontSize = 30.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 25.dp),
            textAlign = TextAlign.Center
        )

        Image(
            painter = painterResource(id = R.drawable.image4),
            contentDescription = null,
            modifier = Modifier
                .height(550.dp)
                .width(450.dp)
        )

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ){
            Button(
                onClick = { navController.navigate("start") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF42AFFF),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .padding(bottom = 15.dp)
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .padding(start = 25.dp, end = 25.dp, bottom = 15.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "Back to Root",
                    fontSize = 25.sp,
                )
            }
        }
    }
}