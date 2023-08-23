package com.wanted.preonboarding.theater.service.handler;

public class TicketSeller {

    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTicket(Ticket ticket) {
        ticketOffice.plusAmount(ticket.getFee());
    }

    public Ticket getTicket() {
        return ticketOffice.getTicket();
    }
}
