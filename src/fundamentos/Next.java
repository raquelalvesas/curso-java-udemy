package fundamentos;

import java.util.Scanner;

public class Next {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");

        int idade = teclado.nextInt();

        teclado.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.

        System.out.println("Qual o seu nome?");

        String nome = teclado.nextLine();

        System.out.println("Qual o seu sobrenome?");

        String sobrenome = teclado.nextLine();

        teclado.close();
    }
}
