package src.model

data class Quartier(
    val id : Int,
    val commune : Commune,
    val name : String,
    val isSecurity : Boolean
)
