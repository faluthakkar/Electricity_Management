package entity;

public class Rate_Table extends Consumer {
    private int rateId;
    private double charge_per_unit;

    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public double getCharge_per_unit() {
        return charge_per_unit;
    }

    public void setCharge_per_unit(double charge_per_unit) {
        this.charge_per_unit = charge_per_unit;
    }

    public Rate_Table() {
        super();
    }
}
