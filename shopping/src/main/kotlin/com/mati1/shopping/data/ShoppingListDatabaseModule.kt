package com.mati1.shopping.data

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ShoppingListDatabaseModule {

    @Provides
    @Singleton
    fun provideShoppingListDatabase(
        @ApplicationContext context: Context,
    ): ShoppingListDatabase = Room.databaseBuilder(
        context,
        ShoppingListDatabase::class.java,
        "com.mati1.shopping-lists"
    ).build()

    @Provides
    fun ShoppingListDatabase.provideChannelDao() = shoppingListDao()
}
