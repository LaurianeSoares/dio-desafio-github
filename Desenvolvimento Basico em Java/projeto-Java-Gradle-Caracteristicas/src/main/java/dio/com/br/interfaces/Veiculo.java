package dio.com.br.interfaces;

public interface Veiculo {
    String registro();

    default void ligar() {
        System.out.println("Ligando o Veículo!");
    }

    //void desligar();
    //default void desligar(){
     //       System.out.println("Desligando o Veículo!!");
    //}
    }

