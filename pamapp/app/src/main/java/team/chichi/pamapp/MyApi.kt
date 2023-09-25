package team.chichi.pamapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MyApi {
    @GET("users/{u_Id}")
    suspend fun getUser(@Path("u_Id") u_Id:String): Response<UserDTO>

}