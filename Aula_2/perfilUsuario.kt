fun main(){
    var status= true
    
    println("Digite ao seu nome:")
    val nome = readLine()!!.toString()
    
    println("Digite a sua idade:")
    val idade = readLine()!!.toString()

    println("Digite seu email:")
    val email = readLine()!!.toString()

    println("Nome do usuario: $nome\nidade: $idade\nemail: $email\natividade status: $status")

}