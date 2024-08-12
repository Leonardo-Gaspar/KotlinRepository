//Comentário em Linha 

/*Comentário em bloco */ 

fun main() {
    //Declaração de variável
    var idade = 20 
    var altura = 1.88f //Usando 'f' para indicar que é um float
    var inicial = 'L'

    //Impressão das informações do indivíduo usando interpolação de strings
    println("minha inicial é $inicial, tenho $idade anos e minha altura é de %.2f".format(altura))
}