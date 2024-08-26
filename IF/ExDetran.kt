//Exercicio Detran
// Exercício que verifica se o usuario é maior ou menor de idade

fun main(){

    println("Digite a sua idade:")
    val idade = readLine()

    if(nomeUsuario.isNullOrBlank()){
        println("O campo nao pode ser nulo")
        return 
    }

    println("Voce possui CNH? (s or n)")
    val possuiCNHInput = readLine()

    if (possuiCNHInput == "s" || possuiCNHInput == "sim"){
        possuiCNH = true
    }else{
        possuiCNH = false
    }

    //verificar se a pessoa é maior de idade e possui CNH
    if(idade >= 18 && possuiCNH == true){
        println("Voce pode dirigir")
    }else{
        println("Voce nao pode dirigir")
    }

}
