package me.rkycse.io;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileInputOutput {

    public static void main(String[] args) {
        // write to the file
        try(FileOutputStream fos=new FileOutputStream("example.txt")){
            String text="hello this is ravi";
            fos.write(text.getBytes());

        }
        catch(IOException e){
            e.printStackTrace();
        }


        // reading from the file

        try(FileInputStream fis=new FileInputStream("example.txt")){
            int singleByte;

            while((singleByte=fis.read())!=-1){
                System.out.print((char)singleByte);
            }


        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
