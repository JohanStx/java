import java.util.Scanner;

public class PruebaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingresa tu edad: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ingresa tu nombre: ");
        String name = scanner.nextLine();

        if (num < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }

        System.out.println("tu edad es: " + num);
        System.out.println("tu nombre es: " + name);
    
    }
}