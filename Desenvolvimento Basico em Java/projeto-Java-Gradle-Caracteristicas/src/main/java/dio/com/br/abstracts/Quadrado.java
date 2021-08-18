package dio.com.br.abstracts;
import java.lang.StringBuilder;

public class Quadrado extends FormaGeometrica {
    private String nome;
    private Double area;

    public Quadrado(final String nome, final Double area){
        this.nome = nome;
        this.area = area;

    }


    public String toString() {
        final String builder = "Quadrado [" + "nome= " + nome + " " + ", area = " + area + "]";
        return builder.toString();
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double area() {
        return area;
    }
}
