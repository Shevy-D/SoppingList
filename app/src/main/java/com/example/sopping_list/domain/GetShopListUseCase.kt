package com.example.sopping_list.domain

class GetShopListUseCase (private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}