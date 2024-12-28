package exceptions;

public class InvalidPasswordException extends RuntimeException{
    private final String message;

    InvalidPasswordException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
