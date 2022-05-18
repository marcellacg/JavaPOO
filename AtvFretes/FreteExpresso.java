package fretes.cadastro;

public class FreteExpresso extends Frete {
    private double nivelDeUrgencia;

    public FreteExpresso(double distanciaKm, double valorPorKm, double nivelDeUrgencia){
        super(distanciaKm, valorPorKm);
    }

    public double getNivelDeUrgencia() { return nivelDeUrgencia; }

    @Override
    public double calcularFrete(double distancia, double valorPorKm){
        distancia = super.getDistancia();
        valorPorKm = super.getValorPorKm();

        var total = ((distancia*valorPorKm) + (this.getNivelDeUrgencia() * 100));

        return total;
    }
}
