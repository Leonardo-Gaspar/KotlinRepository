//Exercício para comanda 

fun main(){
    val precoCoxinha = 5f
    val precoCerveja = 15f

    println("Digite a quantidade de coxinhas pedidas:")
    val qtdCoxinhaInput = readLine()

    if (qtdCoxinhaInput.isNullOrBlank()) {
        println("O campo não pode ser nulo ou vazio.")
        return
    }

    val qtdCoxinha = qtdCoxinhaInput.toIntOrNull()

    // Verifica se a conversão foi bem-sucedida
    if (qtdCoxinha == null) {
        println("Por favor, insira um número inteiro válido.")
        return
    }else if(qtdCoxinha <= 0){
        println("Por favor, insira um número maior que 0")
        return
    }

    println("Digite a quantidade de cervejas pedidas:")
    val qtdCervejaInput = readLine()

    if (qtdCervejaInput.isNullOrBlank()) {
        println("O campo não pode ser nulo ou vazio.")
        return
    }

    val qtdCerveja = qtdCervejaInput.toIntOrNull()

    // Verifica se a conversão foi bem-sucedida
    if (qtdCerveja == null) {
        println("Por favor, insira um número inteiro válido.")
        return
    }else if(qtdCerveja <= 0){
        println("Por favor, insira um número maior que 0")
        return
    }
    val precoCoxinhaSolo = (precoCoxinha*qtdCoxinha)

    val precoCervejaSolo = (precoCerveja*qtdCerveja)

    val valorConta = precoCoxinhaSolo + precoCervejaSolo

    val valorTaxa = String.format("%.2f",valorConta * 0.10)

    val valorComTaxa = String.format("%.2f", valorConta * 1.10)


    println("-------------------------")
    println("\t'Console'\t")
    println("-------------------------")
    println(".|\tLanchonete do Leo\t|.")
    println("-------------------------")
    println("$qtdCoxinha coxinhas\tR$ $precoCoxinhaSolo   ")
    println("$qtdCerveja cervejas\tR$ $precoCervejaSolo   ")
    println("Somatória\tR$ $valorConta")
    println("Taxa 10%\tR$ $valorTaxa")
    println("-------------------------")
    println("Conta Final\tR$ $valorComTaxa")
   
}