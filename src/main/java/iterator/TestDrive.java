package iterator;

/**
 * Класс для тестирования Клиента
 */
public class TestDrive {

    public static void main(String[] args) {
        Client client = new Client(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
        client.showMenu(client.dinerIterator());
        //
        client.showMenu(client.pancakeIterator());
        //
        client.showMenu(client.cafeIterator());
    }
}
