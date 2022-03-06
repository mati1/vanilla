package com.mati1.shopping.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ShoppingItem(
    val id: Long? = null,
    val name: String,
    val completed: Boolean,
) : Parcelable
