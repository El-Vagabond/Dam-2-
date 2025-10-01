# Guía Completa de Programación en Java para Principiantes

## Introducción

Java es un lenguaje de programación orientado a objetos, robusto y multiplataforma. Esta guía te ayudará a comprender los conceptos fundamentales para comenzar a programar en Java.

---

## 1. Tipos de Datos Primitivos

Los tipos de datos primitivos son los bloques básicos de construcción en Java. Representan valores simples y no son objetos.

### Tipos principales:

- **int**: Números enteros (sin decimales)
- **double**: Números con decimales (mayor precisión)
- **float**: Números con decimales (menor precisión)
- **boolean**: Valores lógicos (true o false)
- **char**: Un único carácter
- **byte**: Enteros pequeños (-128 a 127)
- **short**: Enteros medianos (-32,768 a 32,767)
- **long**: Enteros muy grandes

### Ejemplo:

```java
public class TiposDatos {
    public static void main(String[] args) {
        // Números enteros
        int edad = 25;
        byte diasSemana = 7;
        short año = 2025;
        long poblacionMundial = 8000000000L; // La 'L' indica que es long
        
        // Números decimales
        double precio = 19.99;
        float temperatura = 36.5f; // La 'f' indica que es float
        
        // Valores lógicos
        boolean esEstudiante = true;
        boolean esMayorDeEdad = false;
        
        // Caracteres
        char inicial = 'J';
        char simbolo = '@';
        
        // Imprimir valores
        System.out.println("Edad: " + edad);
        System.out.println("Precio: " + precio);
        System.out.println("Es estudiante: " + esEstudiante);
        System.out.println("Inicial: " + inicial);
    }
}
```

---

## 2. Variables y Constantes

Las variables son contenedores que almacenan datos que pueden cambiar durante la ejecución del programa. Las constantes son valores que no cambian.

### Variables

Se declaran especificando el tipo de dato seguido del nombre de la variable.

### Constantes (final)

Se declaran usando la palabra clave `final`. Por convención, se escriben en MAYÚSCULAS.

### Ejemplo:

```java
public class VariablesConstantes {
    public static void main(String[] args) {
        // Variables (pueden cambiar)
        int puntuacion = 0;
        String nombre = "Ana";
        double saldo = 1000.50;
        
        // Modificar variables
        puntuacion = 10;
        puntuacion = puntuacion + 5; // Ahora vale 15
        
        // Constantes (NO pueden cambiar)
        final double PI = 3.14159;
        final int DIAS_SEMANA = 7;
        final String NOMBRE_EMPRESA = "TechCorp";
        
        // PI = 3.14; // Esto daría ERROR porque PI es constante
        
        System.out.println("Puntuación: " + puntuacion);
        System.out.println("El valor de PI es: " + PI);
        System.out.println("Días de la semana: " + DIAS_SEMANA);
    }
}
```

---

## 3. Operadores Básicos

Los operadores permiten realizar operaciones con valores y variables.

### 3.1 Operadores Aritméticos

Realizan operaciones matemáticas básicas.

```java
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        // Suma
        int suma = a + b; // 13
        
        // Resta
        int resta = a - b; // 7
        
        // Multiplicación
        int multiplicacion = a * b; // 30
        
        // División
        int division = a / b; // 3 (división entera)
        double divisionDecimal = (double) a / b; // 3.333... (conversión a double)
        
        // Módulo (resto de la división)
        int modulo = a % b; // 1 (10 dividido entre 3 da resto 1)
        
        // Incremento y decremento
        int contador = 5;
        contador++; // contador = contador + 1 → ahora vale 6
        contador--; // contador = contador - 1 → ahora vale 5
        
        System.out.println("Suma: " + suma);
        System.out.println("División entera: " + division);
        System.out.println("División decimal: " + divisionDecimal);
        System.out.println("Módulo: " + modulo);
    }
}
```

### 3.2 Operadores Relacionales

Comparan dos valores y devuelven un resultado booleano (true o false).

```java
public class OperadoresRelacionales {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
        // Igual a
        boolean igual = (x == y); // false
        
        // Diferente de
        boolean diferente = (x != y); // true
        
        // Mayor que
        boolean mayor = (x > y); // false
        
        // Menor que
        boolean menor = (x < y); // true
        
        // Mayor o igual que
        boolean mayorIgual = (x >= 10); // true
        
        // Menor o igual que
        boolean menorIgual = (y <= 15); // false
        
        System.out.println("¿x es igual a y? " + igual);
        System.out.println("¿x es menor que y? " + menor);
        System.out.println("¿x es mayor o igual a 10? " + mayorIgual);
    }
}
```

### 3.3 Operadores Lógicos

Combinan expresiones booleanas.

```java
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean tieneLicencia = true;
        boolean esMayorDeEdad = true;
        boolean tieneExperiencia = false;
        
        // AND (&&) - Ambas condiciones deben ser verdaderas
        boolean puedeConducir = tieneLicencia && esMayorDeEdad; // true
        
        // OR (||) - Al menos una condición debe ser verdadera
        boolean puedePostular = tieneExperiencia || esMayorDeEdad; // true
        
        // NOT (!) - Invierte el valor booleano
        boolean esmenorDeEdad = !esMayorDeEdad; // false
        
        // Combinación de operadores
        boolean elegible = (tieneLicencia && esMayorDeEdad) || tieneExperiencia;
        
        System.out.println("¿Puede conducir? " + puedeConducir);
        System.out.println("¿Puede postular? " + puedePostular);
        System.out.println("¿Es menor de edad? " + esmenorDeEdad);
        System.out.println("¿Es elegible? " + elegible);
    }
}
```

---

## 4. Estructuras de Control

### 4.1 Condicionales (if, else if, else)

Permiten ejecutar código según se cumplan ciertas condiciones.

```java
public class Condicionales {
    public static void main(String[] args) {
        int edad = 18;
        int nota = 85;
        
        // If simple
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        
        // If-else
        if (edad >= 18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar aún");
        }
        
        // If-else if-else (múltiples condiciones)
        if (nota >= 90) {
            System.out.println("Calificación: A - Excelente");
        } else if (nota >= 80) {
            System.out.println("Calificación: B - Muy bueno");
        } else if (nota >= 70) {
            System.out.println("Calificación: C - Bueno");
        } else if (nota >= 60) {
            System.out.println("Calificación: D - Aprobado");
        } else {
            System.out.println("Calificación: F - Reprobado");
        }
        
        // Condiciones anidadas
        boolean tieneDinero = true;
        boolean tiendaAbierta = true;
        
        if (tieneDinero) {
            if (tiendaAbierta) {
                System.out.println("Puedes comprar");
            } else {
                System.out.println("La tienda está cerrada");
            }
        } else {
            System.out.println("No tienes dinero");
        }
    }
}
```

### 4.2 Switch

Evalúa una expresión y ejecuta el código correspondiente a cada caso.

```java
public class EstructuraSwitch {
    public static void main(String[] args) {
        int diaSemana = 3;
        String nombreDia;
        
        // Switch tradicional
        switch (diaSemana) {
            case 1:
                nombreDia = "Lunes";
                break; // Importante: evita que continúe a los siguientes casos
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default: // Se ejecuta si ningún caso coincide
                nombreDia = "Día inválido";
                break;
        }
        
        System.out.println("El día " + diaSemana + " es: " + nombreDia);
        
        // Ejemplo con caracteres
        char calificacion = 'B';
        
        switch (calificacion) {
            case 'A':
                System.out.println("Excelente trabajo");
                break;
            case 'B':
                System.out.println("Buen trabajo");
                break;
            case 'C':
                System.out.println("Trabajo aceptable");
                break;
            case 'D':
                System.out.println("Necesitas mejorar");
                break;
            case 'F':
                System.out.println("Reprobado");
                break;
            default:
                System.out.println("Calificación no válida");
        }
    }
}
```

---

## 5. Bucles (Loops)

Los bucles permiten repetir un bloque de código múltiples veces.

### 5.1 Bucle for

Útil cuando sabes cuántas veces quieres repetir el código.

```java
public class BucleFor {
    public static void main(String[] args) {
        // Estructura: for (inicialización; condición; actualización)
        
        // Contar del 1 al 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
        
        // Contar hacia atrás
        for (int i = 10; i >= 1; i--) {
            System.out.println("Cuenta regresiva: " + i);
        }
        
        // Saltos de 2 en 2 (números pares)
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Número par: " + i);
        }
        
        // Calcular la suma de los primeros 10 números
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i; // suma = suma + i
        }
        System.out.println("Suma total: " + suma); // 55
        
        // Tabla de multiplicar del 5
        int numero = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
```

### 5.2 Bucle while

Se ejecuta mientras la condición sea verdadera. Útil cuando no sabes cuántas iteraciones necesitas.

```java
public class BucleWhile {
    public static void main(String[] args) {
        // Contar del 1 al 5
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++; // Importante: actualizar el contador
        }
        
        // Ejemplo: encontrar el primer número mayor a 100 en una secuencia
        int numero = 1;
        while (numero <= 100) {
            numero = numero * 2; // Duplicar el número
        }
        System.out.println("Primer número mayor a 100: " + numero);
        
        // Ejemplo práctico: validación de entrada
        int intentos = 0;
        int password = 1234;
        int intento = 0;
        
        while (intento != password && intentos < 3) {
            System.out.println("Intento " + (intentos + 1) + " de 3");
            // En un programa real, aquí leerías la entrada del usuario
            intento = 1111; // Simulación
            intentos++;
        }
        
        if (intento == password) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado - Demasiados intentos");
        }
    }
}
```

### 5.3 Bucle do-while

Similar a while, pero garantiza que el código se ejecute al menos una vez.

```java
public class BucleDoWhile {
    public static void main(String[] args) {
        // La diferencia: primero ejecuta, luego evalúa la condición
        
        int numero = 1;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);
        
        // Ejemplo: se ejecuta al menos una vez, incluso si la condición es falsa
        int x = 10;
        do {
            System.out.println("Esto se imprime aunque x sea 10");
            x++;
        } while (x < 5); // Condición falsa, pero ya se ejecutó una vez
        
        // Caso práctico: menú que se muestra al menos una vez
        int opcion;
        int contador = 0;
        
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            
            // Simulación (en la realidad leerías del usuario)
            opcion = (contador == 0) ? 1 : 3;
            
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste Opción 1");
                    break;
                case 2:
                    System.out.println("Seleccionaste Opción 2");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
            contador++;
        } while (opcion != 3);
    }
}
```

---

## 6. Arrays (Arreglos)

Los arrays son estructuras que almacenan múltiples valores del mismo tipo.

### 6.1 Arrays Unidimensionales

```java
public class ArraysUnidimensionales {
    public static void main(String[] args) {
        // Declaración e inicialización - Forma 1
        int[] numeros = new int[5]; // Array de 5 enteros (inicializados en 0)
        
        // Asignar valores individualmente
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        
        // Acceder a los elementos (los índices empiezan en 0)
        System.out.println("Primer elemento: " + numeros[0]);
        System.out.println("Tercer elemento: " + numeros[2]);
        
        // Declaración e inicialización - Forma 2 (con valores)
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        
        // Longitud del array
        System.out.println("El array tiene " + diasSemana.length + " elementos");
        
        // Recorrer un array con for tradicional
        System.out.println("\nDías de la semana:");
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println((i + 1) + ". " + diasSemana[i]);
        }
        
        // Recorrer un array con for-each (más simple)
        System.out.println("\nNúmeros:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        // Ejemplo práctico: calcular promedio
        double[] calificaciones = {8.5, 9.0, 7.5, 10.0, 8.0};
        double suma = 0;
        
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        
        double promedio = suma / calificaciones.length;
        System.out.println("\nPromedio de calificaciones: " + promedio);
        
        // Encontrar el valor máximo
        int[] valores = {23, 67, 12, 89, 45};
        int maximo = valores[0];
        
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maximo) {
                maximo = valores[i];
            }
        }
        
        System.out.println("Valor máximo: " + maximo);
    }
}
```

### 6.2 Arrays Multidimensionales (Matrices)

```java
public class ArraysMultidimensionales {
    public static void main(String[] args) {
        // Matriz 3x3 (3 filas, 3 columnas)
        int[][] matriz = new int[3][3];
        
        // Asignar valores
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        
        // Inicialización directa
        int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Recorrer una matriz con bucles anidados
        System.out.println("Matriz completa:");
        for (int i = 0; i < numeros.length; i++) { // Recorre filas
            for (int j = 0; j < numeros[i].length; j++) { // Recorre columnas
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
        
        // Ejemplo práctico: tabla de multiplicar
        int[][] tablaMultiplicar = new int[10][10];
        
        // Llenar la tabla
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }
        
        // Mostrar la tabla del 5 (fila 4, porque los índices empiezan en 0)
        System.out.println("\nTabla del 5:");
        for (int j = 0; j < 10; j++) {
            System.out.println("5 x " + (j + 1) + " = " + tablaMultiplicar[4][j]);
        }
        
        // Matriz de diferentes tamaños por fila (matriz irregular)
        int[][] irregular = {
            {1, 2},
            {3, 4, 5, 6},
            {7}
        };
        
        System.out.println("\nMatriz irregular:");
        for (int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                System.out.print(irregular[i][j] + " ");
            }
            System.out.println();
        }
        
        // Ejemplo: calificaciones de estudiantes
        String[] estudiantes = {"Ana", "Luis", "María"};
        double[][] calificaciones = {
            {8.5, 9.0, 7.5}, // Calificaciones de Ana
            {7.0, 8.0, 9.5}, // Calificaciones de Luis
            {10.0, 9.5, 9.0} // Calificaciones de María
        };
        
        System.out.println("\nPromedios por estudiante:");
        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones[i].length;
            System.out.println(estudiantes[i] + ": " + promedio);
        }
    }
}
```

---

## 7. Entrada y Salida Básica

### 7.1 Salida con System.out

```java
public class SalidaDatos {
    public static void main(String[] args) {
        // println - Imprime y salta a nueva línea
        System.out.println("Hola, mundo");
        System.out.println("Esta es otra línea");
        
        // print - Imprime sin saltar de línea
        System.out.print("Hola ");
        System.out.print("mundo");
        System.out.println(); // Línea vacía
        
        // Imprimir variables
        String nombre = "Juan";
        int edad = 25;
        double altura = 1.75;
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        
        // Concatenar múltiples valores
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
        
        // Formato con printf (similar a C)
        System.out.printf("Nombre: %s, Edad: %d, Altura: %.2f metros%n", 
                         nombre, edad, altura);
        // %s = String, %d = entero, %.2f = decimal con 2 decimales, %n = nueva línea
    }
}
```

### 7.2 Entrada con Scanner

```java
import java.util.Scanner; // Importar la clase Scanner

public class EntradaDatos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Leer un String (una palabra)
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.next();
        
        // Leer una línea completa (con espacios)
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingresa tu apellido completo: ");
        String apellido = scanner.nextLine();
        
        // Leer un entero
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        // Leer un double
        System.out.print("Ingresa tu altura (en metros): ");
        double altura = scanner.nextDouble();
        
        // Leer un boolean
        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();
        
        // Mostrar los datos ingresados
        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Estudiante: " + esEstudiante);
        
        // IMPORTANTE: Cerrar el scanner cuando termines
        scanner.close();
        
        // Ejemplo práctico: calculadora simple
        Scanner calc = new Scanner(System.in);
        
        System.out.println("\n--- CALCULADORA ---");
        System.out.print("Ingresa el primer número: ");
        double num1 = calc.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = calc.nextDouble();
        
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir entre cero");
        }
        
        calc.close();
    }
}
```

---

## 8. Métodos (Funciones)

Los métodos son bloques de código reutilizables que realizan una tarea específica.

### 8.1 Estructura de un Método

```java
// modificadorAcceso tipoRetorno nombreMetodo(parametros) {
//     // código
//     return valor; // si el método retorna algo
// }
```

### 8.2 Ejemplos de Métodos

```java
public class Metodos {
    
    // Método sin parámetros y sin retorno (void)
    public static void saludar() {
        System.out.println("¡Hola! Bienvenido");
    }
    
    // Método con parámetros y sin retorno
    public static void saludarPersona(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }
    
    // Método sin parámetros pero con retorno
    public static int obtenerNumeroAleatorio() {
        return 42; // Retorna un valor
    }
    
    // Método con parámetros y con retorno
    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado; // Devuelve la suma
    }
    
    // Método que calcula el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
    
    // Método que verifica si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0; // Retorna true si es par
    }
    
    // Método que encuentra el mayor de tres números
    public static int encontrarMayor(int a, int b, int c) {
        int mayor = a;
        
        if (b > mayor) {
            mayor = b;
        }
        
        if (c > mayor) {
            mayor = c;
        }
        
        return mayor;
    }
    
    // Método que imprime un array
    public static void imprimirArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
    
    // Método que calcula el factorial de un número
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    // Método main - punto de entrada del programa
    public static void main(String[] args) {
        // Llamar a métodos sin retorno
        saludar();
        saludarPersona("Ana");
        
        // Llamar a métodos con retorno y usar el valor
        int numero = obtenerNumeroAleatorio();
        System.out.println("Número obtenido: " + numero);
        
        int suma = sumar(5, 3);
        System.out.println("5 + 3 = " + suma);
        
        // Usar el retorno directamente
        System.out.println("10 + 20 = " + sumar(10, 20));
        
        // Calcular área
        double area = calcularAreaRectangulo(5.0, 3.0);
        System.out.println("Área del rectángulo: " + area);
        
        // Verificar si es par
        if (esPar(8)) {
            System.out.println("8 es par");
        }
        
        // Encontrar el mayor
        int mayor = encontrarMayor(15, 23, 8);
        System.out.println("El mayor es: " + mayor);
        
        // Imprimir un array
        int[] numeros = {10, 20, 30, 40, 50};
        imprimirArray(numeros);
        
        // Calcular factorial
        System.out.println("Factorial de 5: " + factorial(5)); // 120
    }
}
```

### 8.3 Sobrecarga de Métodos

Puedes tener múltiples métodos con el mismo nombre pero diferentes parámetros.

```java
public class SobrecargaMetodos {
    
    // Sumar dos enteros
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    // Sumar tres enteros (sobrecarga)
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Sumar dos decimales (sobrecarga)
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // Java elige automáticamente qué método usar según los parámetros
        System.out.println("Suma de 2 enteros: " + sumar(5, 3));        // Llama al primer método
        System.out.println("Suma de 3 enteros: " + sumar(5, 3, 2));     // Llama al segundo método
        System.out.println("Suma de 2 decimales: " + sumar(5.5, 3.2));  // Llama al tercer método
    }
}
```

---

## 9. Conceptos Básicos de Clases y Objetos

Java es un lenguaje orientado a objetos. Las clases son plantillas para crear objetos, y los objetos son instancias de esas clases.

### 9.1 ¿Qué es una Clase?

Una clase es como un molde o plano que define las características (atributos) y comportamientos (métodos) que tendrán los objetos creados a partir de ella.

### 9.2 ¿Qué es un Objeto?

Un objeto es una instancia específica de una clase. Por ejemplo, si "Coche" es una clase, entonces "mi coche rojo" es un objeto.

### 9.3 Ejemplo Básico de Clase

```java
// Definición de una clase Persona
public class Persona {
    // Atributos (características)
    String nombre;
    int edad;
    double altura;
    
    // Constructor - método especial para crear objetos
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;   // 'this' se refiere al objeto actual
        this.edad = edad;
        this.altura = altura;
    }
    
    // Constructor sin parámetros (por defecto)
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.altura = 0.0;
    }
    
    // Métodos (comportamientos)
    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre + 
                         " y tengo " + edad + " años");
    }
    
    public void caminar() {
        System.out.println(nombre + " está caminando");
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    public void cumplirAños() {
        edad++;
        System.out.println("¡Feliz cumpleaños! Ahora tienes " + edad + " años");
    }
}
```

### 9.4 Usando la Clase Persona

```java
public class UsarPersona {
    public static void main(String[] args) {
        // Crear objetos (instanciar la clase)
        Persona persona1 = new Persona("Ana", 25, 1.65);
        Persona persona2 = new Persona("Carlos", 17, 1.80);
        Persona persona3 = new Persona(); // Usa el constructor sin parámetros
        
        // Acceder a los atributos
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
        
        // Llamar a los métodos
        persona1.presentarse();
        persona2.presentarse();
        persona1.caminar();
        
        // Usar métodos que retornan valores
        if (persona1.esMayorDeEdad()) {
            System.out.println(persona1.nombre + " es mayor de edad");
        }
        
        if (!persona2.esMayorDeEdad()) {
            System.out.println(persona2.nombre + " es menor de edad");
        }
        
        // Modificar atributos
        persona3.nombre = "María";
        persona3.edad = 30;
        persona3.presentarse();
        
        // Llamar a método que modifica el objeto
        persona1.cumplirAños();
    }
}
```

### 9.5 Ejemplo Práctico: Clase Cuenta Bancaria

```java
public class CuentaBancaria {
    // Atributos
    String titular;
    String numeroCuenta;
    double saldo;
    
    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    
    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("La cantidad debe ser positiva");
        }
    }
    
    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("La cantidad debe ser positiva");
        }
    }
    
    // Método para consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
    
    // Método para mostrar información de la cuenta
    public void mostrarInformacion() {
        System.out.println("--- Información de la Cuenta ---");
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}
```

### 9.6 Usando la Clase CuentaBancaria

```java
public class UsarCuentaBancaria {
    public static void main(String[] args) {
        // Crear una cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", "123456789", 1000.0);
        
        // Mostrar información inicial
        cuenta.mostrarInformacion();
        
        // Realizar operaciones
        cuenta.depositar(500.0);
        cuenta.retirar(200.0);
        cuenta.consultarSaldo();
        
        // Intento de retiro con saldo insuficiente
        cuenta.retirar(2000.0);
        
        // Crear otra cuenta
        CuentaBancaria cuenta2 = new CuentaBancaria("María López", "987654321", 5000.0);
        cuenta2.mostrarInformacion();
    }
}
```

### 9.7 Estructura Básica de un Programa Java

Todo programa Java debe tener al menos una clase con un método `main`.

```java
public class MiPrograma {
    // El método main es el punto de entrada del programa
    public static void main(String[] args) {
        // Aquí va el código que se ejecutará
        System.out.println("Este es mi primer programa en Java");
        
        // Puedes crear objetos, llamar métodos, etc.
        Persona persona = new Persona("Ana", 25, 1.65);
        persona.presentarse();
    }
}
```

**Componentes importantes:**

1. **public class MiPrograma**: Define la clase (debe coincidir con el nombre del archivo: MiPrograma.java)
2. **public static void main(String[] args)**: El método principal que Java ejecuta primero
3. **System.out.println()**: Para mostrar mensajes en la consola

---

## 10. Consejos y Buenas Prácticas

### Convenciones de Nomenclatura

- **Clases**: Empiezan con mayúscula, usando CamelCase → `Persona`, `CuentaBancaria`
- **Métodos y variables**: Empiezan con minúscula, usando camelCase → `calcularArea`, `nombreCompleto`
- **Constantes**: Todo en MAYÚSCULAS con guiones bajos → `PI`, `DIAS_SEMANA`, `MAX_INTENTOS`

### Comentarios

```java
// Comentario de una línea

/*
 * Comentario
 * de múltiples
 * líneas
 */

/**
 * Comentario de documentación (JavaDoc)
 * Se usa para documentar clases y métodos
 */
```

### Indentación y Estilo

```java
// Buen estilo: código bien indentado y espaciado
public class Ejemplo {
    public static void main(String[] args) {
        if (condicion) {
            // código indentado
            for (int i = 0; i < 10; i++) {
                // más indentación
                System.out.println(i);
            }
        }
    }
}
```

### Consejos para Principiantes

1. **Practica constantemente**: La programación se aprende programando
2. **Empieza con programas simples**: Calculadoras, juegos básicos, conversores
3. **Lee el código de otros**: Aprende de ejemplos y proyectos existentes
4. **Usa nombres descriptivos**: `edad` es mejor que `e`, `calcularPromedio` es mejor que `calc`
5. **Comenta tu código**: Explica qué hace cada parte, especialmente si es compleja
6. **Prueba tu código**: Verifica que funcione con diferentes valores
7. **Aprende de los errores**: Los errores son oportunidades de aprendizaje
8. **No te rindas**: La programación puede ser desafiante al principio, pero mejora con la práctica

---

## 11. Proyecto Integrador: Sistema de Calificaciones

Aquí tienes un ejemplo completo que integra todos los conceptos aprendidos:

```java
import java.util.Scanner;

public class SistemaCalificaciones {
    
    // Método para calcular el promedio
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
    
    // Método para determinar la letra de calificación
    public static char obtenerLetra(double promedio) {
        if (promedio >= 90) {
            return 'A';
        } else if (promedio >= 80) {
            return 'B';
        } else if (promedio >= 70) {
            return 'C';
        } else if (promedio >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    // Método para verificar si está aprobado
    public static boolean estaAprobado(double promedio) {
        return promedio >= 60;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar información del estudiante
        System.out.println("=== SISTEMA DE CALIFICACIONES ===");
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        
        System.out.print("¿Cuántas materias tiene? ");
        int numMaterias = scanner.nextInt();
        
        // Arrays para almacenar nombres y calificaciones
        String[] materias = new String[numMaterias];
        double[] calificaciones = new double[numMaterias];
        
        // Leer información de cada materia
        scanner.nextLine(); // Limpiar buffer
        for (int i = 0; i < numMaterias; i++) {
            System.out.print("\nMateria " + (i + 1) + ": ");
            materias[i] = scanner.nextLine();
            
            System.out.print("Calificación de " + materias[i] + ": ");
            calificaciones[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer
        }
        
        // Calcular promedio
        double promedio = calcularPromedio(calificaciones);
        char letra = obtenerLetra(promedio);
        boolean aprobado = estaAprobado(promedio);
        
        // Mostrar resultados
        System.out.println("\n======= REPORTE DE CALIFICACIONES =======");
        System.out.println("Estudiante: " + nombre);
        System.out.println("\nCalificaciones por materia:");
        
        for (int i = 0; i < numMaterias; i++) {
            System.out.printf("%-20s: %.2f%n", materias[i], calificaciones[i]);
        }
        
        System.out.println("\n--- Resumen ---");
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Calificación letra: " + letra);
        System.out.println("Estado: " + (aprobado ? "APROBADO" : "REPROBADO"));
        
        // Mensaje final según el desempeño
        if (promedio >= 90) {
            System.out.println("¡Excelente trabajo!");
        } else if (promedio >= 70) {
            System.out.println("Buen trabajo, sigue así.");
        } else if (promedio >= 60) {
            System.out.println("Aprobado, pero hay espacio para mejorar.");
        } else {
            System.out.println("Necesitas estudiar más para la próxima.");
        }
        
        scanner.close();
    }
}
```

---

