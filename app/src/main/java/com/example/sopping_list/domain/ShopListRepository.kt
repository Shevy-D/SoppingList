package com.example.sopping_list.domain

interface ShopListRepository {

    fun addShopItem(ShopItem: ShopItem)

    fun deleteShopItem(ShopItem: ShopItem)

    fun editShopItem(ShopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}