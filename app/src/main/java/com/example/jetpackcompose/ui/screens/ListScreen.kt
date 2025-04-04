package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.jetpackcompose.ButtonList


@Composable
fun ListScreen(navController: NavHostController){
    Column {
        Header(navHostController = navController, "Lazy List")
//        ButtonList("01 | The only way to do great work is to love what you do.")

        val listState = rememberLazyListState()
        LazyColumn(
            modifier = Modifier
                .padding(start = 10.dp, end = 5.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            state = listState
        ) {
            items(List(10000) {"0" + "${it + 1} | The only way to do great work is to love what you do." })
            { text ->
                ButtonList(navHostController = navController, text, "Text")
            }
        }
    }
}

