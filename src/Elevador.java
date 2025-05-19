public class Elevador {

    private int andar_maximo;
    private int andar_atual;
    private int capacidade;
    private int pessoas_presentes;

    public Elevador(int andar_atual, int capacidade, int pessoas_presentes, int andar_maximo) {
        this.andar_atual = andar_atual;
        this.capacidade = capacidade;
        this.pessoas_presentes = pessoas_presentes;
        this.andar_maximo = andar_maximo;
    }

    public int getPessoas_presentes() {
        return pessoas_presentes;
    }

    public void setPessoas_presentes(int pessoas_presentes) {
        this.pessoas_presentes = pessoas_presentes;
    }

    public int getAndar_maximo() {
        return andar_maximo;
    }

    public void setAndar_maximo(int andar_maximo) {
        this.andar_maximo = andar_maximo;
    }

    public int getAndar_atual() {

        return andar_atual;
    }

    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    //metodo entrar pessoa no elevador (+1 pessoa, mas se estiver cheio)

    public void entrar_elevador(int pessoa) {
        if (pessoas_presentes + pessoa <= capacidade) {
            pessoas_presentes += pessoa;
        } else {
            System.out.println("Capacidade excedida! Só cabem mais " + (capacidade - pessoas_presentes) + " pessoas.");
        }
    }

    //metodo sair pessoa no elevador (-1 pessoa, menos se estiver vazio )

    public void sair_elevador(int pessoa) {
        if (pessoas_presentes - pessoa >= 0) {
            pessoas_presentes -= pessoa;
        } else {
            System.out.println("Erro: não há tantas pessoas no elevador para sair.");
        }
    }

    //metodo decer (-1 andar, se estiver no terreo não desce mais)

    public void descer_andar_elevador() {
        if (andar_atual > 0) {
            andar_atual--;
        } else {
            System.out.println("Já está no térreo!");
        }
    }

    //metodo subir (+1 andar, se estiver no ultimo andar não pode subir mais)

    public void subir_andar_elevador() {
        if (andar_atual < andar_maximo) {
            andar_atual++;
        } else {
            System.out.println("Já está no último andar!");
        }
    }

}

