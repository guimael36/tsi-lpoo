package exception;

public class PrecoVendaMaiorQue1000 extends RuntimeException {
    public PrecoVendaMaiorQue1000(String message) {
        super(message);
    }
}
