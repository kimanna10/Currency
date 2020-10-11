package kz.iitu;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Publisher publisher = new NationalBank();
        Subscriber subscriber = new ExchangeOffices();

        publisher.addSubscriber(subscriber);

        ((NationalBank) publisher).setKzt(1234.5);

        publisher.addSubscriber(new SeconndBanks());
        publisher.notifySubscribers();


        publisher.removeSubscriber(subscriber);
    }
}
