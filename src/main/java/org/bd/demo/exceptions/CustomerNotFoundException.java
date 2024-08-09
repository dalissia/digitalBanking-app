package org.bd.demo.exceptions;

public class CustomerNotFoundException extends Throwable {
    public CustomerNotFoundException(String  message) {
        super(message);
    }
}
