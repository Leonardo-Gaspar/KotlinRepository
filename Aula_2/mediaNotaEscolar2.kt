fun main(){
    val nota1 = 8.5
    val nota2 = 7.0
    val nota3 = 9.2

    val media = (nota1 + nota2 + nota3) / 3
    val mediaFormatada = String.format("%.2f", media)

    println("A media eh: $media ou a media formatada eh: $mediaFormatada")
}