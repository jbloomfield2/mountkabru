/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.exceptions;

/**
 *
 * @author Andrew
 */
public class BlackSmithException extends Exception{
    
    public BlackSmithException() {
    }

    public BlackSmithException(String message) {
        super(message);
    }

    public BlackSmithException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlackSmithException(Throwable cause) {
        super(cause);
    }

    public BlackSmithException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
