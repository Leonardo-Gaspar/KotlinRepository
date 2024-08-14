fun main() {
        
    println("Digite a temperatura em celsius:")
    val celsiu = readLine()!!.toDouble()

    val fahrenheit = (celsiu*9/5) + 32
    val kelvin = celsiu + 273.15

    println("A temperatura em celsius eh: $celsiu, em fahrenheit eh: $fahrenheit, em kelven eh: $kelvin")
    
}