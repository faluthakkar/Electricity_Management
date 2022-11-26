package entity;

public class Bill {
    private int id;
    private int connectionId;
    private int consumerId;
    private int connectionTypeId;
    private String yearMonth;
    private int oldReading;
    private int newReading;
    private int billedUnits;
    private double totalAmount;

    public Bill() {
        super();
        // TODO Auto-generated constructor stub
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

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
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

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Bill(int id, int connectionId, int consumerId, int connectionTypeId,
                String yearMonth, int oldReading, int newReading, int billedUnits, double totalAmount) {
        super();
        this.id = id;
        this.connectionId = connectionId;
        this.consumerId = consumerId;
        this.connectionTypeId = connectionTypeId;
        this.yearMonth = yearMonth;
        this.oldReading = oldReading;
        this.newReading = newReading;
        this.billedUnits = billedUnits;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", connectionId=" + connectionId +
                ", consumerId=" + consumerId +
                ", connectionTypeId=" + connectionTypeId +
                ", yearMonth='" + yearMonth + '\'' +
                ", oldReading=" + oldReading +
                ", newReading=" + newReading +
                ", billedUnits=" + billedUnits +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
