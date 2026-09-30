package Exercici1
import java.util.Scanner



class Main
fun main() {

    calcularPrecio(100F, 20F)
    controlNul()

}
// Impressió amb Control de Nuls: Dissenyar una funció que rebi una variable opcional (String?) i la mostri per terminal. Si la variable conté text, l'ha d'imprimir;
// si és null o està buida, ha de mostrar un missatge alternatiu per defecte fent servir l'operador (?:).

fun controlNul (opcional: String? = null) {
    println(opcional ?: "Nulo")

// Càlcul de Descompte amb Paràmetres: Dissenyar una funció pura que rebi dos paràmetres (un preu de tipus numèric i un percentatge de descompte)
// i retorni el preu final després d'aplicar aquest descompte.
}
fun calcularPrecio(precio: Float, descuento: Float): Unit = println(precio-(precio*(descuento/100)))
