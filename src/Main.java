import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userNum;
        final Scanner SC = new Scanner(System.in); 
        
        System.out.println("Introduzca un numero: ");
        userNum = SC.nextInt();
        
        System.out.println("Hola mundo, su numero es: " + userNum);

        SC.close();
    }
}
