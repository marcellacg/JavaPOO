package MeuPacote;

public class Retangulo {
    //atributos
    private double comprimento, largura, area, perimetro;

    //construtor
    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    //get e set
    public double getComprimento(){
        return comprimento;
    }

    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double calcularArea(){
        return area = comprimento * largura;
    }

    public double calcularPerimetro(){
        return perimetro = (comprimento * 2) + (largura * 2);
    }

    public String toString(){
        return "O perímetro é: " + perimetro + "A area é: " + area;
    }
}
