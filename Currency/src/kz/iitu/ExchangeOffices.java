package kz.iitu;

public class ExchangeOffices implements Subscriber  {
    @Override
    public void update(Publisher publisher) {
        System.out.println("Current currency");
    }

}
