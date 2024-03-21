package src.model

data class User(
    val id : Int,
    val userName : String,
    val phone : String,
    val role: Role,
    var isCertified : Boolean = false,
    val password : String
)
