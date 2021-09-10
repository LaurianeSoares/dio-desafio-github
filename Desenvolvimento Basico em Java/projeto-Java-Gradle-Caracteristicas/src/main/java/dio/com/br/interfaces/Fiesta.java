package dio.com.br.interfaces;

public class Fiesta implements Veiculo, Carro {
    @Override
    public String registro() {
        return "123AFG547TR";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }

    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public Double valor() {
        Double valor = 35000.0;
        return valor;
    }
}
