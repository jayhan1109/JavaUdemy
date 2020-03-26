package jay.learning;

public class VipCustomer {
    private String name;
    private double limit;
    private String email;

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public VipCustomer() {
        this("John",0.0,"John@gmail.com");
    }

    public VipCustomer(String name, double limit) {
        this(name,limit,"John@gmail.com");
    }





}
