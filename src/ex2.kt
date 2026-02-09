fun main(){
    val numeros = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val numerosImpares = numeros.filter { it % 2 == 1 }
    println(numerosImpares)
}