package app.pablopatarca.openbank.domain.cards

interface CardsUseCase {

    suspend fun getCards() : List<Card>

    suspend fun getFavCard() : Card

}