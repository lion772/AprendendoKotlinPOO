
class Quadrado(val area: Float){
    /*override fun toString(): String {
        return "Quadrado(area = $area)" //Para poder visualizar o dado da mesma forma que o data class, teria que fazer essa override, caso contrário retornará uma string que não dará para entender
    }*/

    /*override fun equals(other: Any?): Boolean { //Teria que sobreescrever essa função para poder comparar os valores das classes
        return super.equals(other)
    }*/
}

data class Triangulo(val area: Float) //Data class representa uma classe que transita dados, a mesma pode ter funções, mas é recomendado que a class as tenha, por convenção a data class não tem, somente transita dados

data class Param(var b: Boolean, var s: String, var i: Int) //Data class facilita a visualização de dados
fun teste(p: Param){
    Param(false, "", 10)
}


fun main() {

    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    val t1 = Triangulo(10f)
    val t2 = Triangulo(10f)

    println(q1)
    println(t1)
    println(q1 == q2)
    println(t1 == t2) //o data class faz comparação dos valores das classes, e não da posição destas na memória, por isso dá false em q1/q2 e dá true em t1/t2. Isso ajuda quando se tem muitos parâmetros para se comparar
    println(q1.hashCode())
    println(q2.hashCode())
    println(t1.hashCode())//novamente aqui retorna valores iguais, diferente dos objetos q1/q2, que retornam valores ou hashcodes diferentes
    println(t2.hashCode())

    //copy
    val t3 = t2.copy() //caso copiar os valores de uma classe para outra, com copy() vc faz uma instância de uma nova classe e copia os valores, somente o data class possui essa vantagem
    println(t3)
}