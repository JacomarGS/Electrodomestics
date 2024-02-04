fun main() {
    // 1. Crear diez electrodomésticos diferentes, dos rentadoras y dos televisions.
    val electrodomestics = arrayOf(
        Electrodomestic(200.0, pColor = "negre", "B", pPes = 10),
        Electrodomestic(150.0, "gris", "C", 15),
        Electrodomestic(300.0, "blanc", "A", 25),
        Electrodomestic(250.0, "platejat", "D", 30),
        Electrodomestic(180.0, "blanc", "E", 8),
        Electrodomestic(220.0, "negre", "F", 18),
        Rentadora(5),
        Rentadora(8),
        Televisio(28),
        Televisio(52)
    )

    // 2. Mostrar cada electródoméstico con sus propios atributos.
    for (index in electrodomestics.indices) {
        val electrodomestic = electrodomestics[index]
        println("Electrodomèstic ${index + 1}:")
        println("Preu base: ${electrodomestic.getPreuBase()}€")
        println("Color: ${electrodomestic.getColor()}")
        println("Consum: ${electrodomestic.getConsum()}")
        println("Pes: ${electrodomestic.getPes()}kg")
        println("Preu final: ${electrodomestic.preuFinal()}€")
        println()
    }

    // 3. Calcular el precio base y el precio final por tipo de electrodoméstico.
    var preuBaseElectrodomestics = 0.0
    var preuFinalElectrodomestics = 0.0
    var preuBaseRentadores = 0.0
    var preuFinalRentadores = 0.0
    var preuBaseTelevisions = 0.0
    var preuFinalTelevisions = 0.0

    for (electrodomestic in electrodomestics) {
        when (electrodomestic) {
            is Rentadora -> {
                preuBaseRentadores += electrodomestic.getPreuBase()
                preuFinalRentadores += electrodomestic.preuFinal()
            }
            is Televisio -> {
                preuBaseTelevisions += electrodomestic.getPreuBase()
                preuFinalTelevisions += electrodomestic.preuFinal()
            }
            else -> {
                preuBaseElectrodomestics += electrodomestic.getPreuBase()
                preuFinalElectrodomestics += electrodomestic.preuFinal()
            }
        }
    }

    println("Electrodomèstics:")
    println("Preu base: $preuBaseElectrodomestics€")
    println("Preu final: $preuFinalElectrodomestics€")
    println()

    println("Rentadores:")
    println("Preu base: $preuBaseRentadores€")
    println("Preu final: $preuFinalRentadores€")
    println()

    println("Televisions:")
    println("Preu base: $preuBaseTelevisions€")
    println("Preu final: $preuFinalTelevisions€")
    println()
}