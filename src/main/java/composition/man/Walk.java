package composition.man;

/**
 * specific class of MoveBehavior
 */
public class Walk implements MoveBehavior {

    @Override
    public void go() {
        System.out.println("I am going for a walk each day!");
    }
}
