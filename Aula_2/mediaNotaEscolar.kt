fun mediaNotaEscolar(nota1: Double, nota2: Double, nota3: Double): Double{
    var nota1 = nota1
    var nota2 = nota2
    var nota3 = nota3

    var mediaNotas: Double = (nota1 + nota2 + nota3)/3.0
    return mediaNotas
}
fun main(){
    var resultadoMedia = mediaNotaEscolar(7.5, 4.5, 9.0)
    println("A media do aluno eh: $resultadoMedia")
}