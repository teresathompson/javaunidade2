public class Break {

    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 6, 4 };

        for (int numero : numeros) {

            if (numero > 5) {

                break;

            }

            System.out.println("Número: " + numero);

        }

    }

}