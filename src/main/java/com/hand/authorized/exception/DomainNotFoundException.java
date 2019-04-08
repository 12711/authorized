package com.hand.authorized.exception;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-4:01 PM
 */
public class DomainNotFoundException extends RuntimeException {
    public DomainNotFoundException() {
        super();
    }

    public DomainNotFoundException(String message) {
        super(message);
    }

    public DomainNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DomainNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DomainNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
