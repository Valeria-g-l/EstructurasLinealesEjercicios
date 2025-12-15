class SignValidator:
    def is_valid(self, text: str) -> bool:
        stack = []
        for char in text:
            if char in "({[":
                stack.append(char)
            elif char in ")}]":
                if not stack:
                    return False
                ultimo = stack.pop()
                if not self.is_tipo_igual(ultimo, char):
                    return False
        return len(stack) == 0

    def is_tipo_igual(self, apertura: str, cierre: str) -> bool:
        pares = {')': '(', '}': '{', ']': '['}
        return pares[cierre] == apertura
