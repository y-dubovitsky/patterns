package composition.man;

/**
 * Simple singleton uses composition
 */
public class Man {

    // interface like a variable
    public MoveBehavior moveBehavior;

    // то есть, Объект man содержит экземпляр man? =)
    private static Man man;

    private Man(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public static Man getInstance() {
        if (man == null) {
            man = new Man(new Run());
        }
        return man;
    }
}
