package webapp.exception;

public class JDOMRunTimeException extends  RuntimeException{
	
	public JDOMRunTimeException() {

	super();
	}

	public JDOMRunTimeException(String message) {

	super(message);
	}
	
	public JDOMRunTimeException(String message , Throwable e) {

	super(message,e);
	}
}
