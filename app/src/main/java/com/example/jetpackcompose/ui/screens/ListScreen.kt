package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
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
import com.example.jetpackcompose.R


@Composable
fun ListScreen(){
    Column {
        Text(
            text = "UI Components List",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
                .padding(25.dp)
        )

        Text(
            text = "Display",
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 8.dp)
        )

        Button(onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFADD8E6),
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 20.dp, top = 5.dp, bottom = 0.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                Text(
                    text = "Text",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Display Text",
                    fontSize = 20.sp,
                )
            }
        }

        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFADD8E6),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 20.dp, top = 10.dp, bottom = 0.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Image",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Display Image",
                    fontSize = 20.sp,
                )
            }
        }

        Text(
            text = "Input",
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 8.dp, top = 30.dp)
        )

        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFADD8E6),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 20.dp, top = 5.dp, bottom = 0.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "TextField",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Input for textfield",
                    fontSize = 20.sp,
                )
            }
        }

        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFADD8E6),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 20.dp, top = 10.dp, bottom = 0.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "PasswordField",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Input for passwords",
                    fontSize = 20.sp,
                )
            }
        }

        Text(
            text = "Layout",
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 8.dp, top = 30.dp)
        )

        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFADD8E6),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 20.dp, top = 5.dp, bottom = 0.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Column",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Arranges elements vertically",
                    fontSize = 20.sp,
                )
            }
        }

        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFADD8E6),
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 20.dp, top = 10.dp, bottom = 0.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Row",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "Arranges elements horizontally",
                    fontSize = 20.sp,
                )
            }
        }

    }
}
