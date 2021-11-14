package estrutura;

public class Caminhao <T> {
    private T object;
    private Caminhao<T> tipo;



    public Caminhao(){
    }



    public Caminhao(T object) {
        this.tipo = null;
        this.object = object;

    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Caminhao getTipo() {
        return tipo;
    }

    public void setTipo(Caminhao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "object=" + object +
                '}';
    }
}
