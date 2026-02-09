class ContaBancaria {
    var nomeTitular: String = ""
    private var saldo = 0.0

    fun depositar(valor: Double): Double {
        val saldoDeposito =  valor + saldo
        saldo + saldoDeposito
        return saldoDeposito
    }
    fun saque(valor: Double): Double {
        val saldoSaque = saldo - valor
        saldo - saldoSaque

        return saldoSaque
    }

    fun verificar(): Double{
        return saldo
    }

}