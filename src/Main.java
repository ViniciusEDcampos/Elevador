//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Elevador elevadorBanco = new Elevador(0,10,0,4);

        //Entrada de 6 pessoas no elevador
        elevadorBanco.entrar_elevador(10);

        //Entrada de 2 pessoas(tratamento de erro para testar de a capacidade trava na 10)
        elevadorBanco.entrar_elevador(2);

        //identificação de qual andar está o elevador
        System.out.println("Andar atual: " + (elevadorBanco.getAndar_atual() == 0 ? "Térreo" : elevadorBanco.getAndar_atual()));

        //identificação de quantas pessoas estão no elevador
        System.out.println("Quantidade de pessoas no elevador " + elevadorBanco.getPessoas_presentes());

        //metodo para descer um andar(tentativa de erro, para descer abaixo do terreo)
        elevadorBanco.descer_andar_elevador();

        //metodo para subir um andar
        elevadorBanco.subir_andar_elevador();

        //impressão de qual andar o elevador esta
        System.out.println("Andar atual: " + elevadorBanco.getAndar_atual());

        //subindo mais um andar com o metodo
        elevadorBanco.subir_andar_elevador();

        //impressão de qual andar o elevador esta
        System.out.println("Andar atual: " + elevadorBanco.getAndar_atual());

        //subindo mais um andar com o metodo
        elevadorBanco.subir_andar_elevador();

        //impressão de qual andar o elevador esta
        System.out.println("Andar atual: " + elevadorBanco.getAndar_atual());

        //saida de 2 pessoas do elevador
        elevadorBanco.sair_elevador(2);

        // pegando o valor de quantas pessoas estão ocupando o elevador
        System.out.println("Quantidade de pessoas no elevador: " + elevadorBanco.getPessoas_presentes());


        //tentativa de subir mais andares do que o possivel(tentativa de erro)
        elevadorBanco.subir_andar_elevador();

    }
}