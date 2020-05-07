package app.pablopatarca.openbank.data.cards

interface CardsRepository {

    fun getCards() : CardsResultDto
}