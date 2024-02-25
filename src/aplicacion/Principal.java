package aplicacion;

import mates.Operaciones;

public class Principal {

    public static void main(String[] args) {
        // Ejemplos de uso de las funciones
        System.out.println("Suma de 0 a 5: " + Operaciones.suma(5));
        System.out.println("Factorial de 5: " + Operaciones.factorial(5));
        System.out.println("Potencia de 2^3: " + Operaciones.potencia(2, 3));
        System.out.println("Suma de lista [1, 2, 3, 4]: " + Operaciones.sumaLista(List.of(1, 2, 3, 4)));
        System.out.println("Media de lista [1, 2, 3, 4, 5]: " + Operaciones.media(List.of(1, 2, 3, 4, 5)));
        System.out.println("Desviación típica de lista [1, 2, 3, 4, 5]: " + Operaciones.desviacionTipica(List.of(1, 2, 3, 4, 5)));
        System.out.println("Suma de los primeros números pares hasta 9: " + Operaciones.sumaPares(9));
        System.out.println("Suma de los elementos pares de lista [1, 2, 3, 4]: " + Operaciones.sumaParesLista(List.of(1, 2, 3, 4)));
        System.out.println("Lista de números pares hasta 9: " + Operaciones.listaPares(9));
        System.out.println("Lista de números pares de [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]: " + Operaciones.obtenerListaPares(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        System.out.println("Producto escalar de [1, 2, 3] y [2, 4, 6]: " + Operaciones.calcularProductoEscalar(List.of(1, 2, 3), List.of(2, 4, 6)));
    }
}

