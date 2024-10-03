
// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    for (;;) {
    System.out.println("Escoje una operación a realizar:");

    System.out.println("1.Suma");
    System.out.println("2.Resta");
    System.out.println("3.Multiplicación");
    System.out.println("4.División");

    

      int numEntero = Integer.parseInt(stdIn.readLine());

      
      if (numEntero == 1) {
        // Suma
        System.out.println("Ingresa el primer número:");
        int num1 = Integer.parseInt(stdIn.readLine());
        System.out.println("Ingresa el segundo número:");
        int num2 = Integer.parseInt(stdIn.readLine());
        System.out.println("El resultado es:" + (num1 + num2));
      }else if (numEntero == 2) {
        // Resta
        System.out.println("Ingresa el primer número:");
        int num1 = Integer.parseInt(stdIn.readLine());
        System.out.println("Ingresa el segundo número:");
        int num2 = Integer.parseInt(stdIn.readLine());
        System.out.println("El resultado es:" + (num1 - num2));
      }else if (numEntero == 3) {
        // Multiplicación
        System.out.println("Ingresa el primer número:");
        int num1 = Integer.parseInt(stdIn.readLine());
        System.out.println("Ingresa el segundo número:");
        int num2 = Integer.parseInt(stdIn.readLine());
        System.out.println("El resultado es:" + (num1 * num2));
      }else if (numEntero == 4) {
        // División 
        System.out.println("Ingresa el primer número:");
        int num1 = Integer.parseInt(stdIn.readLine());
        System.out.println("Ingresa el segundo número:");
        int num2 = Integer.parseInt(stdIn.readLine());
        if(num2==0){
          System.out.println("Error");
        }else{
        System.out.println("El resultado es:" + (num1 / num2));
        }
      }else if (numEntero != 4 || numEntero != 3 ||numEntero != 2 || numEntero != 1){
        System.out.println("Error");
      }

    }
  }
}
// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }
