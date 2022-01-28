package com.example.sopping_list.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopItem(ShopItem: ShopItem)

    fun deleteShopItem(ShopItem: ShopItem)

    fun editShopItem(ShopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}