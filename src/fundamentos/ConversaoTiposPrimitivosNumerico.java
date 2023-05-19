package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

    public static void main(String[] args) {

        /* Conversão implícita */
        double a = 1;
        System.out.println(a);

        /* Conversão explícita (CAST) */
        float b = (float) 1.2345678888;
        System.out.println(b);

        int c = 127;
        byte d = (byte) c;
        System.out.println(d);

    }
}
