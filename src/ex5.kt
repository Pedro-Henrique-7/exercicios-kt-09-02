fun main(){
    val numero = 40
    val fatorial = arrayListOf<Int>()

    for (i in numero downTo 1){
        fatorial.add(i)
    }
    println(fatorial)
    println(fatorial.reduce { acc, numero -> acc * numero })
}