package introducao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Aula01 {
    public static void main(String[] args){
        try{
            new java.io.FileInputStream("arquivo.txt");

        }catch (java.io.FileNotFoundException e){
            System.out.println("Não foi possível abrir o arquivo para leitura");
        }


        //02

       /* try {
            PreparedStatement stmt = con.prepareStatement(query);
        }catch (SQLException e){
            throw new AcessoADadosException("Problema na criação do Statement", e);

        }*/

        //03

        try{
            CarroVo carro = new CarroVo();
            carro.getPlaca();

        }catch (IntegrationException e){
            throw new BusinessException("Erro na criação do objeto", e);
        }

    }
}
