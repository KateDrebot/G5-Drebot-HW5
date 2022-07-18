package currency;

public class BitCoin extends Currency implements IsCryptocurrency {
    public BitCoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "BitCoin";
    }

    public double exchangeGrnToCurrency(double numberOfGrn) {

        System.out.println(String.format("can't exchange Grn to %s", getCurrencyName()));
        return numberOfGrn;
    }

    @Override
    public boolean IsCryptocur() {
        return true;
    }
}
