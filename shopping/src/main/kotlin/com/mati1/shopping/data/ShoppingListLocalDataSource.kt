package com.mati1.shopping.data

import com.mati1.shopping.di.IoDispatcher
import javax.inject.Inject
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class ShoppingListLocalDataSource @Inject constructor(
    private val shoppingListDao: ShoppingListDao,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
) {

    val data: Flow<List<ShoppingList>> = shoppingListDao.getListsWithItems()
        .map { shoppingLists -> shoppingLists.map(::map) }

    suspend fun create(list: ShoppingList) = withContext(ioDispatcher) {
        shoppingListDao.insertListWithItems(list.let(::map))
    }

    private fun map(shoppingList: ShoppingListWithItems): ShoppingList = ShoppingList(
        name = shoppingList.list.name,
        items = shoppingList.items.map { item -> ShoppingItem(item.id, item.name, item.completed) },
    )

    private fun map(shoppingList: ShoppingList): ShoppingListWithItems = ShoppingListWithItems(
        list = ShoppingListEntity(id = shoppingList.id, name = shoppingList.name),
        items = shoppingList.items.map {
            ShoppingListItemEntity(
                id = it.id,
                shoppingListId = shoppingList.id,
                name = it.name,
                completed = it.completed
            )
        }
    )
}
