package com.mati1.shopping.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_list_items")
data class ShoppingListItemEntity(
    @PrimaryKey(autoGenerate = true) val id: Long? = null,
    @ColumnInfo(name = "shopping_list_id") val shoppingListId: Long? = null,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "completed") val completed: Boolean = false,
)
