package com.mati1.shopping.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Card
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShoppingListsActivity : ComponentActivity() {

    private val viewModel: ShoppingListsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Scaffold(
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = {},
                        ) { Icon(Icons.Rounded.Add, "Add") }
                    },
                    isFloatingActionButtonDocked = true,
                    floatingActionButtonPosition = FabPosition.Center,
                    bottomBar = {

//                        BottomNavigation {
//                            BottomNavigationItem(selected = false, onClick = {
//
//                            }, icon = {
//                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite")
//                            })
//                        }

                        BottomAppBar(
                            // Defaults to null, that is, No cutout
                            cutoutShape = MaterialTheme.shapes.small.copy(
                                CornerSize(percent = 50)
                            ),
                        ) {
                            BottomNavigation{
                                BottomNavigationItem(selected = false, onClick = {

                                }, icon = {
                                    Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite")
                                })
                            }
                        }
                    }
                ) {
                    val lists by viewModel.lists.collectAsState(initial = ShoppingListsUiState())
//                    ShoppingLists(lists.lists)
                }
            }
        }
    }
}
//
//@Composable
//fun ShoppingLists(lists: List<ShoppingListUiState>) {
//    LazyColumn {
//        items(lists) { list -> ShoppingListCard(list) }
//    }
//}
//
//@Composable
//fun ShoppingListCard(list: ShoppingListUiState) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp)
//            .clickable{
//
//            },
//        elevation = 10.dp
//    ) {
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Text(
//                buildAnnotatedString {
//                    append("welcome to " + list.name)
//                    withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(0xFF4552B8))
//                    ) {
//                        append("Jetpack Compose Playground")
//                    }
//                }
//            )
//            Text(
//                buildAnnotatedString {
//                    append("Now you are in the ")
//                    withStyle(style = SpanStyle(fontWeight = FontWeight.W900)) {
//                        append("Card")
//                    }
//                    append(" section")
//                }
//            )
//        }
//    }
//}
