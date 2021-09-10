package dio.com.br.interfaces;

public interface Carro extends Automovel{
    String marca() ;
    Double valor();

    default void ligar(){
        System.out.println("Ligando o carro!!");
    }

    default String codigoRenavan(){
        return "5465468454";
    }
}
