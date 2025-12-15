package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {

    public boolean palabraPalindromo(String palabra) {
        Queue<Character> colaOriginal = new LinkedList<>();
        Queue<Character> colaInvertida = new LinkedList<>();
        Queue<Character> colaAuxiliar = new LinkedList<>();

        for (char c : palabra.toCharArray()) {
            colaOriginal.add(c);
            colaAuxiliar.add(c);
        }
        while (!colaAuxiliar.isEmpty()) {
            char c = colaAuxiliar.remove();
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(c);
            temp.addAll(colaInvertida);
            colaInvertida = temp;
        }
        while (!colaOriginal.isEmpty() && !colaInvertida.isEmpty()) {
            if (!colaOriginal.remove().equals(colaInvertida.remove())) {
                return false;
            }
        }

        return true;
    }
}

