import model.ContaBancaria

fun main (){
    val contaBancaria = ContaBancaria()
    contaBancaria.nomeTitular = "Pedro"
    println(contaBancaria.nomeTitular)
    println("Seu saldo " + contaBancaria.verificar())
    contaBancaria.depositar(1000.0)
    println("Seu saldo após deposito: " + contaBancaria.verificar())
    contaBancaria.saque(500.0)
    println("Saldo após saque: " + contaBancaria.verificar())
}