// Exercício - Maior ou Menor de idade

fun main(){

    //Solicita ao usuário para digitar a idade
    println("Digite sua idade:")
    val idadeInput = readLine()

    //Verifica se o usuário digitou algo
    if (idadeInput == null){
        println("Entrada invalida")
        return
    }

    //Converte a string em int
    val idade = idadeInput.toIntOrNull()

    //Verifica se o que foi escrito é Int
    if (idade == null){
        println("Entrada invalida. Por Favor, insira um número válido.")
        return
    }

    //Verifica a idade
    if (idade >= 18){

    println("Voce eh maior de idade ")
    }else{
        println("Voce eh menor de idade")
    }

}