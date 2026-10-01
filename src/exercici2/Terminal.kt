package exercici2

import java.sql.SQLOutput

class Terminal {

    fun displayMenu(): Int {
        println("---------------------------------------------------------")
        println("----------Bienvenido al inventario de Mercadona----------")
        println("Opciones:")
        println("1: Añadir un producto al inventario")
        println("2: Listar los productos actuales")
        println("3: Modificar precio o stock de un producto")
        println("4: Salir")
        return readln().toInt()
    }

    fun errorNumeroIncorrecto() {
        println("Error: Esa opcion no existe")
    }
    fun errorDatoIncorrecto() {
        println("Error: Ese dato introducido es incorrecto.")
    }

    fun printarLista(lista: MutableList<Producto>) {
        lista.forEach(::println)
    }
    fun añadirProducto(): Producto {
        var id : Int
        var nombre : String
        var precio : Int
        var stock : Int
        var categoria : Categoria
        println("Introduzca el id del producto")
        id = readln().toInt()
        println("Introduzca el nombre del producto")
        nombre = readln()
        println("Introduzca el precio del producto")
        precio = readln().toInt()
        println("Introduzca el stock del producto")
        stock = readln().toInt()
        println("Introduzca el categoria del producto")
        println("1: Alimentacion")
        categoria = Categoria.ALIMENTACIO
    }
}