package app.pablopatarca.openbank.domain.accounts

import java.util.*

class Account(
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