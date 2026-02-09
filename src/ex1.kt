fun main() {
    for (i in 1..100) {
        if (i % 5 == 0 && i % 3 == 0) {
            println("$i BatataQuente")
        } else if (i % 5 == 0) {
            println("$i Quente")
        } else if (i % 3 == 0) {
            println("$i Batata")
        }else
            println(    i)
    }
}