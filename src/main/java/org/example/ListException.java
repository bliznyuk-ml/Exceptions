package org.example;

public class ListException extends Exception {
    public ListException(String message) {
        super(message);
    }
}

class EmptyListException extends ListException {
    public EmptyListException(String message) {
        super(message);
    }
}

class FullListException extends ListException {
    public FullListException(String message) {
        super(message);
    }
}
