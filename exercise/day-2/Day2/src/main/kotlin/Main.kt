import java.time.LocalDate
import java.util.Scanner

fun main() {
    var ticketManager = TicketManager()
    while (true) {
        println("Menu :")
        println("1. Registration")
        println("2. Create Ticket")
        println("3. Assign Ticket")
        println("4. Update Ticket")
        println("5. Set Due Date")
        println("6. View Ticket")
        println("7. Search Ticket")
        println("8. Exit")
        print("Choose Menu : ")
        var input = Scanner(System.`in`).nextInt()
        when(input){
            1 -> {
                println("Enter User Name: ")
                var name = readLine()!!
                println("Enter User Role (User/Admin): ")
                var role = readLine()!!
                ticketManager.addUser(name, role.lowercase())
                println("User Registered Successfully!")
            }
            2 -> {
                println("Enter Ticket Description: ")
                var description = readLine()!!
                println("Enter Ticket Priority (Low/Medium/High): ")
                var priority = readLine()!!
                var ticket = ticketManager.createTicket(description, priority)
                println("Ticket Created Successfully! Ticket ID: ${ticket.id}")
            }
            3 -> {
                println("Input Ticket ID : ")
                var ticketId = Scanner(System.`in`).nextInt()
                println("Input User ID : ")
                var userId = Scanner(System.`in`).nextInt()
                ticketManager.assignUser(ticketId, userId)
                println("User with id number ${userId}, has been assigned to ticket ${ticketId}")
            }
            4 -> {
                println("Enter Ticket ID: ")
                var ticketId = readLine()!!
                println("Enter New Status (Open/In Progress/Closed): ")
                var status = readLine()!!
                ticketManager.updateTicketStatus(ticketId.toInt(), status)
                println("Ticket Status Updated Successfully!")
            }
            5 -> {
                println("Enter Ticket ID: ")
                var ticketId = readLine()!!
                println("Enter Due Date (YYYY-MM-DD): ")
                var dueDate = readLine()!!
                ticketManager.setDueDate(ticketId.toInt(), dueDate)
                println("Due Date Set Successfully!")
            }
            6 -> {
                ticketManager.viewTickets()
            }
            7 -> {
                println("Enter Ticket ID: ")
                var ticketId = readLine()!!
                var ticket = ticketManager.searchTicketById(ticketId.toInt())
                if (ticket != null) {
                    println("Ticket Found!")
                    println(ticket)
                } else {
                    println("Ticket Not Found!")
                }
            }
            8 -> {
                break
            }
            else -> {
                println("Invalid Choice. Please choose a valid option.")
            }
        }
    }
}