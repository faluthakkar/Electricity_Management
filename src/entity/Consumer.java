package entity;

public class Consumer {
    private int id;
    private String cname;
    private String city;
    private String area;


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



    public Consumer(int id, String cname, String city, String area) {
        this.id = id;
        this.cname = cname;
        this.city = city;
        this.area = area;

    }


    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}


