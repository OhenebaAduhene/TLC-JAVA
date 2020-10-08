package inheritance_abstract_interface;

public class FundTrade extends Trade{

    private double dividend;

    public FundTrade(double dividend) {
        this.dividend = dividend/100;
    }

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    @Override
    public void calcDividend() {

    }
}
