package lesson6.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try(FileOutputStream fileOutputStream = new FileOutputStream("tms.txt")) {
            fileOutputStream.write(input.getBytes());
        } catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fileInputStream = new FileInputStream("tms.txt")) {
            int ch;
            while ((ch = fileInputStream.read()) != -1) {
                if (ch == ' ') {
                    System.out.print('_');
                } else {
                    System.out.print((char)ch);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
