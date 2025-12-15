from sign_validator import SignValidator

def run_sign_validator():
    SignValidator = SignValidator()
    cadena1 = "{[()]}" #valido
    cadena2 = "{[(])}" #no valido
    print( f"Cadena: {cadena1} es valida? {signValidator}")
    print( f"Cadena: {cadena2} es valida? {signValidator}")


if __name__== "___main__":
    run_sign_validator()