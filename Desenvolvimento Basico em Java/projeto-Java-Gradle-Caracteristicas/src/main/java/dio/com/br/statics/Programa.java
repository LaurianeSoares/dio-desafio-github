package dio.com.br.statics;

public class Programa {
    public static void main (String [] args){
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bípede";

        final Cachorro viraLatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLatas.zoologia);

        System.out.println(Cachorro.late());
    }
}
