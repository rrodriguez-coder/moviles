package exercici2

class Producto(private val id : Int, private val nombre: String, private val precio: Int, private var stock : Int, private val categoria: Categoria) {
    fun getNombre(): String {
        return nombre
    }

    fun getid (): Int {
        return id
    }

    fun setPrecio(precioNuevo : Int) {
        precio = precioNuevo
    }

    fun setStock(stockNuevo: Int) {
        stock = stockNuevo
    }

}

