package app.pablopatarca.openbank.ui.payments

import androidx.lifecycle.ViewModel
import app.pablopatarca.openbank.domain.payments.Card
import app.pablopatarca.openbank.domain.payments.PaymentsUseCase

class PaymentsViewModel(
    private val useCase: PaymentsUseCase
) : ViewModel() {

    fun getCards(): List<Card> {
        return useCase.getCards()
    }
}
