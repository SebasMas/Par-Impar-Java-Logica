package CursoJava.Practicas;
import java.util.Scanner;


public class Practica4 {

    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un número: ");
            int n = sc.nextInt();

            if (n % 2 == 0){
                System.out.println("Es par");
            }else{
                System.out.println("Es impar");
            }
        }

    

    }
    
}
