fun main(){

    //Criando uma lista mutavel de numeros inteiros vazios
    var numeros = mutableListOf<Int>()

    // Adicionando elementos à lista

    numeros.add(1)
    numeros.add(2)
    numeros.add(3)

    // Exibindo a lista de números 
    println("Lista de numeros: $numeros")

    //Removendo um elemento da lista
    numeros.removeAt(1)

    //Exibindo a lista após a remoção
    println("Lista de numeros após a remoção: $numeros")


}