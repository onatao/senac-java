import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
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
        
       scan.close();
    }
    
}
