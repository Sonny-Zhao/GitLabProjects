package com.ppolivka.gitlabprojects.exception;

/**
 * TODO:Descibe
 *
 * @author ppolivka
 * @since 31.10.2015
 */
public class MergeRequestException extends Exception {

    public MergeRequestException() {
    }

    public MergeRequestException(String message) {
        super(message);
    }

    public MergeRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public MergeRequestException(Throwable cause) {
        super(cause);
    }

    public MergeRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
