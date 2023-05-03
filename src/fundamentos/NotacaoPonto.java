package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

         /*
        TODO = Tipos primitivos não tem o operador "."
         Exemplo.:
         int a = 3;
         System.out.println(a);
         */

        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Leo".toUpperCase();

        System.out.println(x);

        String y = "Bom dia X".replace("x", "Gui").toUpperCase().concat("!!!");

        System.out.println(y);



    }
}
