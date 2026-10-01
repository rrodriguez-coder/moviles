package exercici2

class Inventario {
    private var productoList = mutableListOf<Producto>()


    fun addProducto(producto: Producto) {
        productoList.add(producto)
    }

    fun leerLista(): List<Producto> {
        return listOf<Producto>(productoList)
    }

    fun modificarPrecio(precioNuevo : Int, id : Int) {
        productoList.find { producto -> producto.getid() == id }?.setPrecio(precioNuevo)
    }

    fun modificarStock(stockNuevo : Int, id : Int) {
        productoList.find { producto -> producto.getid() == id }?.setPrecio(stockNuevo)
    }
    }