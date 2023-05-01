package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {

         /*
        TODO = temos 8 tipos primitovos no Java, sendo 6 do tipos numéricos(sendo 4 = Byte(1), Short(2), Int(4) e long(8), Float(4 Bytes) e Double(8 Bytes)),
          e 1 do tipo booleano(V ou F) e 1 do tipo caractere("" '')
         */

        // Tipos numériocos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVooas = 542;
        int id = 56789;
        long pontosAcumulados = 3_123_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; //ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVooas / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        // Salário
        System.out.println(id + ": ganha -> " + salario);

        // Férias?
        System.out.println("Férias? " + estaDeFerias);

        System.out.println("Status? " + status);


    }
}
