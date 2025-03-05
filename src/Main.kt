//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val libros = mutableListOf(
        Libro("Susurros y Sombras", "Luis Martos", "a2t", 200, 80000, 20),
        Libro("Ana de Armas", "Juan Tartara", "a3t", 300, 120000, 10),
        Libro("Cristian Cano", "Principios de Java", "a4t", 1000, 190000, 10)
    )

    while (true) {
        println("\nMenú:")
        println("1. Prestar libro")
        println("2. Devolver libro")
        println("3. Mostrar información de los libros")
        println("4. Salir")
        print("Seleccione una opción: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("Libros disponibles:")
                libros.forEach { println("ISBN: ${it.ISBN}, Título: ${it.titulo}, Disponibles: ${it.disponible}") }
                print("Ingrese el ISBN del libro ")
                val isbn = readLine()
                val libro = libros.find { it.ISBN == isbn }
                if (libro != null) libro.prestarLibro() else println("Libro no encontrado.")
            }
            2 -> {
                println("Libros Disponibles")
                libros.forEach { println("ISBN: ${it.ISBN}, Título: ${it.titulo}") }
                print("Ingrese el ISBN del libro a devolver: ")
                val isbn = readLine()
                val libro = libros.find { it.ISBN == isbn }
                if (libro != null) libro.devolverLibro() else println("Libro no encontrado")
            }
            3 -> libros.forEach { it.mostrarInfo() }
            4 -> {
                println("SALIR")
                break
            }
            else -> println("Opción no válida. Intente de nuevo.")
        }
    }
}
