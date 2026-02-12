package model

class Gerente: Funcionario(){
    var nomeGerente : String = "Jonas"

    override fun mostrarSalario(): Double {
        val comissao = salario / 100 * 20
        return salario + comissao
    }


}