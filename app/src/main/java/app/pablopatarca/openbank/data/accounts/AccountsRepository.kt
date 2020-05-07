package app.pablopatarca.openbank.data.accounts

interface AccountsRepository {

    fun getAccounts() : AccountsResultDto
}