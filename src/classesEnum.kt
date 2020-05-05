enum class Prioridade1 {
    /* A classe Enum nos permite enumerar, listar possibilidades que a gente pode
    * ter de valores. É um tipo de classe que tem um conjunto de valores constantes.
    * Exemplo simples que não deve ser novidade para você, exceto pela palavra class a mais: */

    BAIXA, MEDIA, ALTA
}
//Override
enum class Prioridade2(var id: Int){ //Pode ter construtor
    BAIXA(1){
        override fun toString(): String {
            return "super baixa, não se preocupe"
        }
    },
    MEDIA(5), ALTA(10)
}

class Alarme(var des:String, p:Prioridade2)

fun main() {

    //println(Prioridade1.BAIXA)
    for(p in Prioridade2.values()) {

        if (p.toString() == "MEDIA") println("Essa é verdade")

        println("$p - ${p.id} - ${p.ordinal}") //Pode ter funções e propriedades. Ordinal se refere à posição do atributo dentro da classe
    }
    Alarme("Aviso!", Prioridade2.ALTA)



}