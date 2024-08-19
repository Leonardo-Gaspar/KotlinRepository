fun main(){
    //Trabalhando com array (Vetores, Matrizes, Coleções ou listas)
    //Tipo de dado que permite armazenar múltiplos valores em uma mesma variável

    //Declara~çao de um Array
    //var NomeDaVariavel = ArrayOf(valor, valor,valor)

    val idades = arrayOf(8, 36, 42)

    //Acesso à uma posição específica do Array
    println("O registro ZERO de idade é: ${idades[0]}")
    println("O registro UM de idade é: ${idades[1]}")
    println("O registro DOIS de idade é: ${idades[2]}")

    val alturas = FloatArray(256)

    //Outra forma de declaração e atribuição de valores a um Array
    alturas[0] = 1.71f 
    alturas[1] = 1.62f
    alturas[2] = 1.53f
    alturas[3] = 1.84f
    alturas[4] = 1.92f

    //Imprimindo o primeiro valor registro de altura

    println("O registro ZERO de alturas é: %.2f".format(alturas[0]))
    println("O registro UM de alturas é: %.2f".format(alturas[1]))
    println("O registro DOIS de alturas é: %.2f".format(alturas[2]))
    println("O registro TRES de alturas é: %.2f".format(alturas[3]))
    println("O registro QUATRO de alturas é: %.2f".format(alturas[4]))

    //Outra forma de declaração de atribuição de valor de Array
    val nomes = charArrayOf('V', 'I', 'N', 'N', 'Y')

    println("O registro ZERO de nomes é: ${nomes[0]} ")
    println("O registro UM de nomes é: ${nomes[1]} ")
    println("O registro DOIS de nomes é: ${nomes[2]} ")
    println("O registro TRES de nomes é: ${nomes[3]} ")
    println("O registro QUATRO de nomes é: ${nomes[4]} ")
    

    //Tamanho
    var tamanho: Int
    tamanho = nomes.size
    println("Tamanho do último caractere de nome é : $tamanho")


    //Nós temos 3 posições de memória sendo utilizadas
    println("Quantidade de itens: ${idades.size}")

    //Quantos bytes estão sendo utilizados
    println("Quantidade de bytes: ${idades.size * 4}bytes") // um int possui 4 bytes de tamanho

    
}