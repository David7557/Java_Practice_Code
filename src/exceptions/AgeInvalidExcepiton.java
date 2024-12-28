package exceptions;

public class AgeInvalidExcepiton extends Exception{
    private final String message;

    AgeInvalidExcepiton(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
