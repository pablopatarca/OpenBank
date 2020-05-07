package app.pablopatarca.openbank.data.cards

import app.pablopatarca.openbank.network.OpenBankApi
import app.pablopatarca.openbank.network.executeCall

class CardsRepositoryImpl(
    private val openBankApi: OpenBankApi
) : CardsRepository {

    override fun getCards(): CardsResultDto {
        return openBankApi.getCards().executeCall()
    }
}