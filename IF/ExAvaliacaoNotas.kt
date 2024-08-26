// Exercício avaliação de notas 
fun main(){
    println("Digite a sua primeira nota: ")
    val primeiraNotaString = readLine()
    val primeiraNota: Float? = primeiraNotaString?.toFloatOrNull()

    if (primeiraNota == null) {
        println("Entrada inválida para a primeira nota.")
        return
    }

    println("Digite a sua segunda nota: ")
    val segundaNotaString = readLine()
    val segundaNota: Float? = segundaNotaString?.toFloatOrNull()

    if (segundaNota == null) {
        println("Entrada inválida para a segunda nota.")
        return
    }

    val mediaGeral: Float = (primeiraNota + segundaNota) / 2

    //Usando when para avaliar o conceito de nota
    val conceito = when (mediaGeral){
        in 0f..4.9f -> "F"
        in 5f..5.9f -> "D"
        in 6f..6.9f -> "C"
        in 7f..7.9f -> "B"
        in 8f..10.0f -> "A"
        else -> "Nota invalida"
    }

    println("Sua nota é $mediaGeral, $conceito")

}