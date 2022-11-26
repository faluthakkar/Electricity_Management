package entity;

public class Consumer {
    private int id;
    private String cname;
    private String city;
    private String area;
    private String con_Type;

    public Consumer() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCon_Type() {
        return con_Type;
    }

    public void setCon_Type(String con_Type) {
        this.con_Type = con_Type;
    }

    public Consumer(int id, String cname, String city, String area, String con_Type) {
        this.id = id;
        this.cname = cname;
        this.city = city;
        this.area = area;
        this.con_Type = con_Type;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", con_Type='" + con_Type + '\'' +
                '}';
    }

    class Connection_Type extends Consumer {
        private int conn_Id;
        private String con_Type;
        private double charge_per_unit;

        public Connection_Type() {
            super();
        }

        public Connection_Type(int id, String cname, String city, String area, String con_Type, int conn_Id, String con_Type1, double charge_per_unit) {
            super(id, cname, city, area, con_Type);
            this.conn_Id = conn_Id;
            this.con_Type = con_Type1;
            this.charge_per_unit = charge_per_unit;
        }

        public int getConn_Id() {
            return conn_Id;
        }

        public void setConn_Id(int conn_Id) {
            this.conn_Id = conn_Id;
        }

        @Override
        public String getCon_Type() {
            return con_Type;
        }

        @Override
        public void setCon_Type(String con_Type) {
            this.con_Type = con_Type;
        }

        public double getCharge_per_unit() {
            return charge_per_unit;
        }

        public void setCharge_per_unit(double charge_per_unit) {
            this.charge_per_unit = charge_per_unit;
        }

    }
}

