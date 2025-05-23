package com.example.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable

fun ButtonList(navHostController: NavHostController, detail: String, route: String) {
    Box {
        Button(
            onClick = {navHostController.navigate(route)},
            shape = RoundedCornerShape(25),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF42AFFF),
                contentColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = detail,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(12.dp)
                )
            }
        }
    }
}








