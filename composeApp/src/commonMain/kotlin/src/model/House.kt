package src.model

data class House(
    val id : Int,
    val name : String,
    val addresse: Addresse,
    val numberRoom : Int?,
    val isLarge : Boolean?,
    val dimension: SpaceDimension,
    val otherDetails : String,
    val image : List<ImageHouse>,
    val contrainteNegociation : Boolean,
    var certified : Boolean = false
)
