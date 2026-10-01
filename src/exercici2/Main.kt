package exercici2

fun main() {
        var inventario = Inventario()
        inventario.addProducto(
            producto = Producto(
                id = 1,
                nombre = "macarrones",
                precio = 10,
                stock = 5,
                categoria = Categoria.ALIMENTACIO
            )
        )
    inventario.addProducto(
        producto = Producto(
            id = 0,
            nombre = "espagetis",
            precio = 10,
            stock = 5,
            categoria = Categoria.ALIMENTACIO
        )
    )
        println(inventario.leerLista())
}
