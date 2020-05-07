package app.pablopatarca.openbank.data.user

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuthResultDto(
    val user: UserDto,
    val token: String
)