import one.innovation.digital.innovation.imc.CalculadorDeImc;
import one.innovation.digital.pessoa.Pessoa;

public class Programa {
   public static void main (String[] args){
       final Pessoa pessoa = new Pessoa("ANDRE", 1.63, 52.0);
       final var calculadoraDeImc = new CalculadorDeImc();
       final var imc = calculadoraDeImc.calcula(pessoa);
       System.out.println("IMC = " + imc);
   }

}


