package app.pablopatarca.openbank.network

import app.pablopatarca.openbank.data.accounts.AccountsResultDto
import app.pablopatarca.openbank.data.cards.CardsResultDto
import app.pablopatarca.openbank.data.user.AuthRequestDto
import app.pablopatarca.openbank.data.user.AuthResultDto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface OpenBankApi {

    @POST("/user/authenticate")
    fun authenticate(
        @Body authDto: AuthRequestDto
    ): Call<AuthResultDto>


    @GET("/user/cards")
    fun getCards(): Call<BaseResponse<CardsResultDto>>

    @GET("/user/accounts")
    fun getAccounts(): Call<BaseResponse<AccountsResultDto>>
}