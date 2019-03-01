package observer.paper;

/**
 * Test method
 */
public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Reader reader = new Reader(magazine);
        reader.registerLikeObserver();
        for (int i = 0; i < 10; i++) {
            magazine.updateState(String.valueOf(i));
            if (i % 2 == 0) {
                reader.resignFromSubscribe();
            } else {
                reader.registerLikeObserver();
            }
            System.out.println(reader.string);
        }
    }
}
