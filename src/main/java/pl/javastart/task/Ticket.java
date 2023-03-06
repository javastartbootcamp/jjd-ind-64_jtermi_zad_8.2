package pl.javastart.task;

public class Ticket {

    private String eventTitle;
    private Address address;
    private float price;
    private int type;
    private float discount;
    private int number;

    public Ticket(String eventTitle, Address address, int type, float price, float discount, int number) {
        this.eventTitle = eventTitle;
        this.address = address;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.number = number;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public Address getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public float getPrice() {
        return price;
    }

    public int getType() {
        return type;
    }

    public float calculateOnlinePrice() {
        return this.price * (1 - this.discount);
    }

    public float calculateStandardPrice() {
        return this.calculateOnlinePrice() + 5;
    }

    public float calculateGiftPrice() {
        return this.calculateStandardPrice() + ((this.discount) * this.calculateOnlinePrice());

    }
}