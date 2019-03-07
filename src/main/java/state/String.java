package state;

public class String {
    // Нет шариков
    final static int SOLD_OUT = 0;

    // Нет монетки
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    // Исходное состояние; Перемен. экз. для хранения состояния.
    int state = SOLD_OUT;

    // Нужно создать методы для каждого действия
    public void insertQuarter() {
        switch (state) {
            case SOLD_OUT : {
                System.out.println();
            }
            case NO_QUARTER : {
                System.out.println("Введите монетку");
            }
            case HAS_QUARTER : {
                //state =
            }
            case SOLD : {
                System.out.println("Все шарики проданы!");
            }
        }
    }
}
