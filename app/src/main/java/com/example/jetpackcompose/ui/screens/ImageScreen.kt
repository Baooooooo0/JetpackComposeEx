package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetpackcompose.R

@Composable
fun ImageScreen(navController: NavHostController) {
    Column {
        Box {
            Button(
                onClick = {navController.popBackStack()},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color(0xFF42AFFF)
                ),
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(top = 40.dp, start = 5.dp, end = 15.dp, bottom = 15.dp)
            )
            {
                Text(
                    text = "<",
                    fontSize = 40.sp
                )
            }
        }
    }
    Column {
        Text(
            text = "Image Detail",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF42AFFF),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
                .padding(15.dp)
        )

        Box(
            modifier = Modifier.padding(10.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.image2),
                contentDescription = "Ảnh từ drawable",
                modifier = Modifier
                    .size(500.dp, 550.dp)
                    .fillMaxWidth()

            )
        }
    }
}


