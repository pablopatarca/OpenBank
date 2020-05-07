package app.pablopatarca.openbank.domain.payments

data class Card (
    val id: Long,
    val code: String,
    val type: String?,
    val customerName: String?,
    val exp: String?
)