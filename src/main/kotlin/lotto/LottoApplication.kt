package lotto

import lotto.domain.LottoMachine
import lotto.view.InputView
import lotto.view.OutputView

fun main() {
    val money = InputView.read()
    val lottoMachine = LottoMachine(money)
    lottoMachine.execute()

    val lottoSummary = lottoMachine.getSummary()
    OutputView.printSummary(lottoSummary)
}
