package com.kotlinbyte.infrastructure.datasource.local

import android.content.SharedPreferences
import com.kotlinbyte.domain.exception.AuthenticationRequiredException
import com.kotlinbyte.domain.utils.KeyConstants
import com.kotlinbyte.domain.vobject.AuthResult
import javax.inject.Inject

interface UserCredentialsLocalDataSource {
    suspend fun writeToken(token: String)
    suspend fun getAuth(): AuthResult
    suspend fun isAuthenticated(): Boolean
}

class SPUserCredentialsLocalDataSource @Inject constructor(private val sharedPreferences: SharedPreferences) :
    UserCredentialsLocalDataSource {

    private var authResult: AuthResult? = null

    override suspend fun writeToken(token: String) = with(sharedPreferences.edit()) {
        putString(KeyConstants.TOKEN, token)
        authResult = AuthResult(token)
        apply()
    }


    override suspend fun getAuth() =
        authResult ?: sharedPreferences.getString(KeyConstants.TOKEN, null)?.let {
            authResult = AuthResult(it)
            authResult
        }
        ?: throw AuthenticationRequiredException()


    override suspend fun isAuthenticated(): Boolean = authResult == null
}