fun main() { // codigo de um aluno > aula sobrecarga de construtores

        //calling 2 constructor
        val f1 = Vehicle("Ferrari", model = "Enzo", year = 1987 , color = "Red")
        f1.turnOn()
    f1.stop()

        //calling first constructor
        val corsinha = Vehicle("Corsinha", "Wind", false)
        corsinha.showVehicleInfo()
    }

    class Vehicle(name: String, model: String, isBike: Boolean) {
        constructor(name: String, model: String, year: Int, color: String) : this(name, model, false)

        val name = name
        val model = model
        val isBike = isBike

        fun turnOn() {
            println("$name is on")
            accelerate()
        }

        fun stop() {
            println("$name has stopped")
        }

        fun accelerate() {
            println("vrumm vrumm!")
        }

        fun showVehicleInfo() {
            println(
                """
            Nome: $name
            Modelo: $model
        """.trimIndent()
            )
        }
    }
