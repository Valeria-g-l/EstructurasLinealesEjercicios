import java.util.Stack;

import javax.sound.sampled.SourceDataLine;

import utils.QueueUtils;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        runSingValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSingValidator() {
        SignValidator signValidator = new SignValidator();
        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("EJERCICIO 1:  Validar signos");
        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
        System.out.println();
    }
    /*************************************************************************************************** */
    private static void runStackSorter() {
    StackSorter sorter = new StackSorter();
    Stack<Integer> pila = new Stack<>();

    pila.push(5);
    pila.push(1);
    pila.push(4);
    pila.push(2);
    pila.push(3);

    System.out.println("EJERCICIO 2: Ordenar un stack");
    System.out.println("Stack original: " + pila);
    sorter.ordenarPila(pila);
    System.out.println("Stack ordenado: " + pila);
    System.out.println();
    }

    /******************************************************************************************************* */
    private static void runQueuePalindrome() {
    QueueUtils queueUtils = new QueueUtils();

    String palabra1 = "ana";   
    String palabra2 = "radar"; 
    String palabra3 = "java";  

    System.out.println("EJERCICIO 3: Palindromo usando colas");
    System.out.println("Input:" + palabra1 + "  Ouput:" + queueUtils.palabraPalindromo(palabra1));
    System.out.println("Input:" + palabra2 + "  Ouput:" + queueUtils.palabraPalindromo(palabra2));
    System.out.println("Input:" + palabra3 + "  Ouput:" + queueUtils.palabraPalindromo(palabra3));
    }


}