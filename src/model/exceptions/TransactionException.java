package model.exceptions;

public class TransactionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TransactionException(String errorMessage)
	{
		super(errorMessage);
	}
}
