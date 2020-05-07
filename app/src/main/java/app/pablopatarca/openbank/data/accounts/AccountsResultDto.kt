package app.pablopatarca.openbank.data.accounts

import com.squareup.moshi.JsonClass
import java.util.*

@JsonClass(generateAdapter = true)
data class AccountsResultDto(
    val accounts: List<AccountDto>
) {
    @JsonClass(generateAdapter = true)
    data class AccountDto(
        val id: String,
        val accountId: String,
        val number: String,
        val name: String,
        val iban: String,
        val currency: String,
        val balance: Float,
        val main: Boolean,
        val favorite: Boolean
    )
}