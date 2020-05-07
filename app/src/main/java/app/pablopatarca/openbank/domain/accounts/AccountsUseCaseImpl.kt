package app.pablopatarca.openbank.domain.accounts

import app.pablopatarca.openbank.data.accounts.AccountsRepository
import app.pablopatarca.openbank.data.accounts.AccountsResultDto
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AccountsUseCaseImpl(
    private val accountsRepository: AccountsRepository
) : AccountUseCase {
    override suspend fun getAccounts(): List<Account> {
        return withContext(Dispatchers.IO) {
            return@withContext transformToAccounts(
                accountsRepository.getAccounts()
            )
        }
    }

    private fun transformToAccounts(accountsDto: AccountsResultDto): List<Account> {
        return accountsDto.accounts.map {
            with(it) {
                Account(
                    accountId = accountId,
                    id = id,
                    number = number,
                    name = name,
                    iban = iban,
                    currency = currency,
                    balance = balance,
                    main = main,
                    favorite = favorite
                )
            }
        }
    }
}