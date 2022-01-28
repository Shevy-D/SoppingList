package com.example.sopping_list.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(ShopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}