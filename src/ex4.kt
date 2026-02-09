fun main(){

    val idades = arrayListOf<Int>(20,12,24,13,34,23,16)
    val maiores = idades.filter { it > 18 }
    println(maiores.sum() / maiores.size)

}