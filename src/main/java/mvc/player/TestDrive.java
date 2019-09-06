package mvc.player;

public class TestDrive {
    public static void main (String[] args) {
        ModelInterface model = new Model();
        ControllerInterface controller = new Controller(model);
    }
}

