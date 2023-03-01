    import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Número: ");
        int n = scan.nextInt();

        System.out.println("Primeiro múltiplo: " + n * 1);
        System.out.println("Segundo múltiplo: " + n * 2);
        System.out.println("Terceiro múltiplo: " + n * 3);

        scan.close();
    }
    
}
