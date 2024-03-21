package src.model

data class Secteur(
    val commune : Commune,
    val isFlood : Boolean,
    val isElectricity : Boolean,
    val isWater : Boolean,
)
