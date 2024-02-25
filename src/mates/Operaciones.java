package mates;

import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    // 1. La suma 0 + 1 + 2 + ... + n.
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    // 2. El factorial de un número.
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // 3. La potencia n-ésima de un número natural.
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    // 4. La suma de los elementos de una lista de números.
    public static int sumaLista(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            return lista.get(0) + sumaLista(lista.subList(1, lista.size()));
        }
    }

    // 5. La media aritmética de una lista de números.
    public static double media(List<Integer> lista) {
        return (double) sumaLista(lista) / lista.size();
    }

    // 6. La desviación típica de una lista de números.
    public static double desviacionTipica(List<Integer> lista) {
        double media = media(lista);
        double sumatoria = 0;
        for (int num : lista) {
            sumatoria += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumatoria / lista.size());
    }

    // 7. La suma de los primeros números pares hasta n asumiendo n ≥ 2.
    public static int sumaPares(int n) {
        if (n <= 2) {
            return 0;
        } else {
            if (n % 2 == 0) {
                return n + sumaPares(n - 2);
            } else {
                return sumaPares(n - 1);
            }
        }
    }

    // 8. La suma de los elementos pares de una lista de enteros.
    public static int sumaParesLista(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            int num = lista.get(0);
            if (num % 2 == 0) {
                return num + sumaParesLista(lista.subList(1, lista.size()));
            } else {
                return sumaParesLista(lista.subList(1, lista.size()));
            }
        }
    }

    // 9. Dada una lista de números naturales mayores o iguales que 2, obtiene otra lista con los números pares de la lista inicial, en el mismo orden y respetando los números repetidos.
    public static List<Integer> obtenerListaPares(List<Integer> lista) {
        List<Integer> pares = new ArrayList<>();
        if (!lista.isEmpty()) {
            int num = lista.get(0);
            if (num >= 2 && num % 2 == 0) {
                pares.add(num);
            }
            pares.addAll(obtenerListaPares(lista.subList(1, lista.size())));
        }
        return pares;
    }

    // 10. La lista de los primeros números pares hasta n asumiendo n ≥ 2.
    public static List<Integer> listaPares(int n) {
        List<Integer> pares = new ArrayList<>();
        if (n >= 2) {
            if (n % 2 == 0) {
                pares.add(n);
            }
            pares.addAll(listaPares(n - 1));
        }
        return pares;
    }

    // 11. Producto escalar de dos listas de números no vacías y del mismo tamaño.
    public static int calcularProductoEscalar(List<Integer> lista1, List<Integer> lista2) {
        if (lista1.isEmpty() || lista2.isEmpty() || lista1.size() != lista2.size()) {
            throw new IllegalArgumentException("Listas no válidas para calcular el producto escalar.");
        }
        return lista1.get(0) * lista2

