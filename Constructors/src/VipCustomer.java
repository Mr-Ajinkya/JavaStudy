/**
 * Created by lenovo on 5/22/2018.
 */
public class VipCustomer {

    private String name;
    private double creditsLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Ajinkya",500.0,"abc@gmail.com");
    }

    public VipCustomer(String name, double creditsLimit, String emailAddress) {
        this.name = name;
        this.creditsLimit = creditsLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditsLimit) {
        this.name = name;
        this.creditsLimit = creditsLimit;
    }

    public String getName() {
        return name;
    }

    public double getCreditsLimit() {
        return creditsLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
