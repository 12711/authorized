package com.hand.authorized.exception;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-4:01 PM
 */
public class DomainUniqueException extends RuntimeException {
    public DomainUniqueException() {
        super();
    }

    public DomainUniqueException(String message) {
        super(message);
    }

    public DomainUniqueException(String message, Throwable cause) {
        super(message, cause);
    }

    public DomainUniqueException(Throwable cause) {
        super(cause);
    }

    protected DomainUniqueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
