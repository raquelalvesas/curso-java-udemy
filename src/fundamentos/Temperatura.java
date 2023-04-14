package fundamentos;

public class Temperatura {

    public static void main(String[] args) {

        final  double Ajuste = 32;
        final double Multiplicador = 5.0/9.0;

        double fahrenheit = 86;
        double celsius = (fahrenheit - Ajuste) * Multiplicador;

        System.out.println("A 1ª temperatura  é: " + celsius + "ºC");

        fahrenheit = 0;
        celsius = (fahrenheit - Ajuste) * Multiplicador;

        System.out.println("A 2ª temperatura é: " + celsius + "ºC");
    }
}
