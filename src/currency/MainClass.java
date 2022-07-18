package currency;

public class MainClass {
    public static void main(String[] args) {

        Dollar dollar=new Dollar(36);
        System.out.println("Dollar "+dollar.getKursNBU());
        dollar.setKursNBU(36.5);
        System.out.println("Dollar NEW "+dollar.getKursNBU());

        dollar.exchangeGrnToCurrency(4015);
        dollar.exchangeCurrencyToGrn(1000);
        dollar.setMarga(1.15);
        dollar.exchangeGrnToCurrency(4015);
        dollar.exchangeCurrencyToGrn(1000);

        Euro euro=new Euro(38);
        euro.exchangeCurrencyToGrn(1000);

        BitCoin bitCoin=new BitCoin(20000);
        bitCoin.exchangeCurrencyToGrn(1);
        bitCoin.exchangeGrnToCurrency(40000);

    }
}
