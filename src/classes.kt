class pessoa1

class pessoa2 (var nome: String, val anoNascimento: Int)  //Definir os atributos para cada classe dentro dos parenteses, parecido com a função, porém esta não usa var ou val

class pessoa3 (var nome: String) {

    //Para criar um construtor secundário, basta escrever:
    constructor(nome: String, anoNascimento: Int): this(nome)

    fun saudacao(){
        println("Olá! meu nome é $nome")
    }
}

fun main() {

    /* Classe é algo que define os comportamentos e atributos. Os comportamentos são
       métodos que se traduzem em funções no nosso código, enquanto os atributos se
       traduzem em variáveis. Pode existir classes com os mesmo nomes, mas não estão
       no mesmo local do projeto. Assemelham-se a uma palavra com dois significados,
       basta sabermos o contexto em cada qual é utilizada. */

    //Instanciando uma classe no Kotlin:
    val p1: pessoa3 = pessoa3("William", 1994)
    val p2: pessoa3 = pessoa3("Tony")
    println(p1.nome)
    //println(pessoa.anoNascimento)

    p2.saudacao()

    /* Quando se instancia uma classe, você tem um objeto, criando uma classe
    *  com os valores que você irá passar como parâmetro.  */

}
