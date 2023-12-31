enum class TransactionStatusMessage(val statusMessage: String) {
    APPROVED_MESSAGE("Transação Aprovada!"),
    INVALID_ACCOUNT_ID_MESSAGE("Transação Negada: id da conta inválido."),
    INSUFFICIENT_BALANCE_MESSAGE("Transação Negada: saldo insuficiente"),
}