//Exercise Searching in Array

fun main(){

    //String Array

    val names = arrayOf("Alice", "Bob", "Charlie", "David", "Emma")

    println("Digite o nome que deseja procurar:")
    val searchName = readLine()!!.toString()    //Elemento a ser buscado
    
    var found = false //variável para verificar se o elemento fo encontrado

    //Loop para verificar se o elemento está presente
    for (name in names) {
        if (name == searchName) {
            found = true
            break
        }
    }

    //Verificar se o elemento foi encontrado

    if(found){
        println("$searchName foi encontrado no Array")
    }else{
        println("$searchName não foi encontrado no Array")
    }
}