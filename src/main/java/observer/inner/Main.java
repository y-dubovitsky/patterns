package observer.inner;

/**
 * Test class
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setName("Hello");
        Observer observer = new Observer(subject);
        for (int i = 0; i < 10; i++) {
            if (observer.observable instanceof Subject) {
                System.out.println(((Subject) observer.observable).getName());
            }

            // wtf
            if (i == 3) subject.deleteObserver(observer);
            if (i == 7) subject.addObserver(observer);
            subject.setName("Hi + " + i);
        }
    }
}
