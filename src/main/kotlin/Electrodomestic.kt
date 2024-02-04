//Superclase Electrodomèstic
open class Electrodomestic () {
    // Atributos
    private var preuBase: Double = 100.0
    private var color: String = "blanc"
    private var consum: String = "G"
    private var pes: Int = 5

    // Métodos
    open fun preuFinal(): Double {
        return preuBase +
                when (consum) {
                    "A" -> 35.0
                    "B" -> 30.0
                    "C" -> 25.0
                    "D" -> 20.0
                    "E" -> 15.0
                    "F" -> 10.0
                    else -> 0.0
                } +
                when {
                    pes in 6..20 -> 20.0
                    pes in 21..50 -> 50.0
                    pes in 51..80 -> 80.0
                    else -> 100.0
                }
    }
}