package com.kotlinbyte.infrastructure.repository

import com.github.kittinunf.result.Result
import com.kotlinbyte.domain.entity.ServerInfo
import com.kotlinbyte.domain.exception.Failure
import com.kotlinbyte.domain.repository.ServerInfoRepository
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

class ServerInfoRepositoryImpl @Inject constructor() : ServerInfoRepository() {
    override suspend fun getInfo(): Result<ServerInfo, Failure> {
        TODO("Not yet implemented")
    }
}