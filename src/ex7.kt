fun main(){
    val produtos = mapOf(
        "Notebook" to 3500.0,
        "Smartphone" to 2500.0,
        "Fone de Ouvido" to 150.0,
        "Teclado Mecânico" to 320.0,
        "Mouse Gamer" to 180.0
    )
    var maiorPreco = 0.0
    var produto = ""

    for(valor in produtos){
       if (valor.value > maiorPreco){
           maiorPreco = valor.value
           produto = valor.key
       }
    }
    println("O o produto com maior valor é $produto $maiorPreco ")
}