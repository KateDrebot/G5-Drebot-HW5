package currency;

abstract class Currency {
    private double kursNBU;
    private double marga = 1.1;


    public Currency(double kursNBU) {
        this.kursNBU = kursNBU;

    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {

        this.kursNBU = kursNBU;
    }

    public double getMarga() {

        return marga;
    }

    public void setMarga(double marga) {

        this.marga = marga;
    }

    private double getKursBuy() {

        return kursNBU * marga;
    }

    private double getKursSell() {

        return kursNBU / marga;
    }

    abstract String getCurrencyName();

    public double exchangeGrnToCurrency(double numberOfGrn) {
        Double tempResult = numberOfGrn / getKursBuy();
        //System.out.println("for "+numberOfGrn +"grn you get "+tempResult);
        System.out.println(String.format("for %s grn you get %s %s by kurs %s (marga %s)"
                , numberOfGrn, tempResult, getCurrencyName(), getKursBuy(), marga));
        return tempResult;
    }


    public double exchangeCurrencyToGrn(double numberOfCurrency) {
        double tempResult = numberOfCurrency * getKursSell();
        System.out.println(String.format("for %s %s you get %s grn by kurs %s (marga %s)"
                , numberOfCurrency, getCurrencyName(), tempResult, getKursSell(), marga));
        return tempResult;
    }

}
