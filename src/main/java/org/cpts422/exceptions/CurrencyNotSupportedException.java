package org.cpts422.exceptions;

public class CurrencyNotSupportedException extends RuntimeException {
    public CurrencyNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CurrencyNotSupportedException() {
        super("Currency not found in Currency Table");
    }
}
