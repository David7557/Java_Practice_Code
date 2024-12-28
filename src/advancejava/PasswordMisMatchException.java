package advancejava;

public class PasswordMisMatchException extends RuntimeException{
    String message;
    PasswordMisMatchException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
