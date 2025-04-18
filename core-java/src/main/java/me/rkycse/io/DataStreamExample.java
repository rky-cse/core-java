package me.rkycse.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args) {
        String filename = "primitives.dat";

        // 1. Write primitives
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(2025);
            dos.writeDouble(3.14159);
            dos.writeBoolean(true);
            dos.writeUTF("Hello, DataStream!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Read them back
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int year = dis.readInt();
            double pi = dis.readDouble();
            boolean flag = dis.readBoolean();
            String msg = dis.readUTF();

            System.out.printf("Read: %d, %.5f, %b, \"%s\"%n", year, pi, flag, msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
