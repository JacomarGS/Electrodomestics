//Subclase Televisió, que hereda de la superclase Electrodom'estic
class Televisio(): Electrodomestic() {
    // Atributo propio
    private var mida:Int = 28

    // Método propio
    override fun preuFinal(): Double {
        return super.preuFinal() +
                when (mida) {
                    in 29..32 -> 50.0
                    in 33..42 -> 100.0
                    in 43..50 -> 150.0
                    else -> 200.0
                }
    }
}