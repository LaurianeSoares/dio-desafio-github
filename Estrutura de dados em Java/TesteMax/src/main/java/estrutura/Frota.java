package estrutura;

public class Frota<T> {
    private Caminhao<T> caminhao;

    public Frota(){
        this.caminhao = null;
    }

    public void incluir (T object){

        Caminhao novoCaminhao = new Caminhao(object);
        novoCaminhao.setTipo(caminhao);
        caminhao = novoCaminhao;

    }

    @Override
    public String toString() {
        String stringRetorno = "";
        Caminhao auxiliar = caminhao;
        if (caminhao != null) {
            while (true) {
                stringRetorno += "[Caminhão{Objeto=" + auxiliar.getObject() + "}]-->";
                if (auxiliar.getTipo() != null) {
                    auxiliar = auxiliar.getTipo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }

        } else {
            stringRetorno = null;
        }
        return stringRetorno;
    }
}