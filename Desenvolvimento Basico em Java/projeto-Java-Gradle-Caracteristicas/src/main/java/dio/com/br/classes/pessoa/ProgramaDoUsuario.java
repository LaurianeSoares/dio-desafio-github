package dio.com.br.classes.pessoa;

import dio.com.br.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args){
        final var batman = new SuperUsuario("batman", "123456");
        batman.getLogin();
        //batman.getSenha();  //erro
        //String nomeDoCliente = batman.nome; //erro
    }


}
