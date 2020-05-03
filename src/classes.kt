class pessoa1

class pessoa2 (var nome: String, val anoNascimento: Int)  //Definir os atributos para cada classe dentro dos parenteses, parecido com a função, porém esta não usa var ou val

class pessoa3 (var nome: String) {

    var anoNascimento:Int? = null

    //Para criar um construtor secundário, basta escrever:
    constructor(nome: String, anoNascimento: Int): this(nome){
        this.anoNascimento = anoNascimento
    }

    fun saudacao(){
        println("Olá! meu nome é $nome")
        println(anoNascimento) //A função da classe pessoa3 pode acessar o parâmetro da construção secundária caso declare que ela possa ser nula
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
    println(p1.anoNascimento)

    p1.saudacao()
    p2.saudacao()

    /* Quando se instancia uma classe, você tem um objeto, criando uma classe
    *  com os valores que você irá passar como parâmetro.  */

}
