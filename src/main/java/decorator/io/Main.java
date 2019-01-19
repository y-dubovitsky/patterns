package decorator.io;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in =
                    new UpperCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\user\\IdeaProjects\\pattern\\src\\main\\java\\decorator\\io\\input.txt")));
            while ((c = in.read()) > 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
