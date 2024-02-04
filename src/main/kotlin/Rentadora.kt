// Subclase Rentadora, que hereda de la superclase Electrodomèstic.
class Rentadora() : Electrodomestic() {
    // Atributo propio
    private var carrega:Int = 5

    // Método propio
    override fun preuFinal(): Double {
        return super.preuFinal() +
                when (carrega) {
                    6, 7 -> 55.0
                    8 -> 70.0
                    9 -> 85.0
                    10 -> 100.0
                    else -> 0.0
                }
    }
}