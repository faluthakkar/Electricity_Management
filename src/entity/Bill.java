package entity;

public class Bill {
    private int id;
    private int connectionId;
    private int consumerId;
    private int connectionTypeId;
    private String year;
    private String month;
    private int oldReading;
    private int newReading;
    private int billedUnits;
    private double totalAmount;

    public Bill() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Bill(int id, int connectionId, int consumerId, int connectionTypeId, String year, String month, int oldReading, int newReading, int billedUnits, double totalAmount) {
        this.id = id;
        this.connectionId = connectionId;
        this.consumerId = consumerId;
        this.connectionTypeId = connectionTypeId;
        this.year = year;
        this.month = month;
        this.oldReading = oldReading;
        this.newReading = newReading;
        this.billedUnits = billedUnits;
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    public int getConnectionTypeId() {
        return connectionTypeId;
    }

    public void setConnectionTypeId(int connectionTypeId) {
        this.connectionTypeId = connectionTypeId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getOldReading() {
        return oldReading;
    }

    public void setOldReading(int oldReading) {
        this.oldReading = oldReading;
    }

    public int getNewReading() {
        return newReading;
    }

    public void setNewReading(int newReading) {
        this.newReading = newReading;
    }

    public int getBilledUnits() {
        return billedUnits;
    }

    public void setBilledUnits(int billedUnits) {
        this.billedUnits = billedUnits;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", connectionId=" + connectionId +
                ", consumerId=" + consumerId +
                ", connectionTypeId=" + connectionTypeId +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", oldReading=" + oldReading +
                ", newReading=" + newReading +
                ", billedUnits=" + billedUnits +
                ", totalAmount=" + totalAmount +
                '}';
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
