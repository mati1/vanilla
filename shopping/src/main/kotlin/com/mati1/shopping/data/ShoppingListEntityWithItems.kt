package com.mati1.shopping.data

import androidx.room.Embedded
import androidx.room.Relation

data class ShoppingListWithItems(

    @Embedded
    val list: ShoppingListEntity,

    @Relation(parentColumn = "id", entityColumn = "shopping_list_id")
    val items: List<ShoppingListItemEntity>
)
