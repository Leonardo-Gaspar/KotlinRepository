//Exercise: Inversão do Array

fun main(){

    //Array Original
    val originalArray = arrayOf(1, 2, 3, 4, 5)
    //Array invertido
    val invertedArray = originalArray.reversed()

    //Array original : 1, 2, 3, 4, 5
    println("Array Original: ${originalArray.joinToString()}") 

    //Array invertido : 5, 4, 3, 2, 1
    println("Array Invertido: ${invertedArray.joinToString()}") 

    //Exemplo como é utilizado A - Z, ou Z - A

}