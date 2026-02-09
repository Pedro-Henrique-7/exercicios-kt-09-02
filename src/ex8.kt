fun main (){
    val contaBancaria = ContaBancaria()
    contaBancaria.nomeTitular = "Pedro"
    print(contaBancaria.nomeTitular.toString())
    contaBancaria.depositar(10.0)
    println("Seu saldo " + contaBancaria.verificar())
    contaBancaria.saque(5.0)
    println("Saldo após deposito: " + contaBancaria.verificar())
}