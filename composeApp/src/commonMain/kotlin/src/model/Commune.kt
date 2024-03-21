package src.model

data class Commune(
    val id : Int,
    val name : String,
    val city: City,
    val order : Int
)
