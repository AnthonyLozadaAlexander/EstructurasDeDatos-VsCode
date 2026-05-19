package ExerciseTicket;

import Queue.TadCola;

public class Main {
    public static void main(String[] args) {
        TadCola<Ticket> ticketsPendientes = new TadCola<>("Tickets Pendientes");

        /* Creacion De Objetos Tickets, con su numero y descripcion */

        Ticket ticket1 = new Ticket(1, "No Enciende El Pc");
        Ticket ticket2 = new Ticket(2, "Internet Lento");
        Ticket ticket3 = new Ticket(3, "Olvido Contrasenia");
    }

}
