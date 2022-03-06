package com.mati1.shopping.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [
        ShoppingListEntity::class,
        ShoppingListItemEntity::class,
    ],
)
abstract class ShoppingListDatabase : RoomDatabase() {
    abstract fun shoppingListDao(): ShoppingListDao
}
