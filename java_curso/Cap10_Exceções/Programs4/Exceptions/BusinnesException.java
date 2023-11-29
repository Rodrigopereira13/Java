package java_curso.Cap10_Exceções.Programs4.Exceptions;

public class BusinnesException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    
    public BusinnesException(String msg){
        super(msg);
    }

}
