package advancejava;

public class ImageNotFitExeception extends Exception {
    String message;
    ImageNotFitExeception(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
