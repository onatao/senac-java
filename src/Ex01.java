    import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        double n1 = scan.nextDouble();
        
        System.out.println("Segundo valor: ");
        double n2 = scan.nextDouble();
        
        System.out.println("Terceiro valor: ");
        double n3 = scan.nextDouble();

        double product = n1 * n2 * n3;
        System.out.println(product);

        scan.close();
    }
}
