package com.bridgelabz.cab_invoice_generator;

public class CabInvoiceCustomException extends Exception{
    enum ExceptionType {
        INVALID_USER
    }

    ExceptionType type;

    public CabInvoiceCustomException(String string, ExceptionType invalidUser) {
		// TODO Auto-generated constructor stub
	}

	public void CabInvoiceCustomException(String message, ExceptionType type) {
       // super(message);
        this.type = type;
    }

    public void CabInvoiceCustomException(String message, ExceptionType type, Throwable cause) {
     //   super(message, cause);
        this.type = type;
    }

}
