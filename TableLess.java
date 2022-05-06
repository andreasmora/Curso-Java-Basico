import java.util.Scanner;

public class TableLess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Digite 03 numeros inteiros: ");


        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a < b && a < c) {
            System.out.println(" MENOR = " + a);
        } else if (b > c) {
            System.out.println(" MENOR = " + b);
        } else if (c > b) {
            System.out.println(" MAIOR = " + c);
        } else {
            System.out.println(" Todos sao iguais! ");
        }
        scan.close();
    }
}