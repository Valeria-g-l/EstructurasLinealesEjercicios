package utils;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String signos) {
        Stack<Character> stack = new Stack<Character>();
        char[] caracteres = signos.toCharArray();

        for (char character : caracteres) {
            if (getIsApertura(character)) {
                stack.push(character);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char ultimo = stack.pop();
                 if (!isTipoIgual(ultimo, character)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean getIsApertura(char character) {
        return character == '(' || character == '{' || character == '[';
    }

    private boolean isTipoIgual(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }
    /* */
}