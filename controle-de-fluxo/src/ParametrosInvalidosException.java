public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Os parâmetros são inválidos. O segundo parâmetro deve ser maior que o primeiro.");
    }
}