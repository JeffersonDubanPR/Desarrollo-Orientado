class Libro {
    var titulo: String = ""
    var autor: String = ""
    var ISBN: String = ""
    var numPaginas: Int = 0
    var precio: Int = 0
    var disponible: Int = 0

    constructor()

    constructor(titulo: String, autor: String, ISBN: String, numPaginas: Int, precio: Int, disponible: Int) {
        this.titulo = titulo
        this.autor = autor
        this.ISBN = ISBN
        this.numPaginas = numPaginas
        this.precio = precio
        this.disponible = disponible
    }

    override fun toString(): String {
        return "Libro(Titulo='$titulo', Autor='$autor', ISBN='$ISBN', Páginas='$numPaginas', Precio=$precio, Disponible=$disponible)"
    }

    fun prestarLibro(): Boolean {
        return if (disponible > 0) {
            disponible--
            println("Libro con ISBN $ISBN prestado exitosamente.")
            true
        } else {
            println("No hay ejemplares disponibles del libro con ISBN $ISBN.")
            false
        }
    }

    fun devolverLibro(): Int {
        disponible++
        println("Libro con ISBN $ISBN devuelto exitosamente.")
        return disponible
    }

    fun mostrarInfo() {
        println(toString())
    }
}


