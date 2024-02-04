//Superclase Electrodomèstic
open class Electrodomestic {
    // Atributos
    private var preuBase: Double
    private var color: String
    private var consum: String
    private var pes: Int

    // Constructor
    constructor(pPreuBase:Double = 100.0, pColor:String = "blanc", pConsum:String = "G", pPes:Int = 5) {
        this.preuBase = pPreuBase
        this.color = pColor
        this.consum = pConsum
        this.pes = pPes
    }

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
    // Getters
    fun getPreuBase(): Double = preuBase
    fun getColor(): String = color
    fun getConsum(): String = consum
    fun getPes(): Int = pes
}