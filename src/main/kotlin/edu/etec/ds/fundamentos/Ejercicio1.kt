package edu.etec.ds.fundamentos

fun suma(a: Int, b: Int): Int {
    return a + b
}

fun resta(a: Int, b: Int): Int {
    return a - b
}

fun multiplicacion(a: Int, b: Int): Int {
   return a * b
}

fun division(a: Int, b: Int): Int {
   return a / b
}

fun modulo(a: Int, b: Int): Int {
    return a % b
}

fun esMayorQue(a: Int, b: Int): Boolean {
    if (a > b) {
        return true
    } else {
        return false
    }
}
fun esMenorQue(a: Int, b: Int): Boolean {
    if (a < b) {
        return true
    } else {
        return false
    }
}


fun sonIguales(a: Int, b: Int): Boolean {
    if (a == b) {
        return true
    } else {
        return false
    }
}

fun esPar(numero: Int): Boolean {
        return numero % 2 == 0
    }

fun esImpar(numero: Int): Boolean {
    return numero % 2 != 0
}

fun valorAbsoluto(numero: Int): Int {
        if (numero < 0) {
            return -numero
        } else {
            return numero
        }
    }

fun maximo(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
fun minimo(a: Int, b: Int): Int {
    if (a < b) {
        return a
    } else {
        return b
    }
}
