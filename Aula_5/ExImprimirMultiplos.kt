// Exercício numeros multiplos de 5

fun main(){

    //Utilizando o loop FOR para imprimir multiplos de 5 de 0 a 50
    for (i in 0..50) {
        if (i % 5 == 0) {
            println(i)
            }
    }

     // Ou

     for(i in 0..50 step 5){
        println(i)
     }
}

