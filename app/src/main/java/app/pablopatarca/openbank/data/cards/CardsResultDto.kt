package app.pablopatarca.openbank.data.cards

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CardsResultDto(
    val cards: List<CardDto>
){
    @JsonClass(generateAdapter = true)
    data class CardDto(
        val id: Long,
        val code: String,
        val type: String?,
        val customerName: String?,
        val exp: String?
    )
}