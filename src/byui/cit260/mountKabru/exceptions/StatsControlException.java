/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mountKabru.exceptions;

/**
 *
 * @author jacob bloomfield
 */
public class StatsControlException extends Exception {

    public StatsControlException() {
    }

    public StatsControlException(String message) {
        super(message);
    }

    public StatsControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public StatsControlException(Throwable cause) {
        super(cause);
    }

    public StatsControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
