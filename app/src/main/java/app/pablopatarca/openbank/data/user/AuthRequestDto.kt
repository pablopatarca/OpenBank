package app.pablopatarca.openbank.data.user

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class AuthRequestDto(
    val userId: String,
    val pin: String
)