import java.time.LocalDate

class ProjectManager {
    val freelancers = mutableListOf<Freelancer>()
    val projects = mutableListOf<Project>()

    fun addFreelancer(name: String, hourlyRate: Double) {
        val freelancer = Freelancer(
            id = freelancers.size + 1,
            name = name,
            hourlyRate = hourlyRate
        )
        freelancers.add(freelancer)
    }

    fun createProject(name: String, client: String, deadline: LocalDate) {
        val project = Project(
            id = projects.size + 1,
            name = name,
            client = client,
            deadline = deadline,
            tasks = mutableListOf(),
            totalBudget = 0.0
        )
        projects.add(project)
    }

    fun assignTask(projectId: Int, freelancerId: Int, description: String, estimatedHours: Int) {
        val project = projects.find { it.id == projectId }
        val freelancer = freelancers.find { it.id == freelancerId }
        if (project != null && freelancer != null) {
            require(description.isNotEmpty()) { "Task description cannot be empty" }
            require(estimatedHours > 0) { "Estimated hours must be positive" }

            val task = Task(
                id = project.tasks.size + 1,
                description = description,
                freelancer = freelancer,
                estimatedHours = estimatedHours
            )
            project.tasks.add(task)
            freelancer.assignedTasks.add(task)
        } else {
            println("Project or freelancer not found!")
        }
    }

    fun logHoursWorked(taskId: Int, hoursWorked: Int) {
        val task = projects.flatMap { it.tasks }.find { it.id == taskId }
        if (task != null) {
            task.actualHours += hoursWorked
            if (task.actualHours > task.estimatedHours * 1.5) {
                println("Warning: Actual hours exceed estimated hours by more than 50%")
            }
            updateTaskStatus(task)
            val projectId = projects.flatMap { it.tasks }.find { it.id == taskId }?.let { task -> projects.find { it.tasks.contains(task) }?.id }
            if (projectId != null) {
                calculateProjectBudget(projectId)
            }
        }
    }

    fun updateTaskStatus(task: Task) {
        if (task.actualHours >= task.estimatedHours) {
            task.status = "Completed"
        } else if (task.actualHours > 0) {
            task.status = "In Progress"
        }
    }

    fun calculateProjectBudget(projectId: Int) {
        val project = projects.find { it.id == projectId }
        project?.let {
            it.totalBudget = it.tasks.sumByDouble { task ->
                task.actualHours * (task.freelancer?.hourlyRate ?: 0.0)
            }
            println("Project Total Budget : ${it.totalBudget}")
        }
    }

    fun viewProjectDetails(projectId: Int) {
        val project = projects.find { it.id == projectId }
        if (project != null) {
            println("Project Name: ${project.name}")
            println("Client: ${project.client}")
            println("Deadline: ${project.deadline}")
            println("Tasks:")
            project.tasks.forEach {
                println("ID : ${it.id}")
                println("Status : ${it.status}")
                println("Description : ${it.description}")
                println("Actual Hours : ${it.actualHours}")
                println("Estimate Hours : ${it.estimatedHours}") }
            calculateProjectBudget(projectId)
            println("Total Budget: ${project.totalBudget}")
        }else{
            throw Exception("Please Enter Project Id")
        }
    }
}