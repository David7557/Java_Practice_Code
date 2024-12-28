package exceptions;

public class InvalidAgeExeception extends RuntimeException{
    private String message;

    InvalidAgeExeception(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
