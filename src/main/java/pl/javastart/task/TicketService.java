package pl.javastart.task;

public class TicketService {

    private static final int ONLINE = 1;
    private static final int STANDARD = 2;
    private static final int GIFT = 3;

    private Ticket[] tickets = new Ticket[1000];
    private int ticketCounter = 1;

    public void createTicket(String eventName, Address address, float price, int type, float discount) {
        tickets[ticketCounter] = new Ticket(eventName, address, type, price, discount, ticketCounter);
        ticketCounter++;
    }

    public Ticket createTicketFromScanner(String eventName, Address address, float price, int type, float discount) {
        tickets[ticketCounter] = new Ticket(eventName, address, type, price, discount, ticketCounter);
        ticketCounter++;
        return tickets[ticketCounter - 1];
    }

    public float calculateTicketPrice(Ticket ticket) {
        float result = 0;
        switch (ticket.getType()) {
            case ONLINE -> result = ticket.calculateOnlinePrice();
            case STANDARD -> result = ticket.calculateStandardPrice();
            case GIFT -> result = ticket.calculateGiftPrice();
            default -> { }
        }
        return result;
    }

    public void printTicketInformation(Ticket ticket) {
        System.out.println("----------------------------------");
        System.out.printf("Number biletu: %2s: \n", ticket.getNumber());
        System.out.print("Tyb biletu: ");
        switch (ticket.getType()) {
            case ONLINE -> System.out.println("bilet internetowy");
            case STANDARD -> System.out.println("bilet standardowy");
            case GIFT -> System.out.println("bilet podarunkowy");
            default -> { }
        }
        System.out.println("Nazwa wydarzenia: " + ticket.getEventTitle());

        Address address = ticket.getAddress();
        System.out.println("Miejsce: " + address.getLocationName());
        System.out.println("Adres: " + address.getPostCode() + " " + address.getCity() + ", "
                + address.getStreetName() + " " + address.getHouseNumber());

        System.out.println("cena podstawowa: " + ticket.getPrice());
        System.out.println("cena finalna biletu: " + calculateTicketPrice(ticket));
        System.out.println();
    }

    public void printAllTickets() {
        System.out.println("Lista wszystkich biletow");
        for (int i = 1; i < ticketCounter; i++) {
            printTicketInformation(tickets[i]);
        }
    }
}
