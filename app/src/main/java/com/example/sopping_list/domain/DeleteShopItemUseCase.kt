package com.example.sopping_list.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItem(ShopItem: ShopItem) {
        shopListRepository.deleteShopItem(com.example.sopping_list.domain.ShopItem)

    }
}