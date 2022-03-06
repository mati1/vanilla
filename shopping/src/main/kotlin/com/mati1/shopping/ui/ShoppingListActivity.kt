package com.mati1.shopping.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShoppingListActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {

            }
        }
    }
}
//
//@Composable
//@Preview(widthDp = 600, heightDp = 1400, showBackground = true)
//fun ShoppingListScreen() {
//    MaterialTheme {
//        Scaffold(
//            topBar = {
//                TopAppBar(
//                    title = { Text("Top App Bar") },
//                    navigationIcon = {
//                        IconButton(onClick = {
//
//                        }) {
//                            Icon(Icons.Filled.ArrowBack, "backIcon")
//                        }
//                    },
//                    backgroundColor = MaterialTheme.colors.primary
//                )
//            },
//        ) {
//            Column() {
//                ShoppingItem()
//                ShoppingItem()
//            }
//        }
//    }
//}
//
//@Composable
//fun ShoppingItem() {
//    val checkedState = remember { mutableStateOf(true) }
//
//    Row {
//        Checkbox(checked = checkedState.value, onCheckedChange = {
//            checkedState.value = it
//        })
//        Text(text = "asd asd asd as")
//    }
//
//}
