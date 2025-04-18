package me.rkycse.io;
import java.io.*;


public class BufferedByteStreamExample {

    public static void main(String[] args) {
        String src="input.txt";
        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(src))) {
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("output.txt"));
            byte[] buf=new byte[1024];
            int len;
            while((len=bis.read(buf))!=-1) {
                bos.write(buf, 0, len);
            }


        }
        catch(IOException e) {
            e.printStackTrace();

        }
    }
}
