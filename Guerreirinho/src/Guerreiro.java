import java.util.Random;

public class Guerreiro {
    private String nome;
    private int energia, codigo;

    public Guerreiro(String nome, int codigo) {
        this.nome = nome;
        this.energia = 5;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void incremento(){
        if(this.energia > 0 && this.energia <= 5){
            this.energia++;
        } if (this.energia > 5){
            this.energia = 5;
            System.out.println("Energia máxima.");
        }
    }

    public void decremento(){
        if(this.energia > 0 && this.energia <= 5){
            this.energia--;
        } if(this.energia < 0){
            this.energia = 0;
            System.out.println("Guerreiro sem energia");
        }
    }

    public void alimentar(){
        incremento();
    }

    public int atacar(){
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(0, 2);
        return valor;
    }

    public void lutar(Guerreiro oponente){
        if(atacar() == 1){
            oponente.decremento();
        }
    }

    public String toString() {
        return "Nome do Guerreiro: " + nome + "\n" +
                "Energia: " + energia + "\n" +
                "Codigo: " + codigo;
    }
}
















