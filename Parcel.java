/**
 * @author Brian
 * Date: 8/30/17
 * Program: Parcel.java
 * Description:
 */
public class Parcel {
    private int trackingNumber;
    private double weight;
    private double baseCost;
    /////////aggregation//////////
    private Person sender;
    private Person recipient;
    private Date receivingDate;
    private Date deliveryDate;
    //////////////////////////////

    public Parcel() {
    }

    public Parcel(int trackingNumber, double weight, double baseCost, Person sender, Person recipient, Date receivingDate, Date deliveryDate) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.baseCost = baseCost;
        this.sender = sender;
        this.recipient = recipient;
        this.receivingDate = receivingDate;
        this.deliveryDate = deliveryDate;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getRecipient() {
        return recipient;
    }

    public void setRecipient(Person recipient) {
        this.recipient = recipient;
    }

    public Date getReceivingDate() {
        return receivingDate;
    }

    public void setReceivingDate(Date receivingDate) {
        this.receivingDate = receivingDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    public double calculateDeliveryCost() {
        return weight * baseCost;
    }

    @Override
    public String toString() {
        return "Tracking Number: " + trackingNumber + "\n" + 
               "Weight: " + weight + "\n" +
               "Base Cost: " + baseCost + "\n" + 
               "Sender Info: " + sender + "\n" + 
               "Recipient Info: " + recipient + "\n" + 
               "Receiving Date: " + receivingDate + "\n" + 
               "Delivery Date: " + deliveryDate;
    }
    
    
    
}
