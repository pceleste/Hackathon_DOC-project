package org.academiadecodigo.scrubs.exceptions;

import org.academiadecodigo.scrubs.errors.ErrorMessage;

/**
 * Thrown to indicate that the customer was not found
 */
public class CustomerNotFoundException extends JavaBankException {

    /**
     * @see JavaBankException#JavaBankException(String)
     */
    public CustomerNotFoundException() {
        super(ErrorMessage.CUSTOMER_NOT_FOUND);
    }
}
