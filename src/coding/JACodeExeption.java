package coding;
//klaidu klase
public class JACodeExeption extends Exception {
    public JACodeExeption() {
        super();
    }

    public JACodeExeption(String message) {
        super(message);
    }

    public JACodeExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public JACodeExeption(Throwable cause) {
        super(cause);
    }
}
