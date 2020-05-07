package app.pablopatarca.openbank.domain.accounts

import app.pablopatarca.openbank.data.accounts.AccountsRepository
import app.pablopatarca.openbank.data.accounts.AccountsResultDto
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*

class AccountsUseCaseTest {

    @Mock
    lateinit var accountsRepository: AccountsRepository

    // class under test
    lateinit var accountsUseCase: AccountUseCase

    @Before
    fun setUp() {

        // set up the repository
        accountsRepository = mock(AccountsRepository::class.java)
        // set up the use case
        accountsUseCase = AccountsUseCaseImpl(accountsRepository)
    }

    @Test
    fun `should returns three accounts`() = runBlocking {

        `when`(accountsRepository.getAccounts())
            .thenReturn(createNewAccountsResultDto())

        val accounts = accountsUseCase.getAccounts()

        // Assert
        assert(accounts.size == 3)
        verify(accountsRepository, times(1)).getAccounts()

        Unit
    }

    private fun createNewAccountsResultDto() : AccountsResultDto {
        return AccountsResultDto(
            listOf(
                AccountsResultDto.AccountDto(
                    accountId = "1234567",
                    id = "ITXXX11184849",
                    number = "11184849",
                    name = "Main Account",
                    iban = "IT78F0300203280959611184849",
                    currency = "EUR",
                    balance = 10000.0F,
                    main = true,
                    favorite = true
                ),
                AccountsResultDto.AccountDto(
                    accountId = "1234568",
                    id = "ITXXX11184850",
                    number = "11184850",
                    name = "",
                    iban = "IT78F0300203280959611184849",
                    currency = "EUR",
                    balance = 50.0F,
                    main = false,
                    favorite = false
                ),AccountsResultDto.AccountDto(
                    accountId = "1234569",
                    id = "USXXX11184851",
                    number = "11184851",
                    name = "Dollars account",
                    iban = "US78F0300203280959611111111",
                    currency = "USA",
                    balance = 0.0F,
                    main = false,
                    favorite = false
                )
            )
        )
    }

}