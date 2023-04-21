package CursoJava.Practicas;


public class Practica5 {

    //Crear un programa que muestre en pantalla los 100 primeros números primos

    public static void main(String[] args){

        //El resultado va a ser mostrado como una cadena de texto para evitar el uso de un Array
       String resultado = "";

       //Dos variables de tipo entero, el contador empieza en 0 y el número desde el cual va a iniciar, en este caso el 1
       int contador = 0;
       int numero = 1;

       //Hacemos un ciclo  con la condición de que mientras contador sea menor que 100, se ejecute el siguiente código
       while(contador<100){
        if(esPrimo(numero)){
            resultado += numero + ", "; //A el resultado se le va a sumar el número como cadena de texto seguido de una coma junto con un espacio para fines estéticos
            contador++; //El contador aumenta
        }
            numero++; //El número aumenta de a 1 para ver si con ese aumento, cumple la condición
       }
       System.out.println(resultado); //Imprime en pantalla la cadena de caracteres
        

    }

    //Creamos un método llamado esPrimo el cual recibe una variable de tipo entero
    private static boolean esPrimo(int numero){
        boolean esUnNumeroPrimo = true; //Empezamos estableciendo que es un numero primo
        for(int i = 2; i < numero; i++){ //Iniciamos diciendo que i empieza en 2, si i es menor al número, entonces i sube al siguiente número inmediato
            if(numero % i == 0){ 
                esUnNumeroPrimo = false;
            }
        }
        return esUnNumeroPrimo;
    } 
    
}
