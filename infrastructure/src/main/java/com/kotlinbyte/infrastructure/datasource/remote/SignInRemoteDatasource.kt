package com.kotlinbyte.infrastructure.datasource.remote

import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.tasks.Task
import com.kotlinbyte.domain.vobject.AuthResult

abstract class SignInRemoteDatasource {
    abstract suspend fun signIn(): AuthResult
    abstract suspend fun signIn(task: Task<GoogleSignInAccount>?): AuthResult

}

class SignInRemoteDatasourceImpl : SignInRemoteDatasource() {

    override suspend fun signIn(): AuthResult {
        TODO("Not yet implemented")
    }

    override suspend fun signIn(task: Task<GoogleSignInAccount>?): AuthResult {
        TODO("Not yet implemented")
    }

}