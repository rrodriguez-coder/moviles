package exercici2

class Inventario {
    private var productoList = ArrayList<Producto>()



    fun addProducto(producto: Producto){
        productoList.add(producto)
    }
    fun leerLista(): ArrayList<Producto> {
        return productoList
    }
}

private fun ArrayList<Producto>.sort() {
    TODO("Not yet implemented")
}
