//Variáveis

/*
    var = mutável
    val = imutável
*/


fun main(){

    val imutavel: Int = 5
    var mutavel: Int = 10
    var sobrenome = "Silva"

    mutavel = 15 //OK
    imutavel = 15 // Erro! Não é permitido

    println("$mutavel, $imutavel")
    
    if(true){
        val sobrenome = "Silva"
        println("$sobrenome")
    }
}