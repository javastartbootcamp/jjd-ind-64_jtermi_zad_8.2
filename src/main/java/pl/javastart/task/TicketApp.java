package pl.javastart.task;

import java.util.Scanner;

public class TicketApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TicketService ticketService = new TicketService();

        Address address = new Address("Opera Narodowa", "00-950", "Warszawa", "Plac Teatralny", 1);

        ticketService.createTicket("Balet Jezioro Łabędzie", address, 100F, 1, 0.05F);
        ticketService.createTicket("Balet Jezioro Łabędzie", address, 100F, 2, 0.05F);
        ticketService.createTicket("Balet Jezioro Łabędzie", address, 100F, 3, 0.05F);

        ticketService.printAllTickets();

        System.out.println("Wprowadź nazwę wydarzenia:");
        String eventTitle = scanner.nextLine();

        System.out.println("Wprowadź podstawową cenę biletu:");
        float ticketPrice = scanner.nextInt();

        System.out.println("Wprowadź typ wydarzenia: (1-Bilet OnLine, 2-Bilet Papierowy, 3-Bilet Podarunkowy");
        int ticketType = scanner.nextInt();

        System.out.println("Wprowadź zniżkę w % (0-100)");
        float ticketDiscount = scanner.nextInt() / 100;

        Ticket ticket = ticketService.createTicketFromScanner(eventTitle, address, ticketPrice, ticketType, ticketDiscount);

        ticketService.printTicketInformation(ticket);
    }
}
