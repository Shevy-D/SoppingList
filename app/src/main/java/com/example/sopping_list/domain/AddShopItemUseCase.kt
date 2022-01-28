package com.example.sopping_list.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(ShopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}