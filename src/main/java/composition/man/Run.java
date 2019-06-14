package composition.man;

/**
 *  * specific class of MoveBehavior
 */
public class Run implements MoveBehavior {

    @Override
    public void go() {
        System.out.println("I runes all day long");
    }
}
