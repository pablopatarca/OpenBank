package app.pablopatarca.openbank.domain.payments

interface PaymentsUseCase {

    fun getCards() : List<Card>

}