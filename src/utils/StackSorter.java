package utils;

import java.util.Stack;

public class StackSorter {

    public void ordenarPila(Stack<Integer> pila) {
        Stack<Integer> pilaAuxiliar = new Stack<>();

        while (!pila.isEmpty()) {
            int temp = pila.pop();

            while (!pilaAuxiliar.isEmpty() && pilaAuxiliar.peek() > temp) {
                pila.push(pilaAuxiliar.pop());
            }

            pilaAuxiliar.push(temp);
        }
        while (!pilaAuxiliar.isEmpty()) {
            pila.push(pilaAuxiliar.pop());
        }
    }
}

