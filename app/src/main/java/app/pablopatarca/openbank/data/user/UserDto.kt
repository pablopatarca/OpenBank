package app.pablopatarca.openbank.data.user

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserDto(
    val id: String,
    val firstName: String,
    val lastName: String
)