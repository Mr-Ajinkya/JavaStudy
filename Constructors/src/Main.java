/**
 * Created by lenovo on 5/22/2018.
 */
public class Main {

    public static void main(String[] args) {
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditsLimit());
        System.out.println(vipCustomer1.getEmailAddress());

        VipCustomer vipCustomer2 = new VipCustomer("Rahul",60000.0);
        System.out.println("///////////////");
        System.out.println(vipCustomer2.getName());

        VipCustomer vipCustomer3 = new VipCustomer("Manish",10000.0,"manish@gmail.com");
        System.out.println("**********************");
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getEmailAddress());
    }

}
