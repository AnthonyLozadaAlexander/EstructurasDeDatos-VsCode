package ExerciseTicket;

public class Ticket {
    private int numeroTicket;
    private String descripcionProblema;

    public Ticket(int numeroTicket, String descripcionProblema) {
        this.numeroTicket = numeroTicket;
        this.descripcionProblema = descripcionProblema;
    }

    @Override
    public String toString() {
        return "Ticket\n" +
                "Numero Ticket: " + numeroTicket + "\n" +
                "Descripcion Problema: " + descripcionProblema + "\n";
    }

}
