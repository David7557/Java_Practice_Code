package exceptions;

public class InvalidUsernameException extends RuntimeException{

    private final String message;

    InvalidUsernameException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
