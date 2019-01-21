package observer.work;

/**
 * Класс для тестирование
 */
public class SearchWork {

    /**
     * Вложенный класс
     */
    static class Value implements Data {

        String job;

        public Value(String job) {
            this.job = job;
        }

        @Override
        public String getParam() {
            return this.job;
        }
    }

    public static void main(String[] args) {
        HeadHunter headHunter = new HeadHunter();
        Enginer enginer = new Enginer(headHunter);
        enginer.subscribe(headHunter);
        headHunter.updateCurrentValue(new Value("Программист"));
        System.out.println(enginer.data.getParam());
        headHunter.updateCurrentValue(new Value("Художник"));
        System.out.println(enginer.data.getParam());
        enginer.unsubscribe(headHunter);
        headHunter.updateCurrentValue(new Value("Конструктор"));
        System.out.println(enginer.data.getParam());
    }
}
