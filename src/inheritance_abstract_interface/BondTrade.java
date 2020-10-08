package inheritance_abstract_interface;

public class BondTrade extends Trade{

   private double dividend;

    public BondTrade(double dividend) {
        this.dividend = dividend;
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
