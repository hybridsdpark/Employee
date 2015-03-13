package webapp.exception;

public class URLRunTimeException extends  RuntimeException{
	
	public URLRunTimeException() {

	super();
	}

	public URLRunTimeException(String message) {

	super(message);
	}
	
	public URLRunTimeException(String message , Throwable e) {

	super(message,e);
	}
}
