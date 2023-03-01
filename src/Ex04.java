import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String word = scan.next();

        System.out.println("A palavra " + word + " possui " + word.length() + " caracteres.");

        scan.close();
    }
    
}
