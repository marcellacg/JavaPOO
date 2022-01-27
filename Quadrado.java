package MeuPacote;

public class Quadrado {
    //atributos
    private double lado, area, perimetro;
    //construtor
    public Quadrado(double lado){
        this.lado = lado;
    }

    //get e set

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double calcularArea(){
        return area = lado * lado;
    }

    public double calcularPerimetro(){
        return perimetro = lado * 4;
    }

    public String toString(){
        return "A area é: " + area + "O lado é: " + lado + "O perímetro é: " + perimetro;
    }
}
