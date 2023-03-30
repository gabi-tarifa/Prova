import java.util.Scanner;       //Eu deixei alguns comentários em bloco para a sr.
public class exercicioProva {   //ver as alterações que fiz pq o codigo nao deixava ir
    public static double valor1 = 0, valor2 = 0;
    public static int op = 0;
    public static Scanner scanner = new Scanner(System.in);
    public static double res = 0;
    public static boolean tORf = true;
    public static void main(String[] args) {
        ex1();
        ex2();
    }
    public static void retorno(/*double res*/) {
        switch (op) {
            case 1:
                res = valor1 + valor2;
                break;
            case 2:
                res = valor1 - valor2;
                break;
            case 3:
                res = valor1 * valor2;
                break;
            case 4:
                res = valor1 / valor2;
                break;
            default:
                tORf = false;
        }
    }
    public static void ex1() {
        System.out.print("Insira o primeiro valor: ");
        valor1 = scanner.nextDouble();
        System.out.print("Insira o segundo valor: ");
        valor2 = scanner.nextDouble();
        System.out.println("Insira o número da operação(1 = adição//2 = subtração//3 = multiplicação//4 = divisão)");
        op = scanner.nextInt();
        retorno(/*res*/);
        if (tORf) {
            System.out.println("O valor da operação " + op + " foi " + res);
        } else {
            System.out.println("Operação inválida");
        }
    }
    public static void ex2() {
        int x = 0, y = 0;
        int i = 0, j = 0;
        int numero = 0;

        System.out.println("Insira a largura da matriz");
        x = scanner.nextInt();
        System.out.println("Insira a altura da matriz");
        y = scanner.nextInt();

        int matriz[][] = new int[x][y];

        for (j=0; j<y; j++) {
            for (i=0; i<x; i++) {
                matriz[i][j] = numero;
                numero++;
            }
        }
        for (j=0; j<y; j++) {
            for (i=0; i<x; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}

