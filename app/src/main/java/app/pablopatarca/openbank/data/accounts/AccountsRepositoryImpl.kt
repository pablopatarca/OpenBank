package app.pablopatarca.openbank.data.accounts

import app.pablopatarca.openbank.network.OpenBankApi
import app.pablopatarca.openbank.network.executeCall

class AccountsRepositoryImpl(
    private val openBankApi: OpenBankApi
) : AccountsRepository {

    override fun getAccounts(): AccountsResultDto {
        return openBankApi.getAccounts().executeCall()
    }

}