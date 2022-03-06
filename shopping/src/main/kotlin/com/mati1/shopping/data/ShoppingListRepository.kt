package com.mati1.shopping.data

import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class ShoppingListRepository @Inject constructor(
//    private val shoppingListRemoteDataSource: ShoppingListApi,
    private val localDataSource: ShoppingListLocalDataSource,
) {

    val data: Flow<List<ShoppingList>> = localDataSource.data

    suspend fun update(list: ShoppingList) = localDataSource.create(list)
}
