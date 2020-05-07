package app.pablopatarca.openbank.data.user

interface UserRepository {

    suspend fun authenticate(id: String, pin: String) : AuthResultDto

    suspend fun checkPin(pin: String) : AuthResultDto

    suspend fun getUser() : UserDto

}