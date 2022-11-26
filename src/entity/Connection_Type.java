package entity;

public class Connection_Type {
    private int conn_Id;
    private String con_Type;
    private double charge_per_unit;
    private int fixed_charge;

    public Connection_Type(int conn_Id, String con_Type, double charge_per_unit, int fixed_charge) {
        this.conn_Id = conn_Id;
        this.con_Type = con_Type;
        this.charge_per_unit = charge_per_unit;
        this.fixed_charge = fixed_charge;
    }

    public Connection_Type() {
        super();
    }

    public int getConn_Id() {
        return conn_Id;
    }

    public void setConn_Id(int conn_Id) {
        this.conn_Id = conn_Id;
    }

    public String getCon_Type() {
        return con_Type;
    }

    public void setCon_Type(String con_Type) {
        this.con_Type = con_Type;
    }

    public double getCharge_per_unit() {
        return charge_per_unit;
    }

    public void setCharge_per_unit(double charge_per_unit) {
        this.charge_per_unit = charge_per_unit;
    }

    public int getFixed_charge() {
        return fixed_charge;
    }

    public void setFixed_charge(int fixed_charge) {
        this.fixed_charge = fixed_charge;
    }

    @Override
    public String toString() {
        return "Connection_Type{" +
                "conn_Id=" + conn_Id +
                ", con_Type='" + con_Type + '\'' +
                ", charge_per_unit=" + charge_per_unit +
                ", fixed_charge=" + fixed_charge +
                '}';
    }
}