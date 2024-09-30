data class User (
   private val id: Int,
    private val name: String,
    private val role: String
) {
    init {
//        require(name.isEmpty()) { "Nama tidak boleh kosong." }
        require(role in listOf("user", "admin")) { "Role yang tersedia hanya Admin dan User." }
    }
}