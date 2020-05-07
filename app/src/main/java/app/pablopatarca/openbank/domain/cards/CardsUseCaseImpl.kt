package app.pablopatarca.openbank.domain.cards

import app.pablopatarca.openbank.data.cards.CardsRepository
import app.pablopatarca.openbank.data.cards.CardsResultDto

class CardsUseCaseImpl(
    private val cardsRepository: CardsRepository
) : CardsUseCase {

    private var cards: List<Card>? = null

    override suspend fun getCards(): List<Card> {
        if (cards == null) {
            cards = transformToCardsList(cardsRepository.getCards())
        }

        return cards ?: arrayListOf()
    }

    override suspend fun getFavCard(): Card {
        return getCards().first()
    }


    private fun transformToCardsList(cardsDto: CardsResultDto): List<Card> {
        return cardsDto.cards.map {
            with(it) {
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