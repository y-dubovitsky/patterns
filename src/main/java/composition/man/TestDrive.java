package composition.man;

public class TestDrive {
    public static void main(String[] args) {
        Man first_man = Man.getInstance();
        Man second_man = Man.getInstance();
        System.out.println(first_man.equals(second_man) ? "yeap" : "nope");
    }
}
