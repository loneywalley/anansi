import java.time.LocalDate

fun main() {
    val ticketManager = TicketManager()

    // Create users
    ticketManager.addUser("John", "User")
    ticketManager.addUser("Jane", "Admin")

    // Create tickets
    val ticket1 = ticketManager.createTicket("Ticket 1", "High")
    val ticket2 = ticketManager.createTicket("Ticket 2", "Low")

    // Assign users
    ticketManager.assignUser(ticket1.id, 1)
    ticketManager.assignUser(ticket2.id, 2)

    // Update ticket status
    ticketManager.updateTicketStatus(ticket1.id, "In Progress")

    // Set due date
    ticketManager.setDueDate(ticket1.id, LocalDate.of(2023, 3, 15))

    // View tickets
    ticketManager.viewTickets()

    // Search ticket by ID
    val searchedTicket = ticketManager.searchTicketById(1)
    println("Searched ticket: $searchedTicket")
}