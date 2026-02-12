package model

class ContaBancaria {
    var nomeTitular: String = ""
    private var saldo = 0.0

    fun depositar(valor: Double){
        saldo += valor
    }
    fun saque(valor: Double){

        saldo -= valor
    }

    fun verificar(): Double{
        return saldo
    }

}