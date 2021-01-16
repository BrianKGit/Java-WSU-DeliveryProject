
/**
 * @author Brian Klein
 */
public class DeliveryClient {

    public static void main(String[] args) {

        Parcel p1;
        p1 = new Parcel(10002, 12.56, 5.4,
                new Person("Jon", "Doe", "123 Main St.", "Some City", "MN", "55901"),
                new Person("Mary", "Jane", "12 Some St.", "Another City", "MN", "55933"),
                new Date(8, 30, 2017),
                new Date(9, 5, 2017));

        System.out.println(p1);
        System.out.println("\nDelivery Cost: $" + p1.calculateDeliveryCost());

        //print recipient's name
        Person recipient = p1.getRecipient();
        System.out.println("\nRecipient's name: "
                + p1.getRecipient().getFirstName()
                + " " + recipient.getLastName());
        
        //change the delivery date to 9/6/2017
        p1.setDeliveryDate(new Date(9, 6, 2017));
        
        //print the parcel object again
        System.out.println("\n" + p1);
        
        //change recipient's address
        p1.getRecipient().setAddress("address");

    }
}
