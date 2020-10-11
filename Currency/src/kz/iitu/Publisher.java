package kz.iitu;

public interface  Publisher {

    void addSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);
    void notifySubscribers();
    double exchangeEur(double kzt);
    double exchangeUsd(double kzt);
    double exchangeRub(double kzt);

}