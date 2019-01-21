package observer.work;

public class Enginer implements Observer {

    /**
     * Субъект, отвечающий за автоматическое обновление данных у соискателя.
     */
    Subject subject;

    /**
     * Данные, которые нужно отслеживать.
     */
    Data data;

    public Enginer(Subject subject) {
        this.subject = subject;
    }

    /**
     * Метод делает запрос на обновление данных, даже
     * если он не включен в список наблюдателей у субъекта.
     */
    @Override
    public void getParam(Subject subject) {
        subject.updateRequest(this);
    }

    @Override
    public void setParam(Data data) {
        this.data = data;
    }

    @Override
    public void subscribe(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void unsubscribe(Subject subject) {
        subject.removeObserver(this);
    }
}
