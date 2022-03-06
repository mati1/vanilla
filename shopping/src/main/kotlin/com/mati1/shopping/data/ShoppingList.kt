package com.mati1.shopping.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ShoppingList(
    val id: Long? = null,
    val name: String,
    val items: List<ShoppingItem>,
) : Parcelable
