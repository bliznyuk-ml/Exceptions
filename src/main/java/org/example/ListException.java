package org.example;

public class ListException extends Exception {
    public ListException(String message) {
        super(message);
    }
}

// цей клас також краще було зробити публічним
class EmptyListException extends ListException {
    public EmptyListException(String message) {
        super(message);
    }
}

// цей клас також краще було зробити публічним
class FullListException extends ListException {
    public FullListException(String message) {
        super(message);
    }
}
