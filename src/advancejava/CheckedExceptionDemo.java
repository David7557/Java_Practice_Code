package advancejava;

import java.util.Scanner;

public class CheckedExceptionDemo {
   static int imageSize = 1;
    static void uploadImage() throws ImageNotFitExeception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Image Size to Upload: ");
        int uploadedImage = sc.nextInt();
        if(imageSize == uploadedImage){
            System.out.println("Good to go!!! Image size matched, Uploading it. ");
        }else {
            throw new ImageNotFitExeception("Image size should be less than 1 MB");
        }
    }

    public static void main(String[] args) {
        try{
            uploadImage();
        }catch (ImageNotFitExeception e){
            System.out.println(e.getMessage());
        }
    }
}
