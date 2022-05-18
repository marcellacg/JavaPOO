package fretes.cadastro;

public class FreteSuperExpresso extends Frete {
    private double valorDoSeguro;
    private double nivelDeUrgencia;

    public FreteSuperExpresso(double distancia, double valorPorKm, double valorDoSeguro, double nivelDeUrgencia){
        super(distancia, valorPorKm);
        this.valorDoSeguro = valorDoSeguro;
        this.nivelDeUrgencia = nivelDeUrgencia;
    }

    public double getValorDoSeguro() {
        return valorDoSeguro;
    }

    public double getNivelDeUrgencia(){
        return nivelDeUrgencia;
    }

    @Override
    public double calcularFrete(double distancia, double valorPorKm){
        distancia = super.getDistancia();
        valorPorKm = super.getValorPorKm();

        var total = ((distancia * valorPorKm) + (this.nivelDeUrgencia * 100) + this.valorDoSeguro);

        return total;
    }
}
