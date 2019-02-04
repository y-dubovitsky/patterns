package adapter.EnumerationIterator;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Показано как адаптируются два интерфейся Iterator и Enumeration.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\pattern\\src\\main\\java\\adapter\\EnumerationIterator\\Main.java");
        Scanner scanner = new Scanner(file);
        Enumeration enumeration = new StringTokenizer("Hello");

        /**
         * Адаптировали Enumeration как Iterator;
         */
        Iterator enumList = new EnumerationAdapter(enumeration);
        System.out.println(enumList.next());

        /**
         * Адаптировали Iterator к Enumeration.
         */
        Enumeration listEnum = new IteratorAdapter(scanner);
        System.out.println(listEnum.nextElement());
    }
}
