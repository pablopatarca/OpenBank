package app.pablopatarca.openbank.domain.accounts

interface AccountUseCase {

    suspend fun getAccounts() : List<Account>

}