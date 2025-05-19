//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Elevador elevadorBanco = new Elevador(0,10,0,6);


        elevadorBanco.entrar_elevador(3);
        elevadorBanco.entrar_elevador(3);
        System.out.println("Andar atual" + elevadorBanco.getAndar_atual());
        System.out.println("Quantidade de pessoas no elevador" + elevadorBanco.getPessoas_presentes());
        elevadorBanco.descer_andar_elevador();
        System.out.println("Andar atual" + elevadorBanco.getAndar_atual());
        elevadorBanco.subir_andar_elevador();
        System.out.println("Andar atual" + elevadorBanco.getAndar_atual());
        elevadorBanco.subir_andar_elevador();
        System.out.println("Andar atual" + elevadorBanco.getAndar_atual());
        elevadorBanco.subir_andar_elevador();
        System.out.println("Andar atual" + elevadorBanco.getAndar_atual());
        System.out.println("Quantidade de pessoas no elevador" + elevadorBanco.getPessoas_presentes());
        elevadorBanco.sair_elevador(2);

    }
}