package exception;

public class NaoVerificada extends RuntimeException {
    public NaoVerificada(String message) {
        super(message);
    }
}
