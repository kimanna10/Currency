package kz.iitu;

import java.util.ArrayList;
import java.util.List;

public class NationalBank implements Publisher{

    private List<Subscriber> subscribers;
    private Double kzt;

    @Override
    public void addSubscriber(Subscriber s) {
        if (subscribers == null) {
            subscribers = new ArrayList<>();
        }
        subscribers.add(s);
    }
    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public double exchangeEur(double kzt) {
        return kzt*0.0020;
    }

    @Override
    public double exchangeUsd(double kzt) {
        return kzt*0.0023;
    }

    @Override
    public double exchangeRub(double kzt) {
        return kzt*0.18;
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(this);
        }
    }

    public Double getKzt() {
        return kzt;
    }

    public void setKzt(Double kzt) {
        this.kzt = kzt;
    }


}
