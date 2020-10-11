package kz.iitu;

public class SeconndBanks implements Subscriber  {


    @Override
    public void update(Publisher publisher) {
        System.out.println("SeconndBanks.update");
        if (publisher instanceof NationalBank) {
            NationalBank rdp = ((NationalBank) publisher);
            System.out.println("kzt = " + rdp.getKzt());
            System.out.println("eur = " + rdp.exchangeEur(rdp.getKzt()));
            System.out.println("usd = " + rdp.exchangeUsd(rdp.getKzt()));
            System.out.println("rub = " + rdp.exchangeRub(rdp.getKzt()));
        }
    }

}
