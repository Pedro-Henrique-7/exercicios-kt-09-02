fun main(){
    val numero = 5
    val fatorial = arrayListOf<Int>()

    for (i in numero downTo 1){
        fatorial.add(i)
    }

    println(fatorial.reduce { acc, numero -> acc * numero })
}