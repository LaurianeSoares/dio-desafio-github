package fors;

public class While {
    public static void main(String[] ars) {
        var x = 0;

        //Testa a condição antes
        while (x < 1) {
            System.out.println("Dentro do While...");
            x++;
        }

        var y = 0;
        //Testa a condição depois
        do {
            System.out.println("Dentro do Do/While...");
        } while (y++ < 1);

    }


}

