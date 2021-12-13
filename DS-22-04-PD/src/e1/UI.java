package e1;

public class UI {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("Ourense", "Santiago", 100, new TicketDate(12, 3, 2022));
        Ticket t2 = new Ticket("Coruña", "París", 200, new TicketDate(13, 11, 2023));
        TicketManager.addTicket(t1);
        TicketManager.addTicket(t2);

        System.out.println(Search.searchTicket("Ourense", Clausula.OR, "Coruña", "París", Clausula.OR, "Madrid",
                new TicketDate(12, 3,2022), Clausula.OR, new TicketDate(11, 2, 2021), 105).toString());
    }
}
