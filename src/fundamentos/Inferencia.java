package fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5;

        System.out.println("O valor é: " + a);

        /*
        TODO = infere o tipo pelo o valor que colocamos na variavél
         */
        var b = 3.6;

        System.out.println("O valor é: " + b);

        var c = "Texto";

        System.out.println("O valor é: " + c);

        double d; // variável declarada
        d = 123.65; // variável foi inicializada

        System.out.println("O valor é: " + d); // usada
    }
}
