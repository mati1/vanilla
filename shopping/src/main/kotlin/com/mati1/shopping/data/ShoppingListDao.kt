package com.mati1.shopping.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow

@Dao
interface ShoppingListDao {

    @Query("SELECT * FROM shopping_lists")
    fun getLists(): Flow<List<ShoppingListEntity>>

    @Transaction
    @Query("SELECT * FROM shopping_lists")
    fun getListsWithItems(): Flow<List<ShoppingListWithItems>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertList(list: ShoppingListEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertItems(vararg items: ShoppingListItemEntity)

    @Transaction
    fun insertListWithItems(vararg lists: ShoppingListWithItems) = lists.forEach {
        val shoppingListId = insertList(it.list)
        insertItems(*it.items.map { item -> item.copy(id = shoppingListId) }.toTypedArray())
    }
}
