package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    var suma = 0

    for (i in 1..n) {
        suma += i
    }

    return suma
}

fun contarPares(inicio: Int, fin: Int): Int {
    var cantidad = 0

    for (i in inicio..fin) {
        if (i % 2 == 0) {
            cantidad++
        }
    }

    return cantidad
}
fun fibonacci(n: Int): Int {
    var a = 0
    var b = 1

    for (i in 0 until n) {
        val siguiente = a + b
        a = b
        b = siguiente
    }

    return a
}

fun factorial(n: Int): Int {
    var resultado = 1

    for (i in 1..n) {
        resultado *= i
    }

    return resultado
}

fun encontrarMaximo(numeros: List<Int>): Int {
    var maximo = numeros[0]

    for (numero in numeros) {
        if (numero > maximo) {
            maximo = numero
        }
    }

    return maximo
}

fun encontrarMinimo(numeros: List<Int>): Int {
    var minimo = numeros[0]

    for (numero in numeros) {
        if (numero < minimo) {
            minimo = numero
        }
    }

    return minimo
}

fun sumarLista(numeros: List<Int>): Int {
    var suma = 0

    for (numero in numeros) {
        suma += numero
    }

    return suma
}


fun inverter(texto: String): String {
    return texto.reversed()
}

fun contarVocales(texto: String): Int {
    var cantidad = 0

    for (letra in texto) {
        if (letra.lowercaseChar() in "aeiou") {
            cantidad++
        }
    }

    return cantidad
}


fun esPalindromo(texto: String): Boolean {
    val textoLimpio = texto.replace(" ", "")
    return textoLimpio == textoLimpio.reversed()
}

fun tablaMultiplicar(numero: Int): List<Int> {
    val tabla = mutableListOf<Int>()

    for (i in 1..10) {
        tabla.add(numero * i)
    }

    return tabla
}
