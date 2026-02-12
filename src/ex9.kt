import model.Funcionario
import model.Gerente

fun main() {
    val funcionario = Funcionario()
    funcionario.nome = "Pedro"
    val nome = funcionario.nome
    val gerente = Gerente()

    println("Olá $nome")
    println("Seu salário é ${funcionario.mostrarSalario()}")
    println("Seu gerente te deu uma comisão de 20%! Agora seu salário é: ${gerente.mostrarSalario()}")
}