//Classe: Classificador/agrupador, um conjunto de objetos

/*Classe abstrata: por definição ela não gera objetos (não instanciada) e é dessa forma empregada
 como superclasse, com características equivalentes de classe. Seus métodos também são abstratos,
 onde seus herdeiros obrigatoriamente os implementam.*/
public abstract class Brinquedo implements BrinquedoMovivel {
    /*Atributo: São as características, um conjunto de
    informações dos supracitados objetos,
    onde iremos guardar suas respectivas propriedades.*/
    private int velocidade;
    private int aceleracao;

    public Brinquedo(int velocidade, int aceleracao) {
        //Construtor: constroi objetos, a partir dele que acessamos tudo dentro de uma classe
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }
}
