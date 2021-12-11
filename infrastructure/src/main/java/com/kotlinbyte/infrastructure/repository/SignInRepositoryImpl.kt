package com.kotlinbyte.infrastructure.repository

import com.github.kittinunf.result.Result
import com.kotlinbyte.domain.exception.Failure
import com.kotlinbyte.domain.repository.signin.SignInRepository
import com.kotlinbyte.domain.vobject.AuthResult
import com.kotlinbyte.domain.vobject.Email
import com.kotlinbyte.domain.vobject.Password

class SignInRepositoryImpl : SignInRepository() {
    override suspend fun signIn(email: Email, password: Password): Result<AuthResult, Failure> {
        TODO("Not yet implemented")
    }

    override suspend fun signIn(token: String): Result<AuthResult, Failure> {
        TODO("Not yet implemented")
    }
}