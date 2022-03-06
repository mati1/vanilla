package com.mati1.shopping.ui

data class ShoppingListsUiState(
    val refreshing: Boolean = true,
    val lists: List<ShoppingListUiState> = emptyList(),
)
