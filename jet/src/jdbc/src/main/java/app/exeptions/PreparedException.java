package app.exeptions;

// Своя реализация обработки эксепшиенов

public class PreparedException extends Exception{

    public PreparedException() {
    }

    public PreparedException(String message) {
        super(message);
    }
}
