package com.mati1.shopping.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mati1.shopping.data.ShoppingListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

@HiltViewModel
class ShoppingListsViewModel @Inject constructor(
    private val repository: ShoppingListRepository
) : ViewModel() {

    init {
        createList()
    }

    val lists: Flow<ShoppingListsUiState> = repository.data.map {
        ShoppingListsUiState(
            refreshing = false,
            lists = it.map {
                ShoppingListUiState(
                    it.name,
                    it.items.map {
                        ShoppingItemUiState(it.name, it.completed)
                    }
                )
            }
        )
    }

    fun createList() {
        viewModelScope.launch {
//            repository.create()
        }
    }
}
