import java.util.Scanner;

public class ExAll {
    public static void main(String[] args) {
        // Exercicio 01
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        double n1 = scan.nextDouble();
        
        System.out.println("Segundo valor: ");
        double n2 = scan.nextDouble();
        
        System.out.println("Terceiro valor: ");
        double n3 = scan.nextDouble();

        double product = n1 * n2 * n3;
        System.out.println(product);

        // Exercicio 02
        System.out.println("Número: ");
        int n = scan.nextInt();

        System.out.println("Primeiro múltiplo: " + n * 1);
        System.out.println("Segundo múltiplo: " + n * 2);
        System.out.println("Terceiro múltiplo: " + n * 3);

        // Exercicio 03 
        System.out.println("Informe um valor entre 1 e  10.");
        int value = scan.nextInt();
        
        System.out.println(value + " x " + "1" + " = " + value*1);
        System.out.println(value + " x " + "2" + " = " + value*2);
        System.out.println(value + " x " + "3" + " = " + value*3);
        System.out.println(value + " x " + "4" + " = " + value*4);
        System.out.println(value + " x " + "5" + " = " + value*5);
        System.out.println(value + " x " + "6" + " = " + value*6);
        System.out.println(value + " x " + "7" + " = " + value*7);
        System.out.println(value + " x " + "8" + " = " + value*8);
        System.out.println(value + " x " + "9" + " = " + value*9);
        System.out.println(value + " x " + "10" + " = " + value*10);

        // Exercicio 04 
        System.out.println("Digite uma palavra: ");
        String word = scan.next();

        System.out.println("A palavra " + word + " possui " + word.length() + " caracteres.");

        scan.close();
    }
}