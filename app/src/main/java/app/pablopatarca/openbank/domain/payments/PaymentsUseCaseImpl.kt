package app.pablopatarca.openbank.domain.payments

import app.pablopatarca.openbank.data.cards.CardsResultDto


open class PaymentsUseCaseImpl : PaymentsUseCase {

    override fun getCards(): List<Card> {
//        val cardsResult = paymentsService.getCards()
        return transformCards(CardsResultDto(listOf()))
    }

    private fun transformCards(cardsDto: CardsResultDto) : List<Card> {
        return cardsDto.cards.map {
            with(it){
                Card(
                    id = id,
                    code = code,
                    type = type,
                    customerName = customerName,
                    exp = exp
                )
            }
        }
    }
}