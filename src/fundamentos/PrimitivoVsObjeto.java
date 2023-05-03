package fundamentos;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {

          /*
        TODO = Wrappers são a versão objeto dos tipos primitivos!
         */

        String s = new String("texto");
        s.toUpperCase();

        int a = 123;

        System.out.println(a);
    }
}
