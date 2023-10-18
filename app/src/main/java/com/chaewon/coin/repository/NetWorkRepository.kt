package com.chaewon.coin.repository

import com.chaewon.coin.network.Api
import com.chaewon.coin.network.RetrofitInstance

class NetWorkRepository {

    private val client = RetrofitInstance.getInstance().create(Api::class.java)

    suspend fun getCurrentCoinList() = client.getCurrentCoinList()

}