import java.util.Locale;

public class Pessoa {

    /* Construtor é um trecho de código que é chamado quando a classe é instanciada,
       podendo passar n variáveis para a classe criada */
    public Pessoa(String nome, int dataNascimento) {
    }

    //Escrever a função principal somente para chamar a classe
    public static void main(String[] args){

        Pessoa p = new Pessoa("william",1994);
        //Fazer localização ou internacionalização do código, usa o mesmo conceito de construtor secundário do kotlin
        Locale locale = new Locale("pt");

    }
}
