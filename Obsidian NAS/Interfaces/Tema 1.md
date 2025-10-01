# Guía Completa para Aprobar el Examen de Interfaces Java Swing

## 📚 Índice - 

[[#1️⃣ Conceptos Básicos|1️⃣ Conceptos Básicos]]
- [[#2️⃣ Layouts (Administradores de Diseño)|2️⃣ Layouts (Administradores de Diseño)]]
- [[#3️⃣ Componentes Esenciales|3️⃣ Componentes Esenciales]]
- [[#4️⃣ Eventos y Listeners|4️⃣ Eventos y Listeners]]
- [[#5️⃣ Código Esencial para el Examen|5️⃣ Código Esencial para el Examen]]
- [[#6️⃣ Ejemplo Completo: Calculadora 3 Números|6️⃣ Ejemplo Completo: Calculadora 3 Números]]
- [[#7️⃣ Pasos para Resolver el Examen|7️⃣ Pasos para Resolver el Examen]]
- [[#8️⃣ Errores Comunes y Soluciones|8️⃣ Errores Comunes y Soluciones]]
- [[#9️⃣ Checklist para el Examen|9️⃣ Checklist para el Examen]]
- [[#🔟 Código de Referencia Rápida|🔟 Código de Referencia Rápida]]



---

## 1️⃣ Conceptos Básicos

### ¿Qué es Java Swing?

- Es una librería de Java para crear interfaces gráficas
- Usarás el IDE Eclipse con WindowBuilder (plugin que facilita el diseño visual)

### Componentes principales

- **JFrame**: La ventana completa de tu aplicación
- **ContentPane**: El contenedor dentro del frame donde pones los componentes
- **Layout**: Define cómo se organizan los componentes

### IDE y Herramientas

- **IDE Eclipse**: Entorno de desarrollo integrado
- **JDK 24**: Kit de desarrollo de Java
- **WindowBuilder**: Plugin para diseño visual de interfaces

---

## 2️⃣ Layouts (Administradores de Diseño)

Los layouts controlan cómo se organizan los componentes dentro de un contenedor.

### FlowLayout - Organización horizontal

```java
frame.getContentPane().setLayout(new FlowLayout());
```

- Los componentes se colocan de izquierda a derecha
- Cuando no cabe más, pasa a la siguiente línea

### GridLayout - Organización en cuadrícula

```java
frame.getContentPane().setLayout(new GridLayout(3, 2)); // 3 filas, 2 columnas
```

- Organiza los componentes en forma de tabla
- Todos los espacios tienen el mismo tamaño

### BorderLayout - División en 5 zonas

```java
frame.getContentPane().setLayout(new BorderLayout());
```

- Divide en: NORTH, SOUTH, EAST, WEST, CENTER

### Absolute Layout - Posicionamiento libre

```java
frame.getContentPane().setLayout(null);
component.setBounds(x, y, width, height);
```

- Posicionamiento manual con coordenadas
- Mayor control pero menos flexible

---

## 3️⃣ Componentes Esenciales

### JLabel - Etiqueta de texto

```java
JLabel lblNombre = new JLabel("Nombre:");
frame.getContentPane().add(lblNombre);
```

**Uso:** Mostrar texto estático (títulos, descripciones)

### JTextField - Campo de texto para entrada

```java
JTextField txtNombre = new JTextField();
txtNombre.setColumns(10); // Ancho del campo
frame.getContentPane().add(txtNombre);

// Configuraciones útiles
txtNombre.setText("Texto inicial"); // Establecer texto
txtNombre.setEditable(false); // Solo lectura
```

**Uso:** Permitir al usuario escribir texto o números

### JButton - Botón

```java
JButton btnCalcular = new JButton("Calcular");
frame.getContentPane().add(btnCalcular);
```

**Uso:** Ejecutar acciones cuando se hace clic

### JRadioButton - Botones de opción

```java
JRadioButton rdbOpcion1 = new JRadioButton("Opción 1");
JRadioButton rdbOpcion2 = new JRadioButton("Opción 2");

// Para que solo se pueda seleccionar uno:
ButtonGroup grupo = new ButtonGroup();
grupo.add(rdbOpcion1);
grupo.add(rdbOpcion2);
```

**Uso:** Seleccionar una opción entre varias (excluyentes)

### JCheckBox - Casilla de verificación

```java
JCheckBox chkAceptar = new JCheckBox("Acepto términos");
```

**Uso:** Opciones que se pueden marcar/desmarcar independientemente

---

## 4️⃣ Eventos y Listeners

### ¿Qué son?

- **Eventos**: Acciones que ocurren (clic, escribir, etc.)
- **Listeners**: "Escuchan" eventos y ejecutan código

### ActionListener para botones

#### Patrón básico

```java
btnCalcular.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // AQUÍ VA EL CÓDIGO QUE SE EJECUTA AL HACER CLIC
    }
});
```

#### Ejemplo completo

```java
btnSumar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // 1. Obtener datos
        String texto1 = txtNumero1.getText();
        String texto2 = txtNumero2.getText();
        
        // 2. Convertir
        int num1 = Integer.parseInt(texto1);
        int num2 = Integer.parseInt(texto2);
        
        // 3. Procesar
        int resultado = num1 + num2;
        
        // 4. Mostrar
        txtResultado.setText(String.valueOf(resultado));
    }
});
```

---

## 5️⃣ Código Esencial para el Examen

### A) Obtener texto de un JTextField

```java
String texto = txtCampo.getText();
```

### B) Establecer texto en un JTextField

```java
txtCampo.setText("Nuevo texto");
```

### C) Convertir String a Integer

```java
String numeroTexto = txtNumero.getText();
int numero = Integer.parseInt(numeroTexto);
```

### D) Convertir Integer a String

```java
int numero = 42;
String textoNumero = String.valueOf(numero);
// O también:
String textoNumero = "" + numero;
```

### E) Convertir String a Double (decimales)

```java
String decimalTexto = txtDecimal.getText();
double decimal = Double.parseDouble(decimalTexto);
```

### F) Mostrar mensaje emergente (JOptionPane)

```java
// Mensaje simple
JOptionPane.showMessageDialog(null, "Este es el mensaje");

// Mensaje con título y tipo
JOptionPane.showMessageDialog(null, 
    "Error: Debes introducir números", 
    "Error de formato", 
    JOptionPane.ERROR_MESSAGE);

// Tipos de mensajes
JOptionPane.INFORMATION_MESSAGE
JOptionPane.WARNING_MESSAGE
JOptionPane.ERROR_MESSAGE
JOptionPane.QUESTION_MESSAG
```

### G) Manejo de errores con try-catch

```java
try {
    int numero = Integer.parseInt(txtNumero.getText());
    // Código que puede fallar
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, 
        "Error: Debes introducir solo números");
}
```

### H) Operaciones matemáticas básicas

```java
int suma = a + b + c;
int resta = a - b - c;
int multiplicacion = a * b * c;
int division = a / b; // División entera
double divisionDecimal = (double)a / b; // División con decimales
int modulo = a % b; // Resto de la división
```

---

## 6️⃣ Ejemplo Completo: Calculadora 3 Números

```java
package ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Calculadora {

    private JFrame frame;
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtNumero3;
    private JTextField txtResultado;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculadora window = new Calculadora();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculadora() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        // Configuración del frame principal
        frame = new JFrame();
        frame.setTitle("Calculadora de 3 Números");
        frame.setBounds(100, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        // PRIMER NÚMERO
        JLabel lblNumero1 = new JLabel("Número 1:");
        frame.getContentPane().add(lblNumero1);
        
        txtNumero1 = new JTextField();
        txtNumero1.setColumns(10);
        frame.getContentPane().add(txtNumero1);
        
        // SEGUNDO NÚMERO
        JLabel lblNumero2 = new JLabel("Número 2:");
        frame.getContentPane().add(lblNumero2);
        
        txtNumero2 = new JTextField();
        txtNumero2.setColumns(10);
        frame.getContentPane().add(txtNumero2);
        
        // TERCER NÚMERO
        JLabel lblNumero3 = new JLabel("Número 3:");
        frame.getContentPane().add(lblNumero3);
        
        txtNumero3 = new JTextField();
        txtNumero3.setColumns(10);
        frame.getContentPane().add(txtNumero3);
        
        // BOTÓN SUMAR
        JButton btnSumar = new JButton("SUMAR");
        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 1. OBTENER los textos de los campos
                    String texto1 = txtNumero1.getText();
                    String texto2 = txtNumero2.getText();
                    String texto3 = txtNumero3.getText();
                    
                    // 2. CONVERTIR de String a Integer
                    int num1 = Integer.parseInt(texto1);
                    int num2 = Integer.parseInt(texto2);
                    int num3 = Integer.parseInt(texto3);
                    
                    // 3. REALIZAR la operación
                    int resultado = num1 + num2 + num3;
                    
                    // 4. MOSTRAR el resultado en el campo de texto
                    txtResultado.setText(String.valueOf(resultado));
                    
                } catch (NumberFormatException ex) {
                    // Si el usuario escribe texto en vez de números
                    JOptionPane.showMessageDialog(null, 
                        "Error: Debes introducir solo números", 
                        "Error de formato", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.getContentPane().add(btnSumar);
        
        // BOTÓN RESTAR
        JButton btnRestar = new JButton("RESTAR");
        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 1. OBTENER los textos
                    String texto1 = txtNumero1.getText();
                    String texto2 = txtNumero2.getText();
                    String texto3 = txtNumero3.getText();
                    
                    // 2. CONVERTIR a Integer
                    int num1 = Integer.parseInt(texto1);
                    int num2 = Integer.parseInt(texto2);
                    int num3 = Integer.parseInt(texto3);
                    
                    // 3. REALIZAR resta
                    int resultado = num1 - num2 - num3;
                    
                    // 4. MOSTRAR resultado
                    txtResultado.setText(String.valueOf(resultado));
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, 
                        "Error: Debes introducir solo números", 
                        "Error de formato", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.getContentPane().add(btnRestar);
        
        // CAMPO RESULTADO
        JLabel lblResultado = new JLabel("Resultado:");
        frame.getContentPane().add(lblResultado);
        
        txtResultado = new JTextField();
        txtResultado.setColumns(15);
        txtResultado.setEditable(false); // No se puede editar
        frame.getContentPane().add(txtResultado);
    }
}
```

---

## 7️⃣ Pasos para Resolver el Examen

### PASO 1: Crear el proyecto

1. En Eclipse: `File → New → Other`
2. Seleccionar: `WindowBuilder → Swing Designer → Application Window`
3. Nombrar el paquete (ej: `ventanas`) y la clase (ej: `Calculadora`)

### PASO 2: Diseñar la interfaz (pestaña Design)

1. Seleccionar el Layout apropiado (normalmente `FlowLayout` o `Absolute Layout`)
2. Arrastrar componentes desde la paleta lateral:
    - JLabel para etiquetas de texto
    - JTextField para campos de entrada
    - JButton para botones
    - Otros según necesites

### PASO 3: Nombrar los componentes

1. Haz clic derecho en cada componente → `Rename`
2. Usa nombres descriptivos:
    - `txtNumero1`, `txtNumero2`, `txtNumero3` para campos de texto
    - `txtResultado` para el resultado
    - `btnSumar`, `btnRestar` para botones
    - `lblNumero1`, `lblResultado` para etiquetas

### PASO 4: Configurar propiedades

- **Frame**: Título, tamaño, icono
- **JTextField**: Columnas, texto inicial, editable
- **JButton**: Texto del botón
- **JLabel**: Texto de la etiqueta

### PASO 5: Programar los eventos

1. Cambiar a la pestaña `Source` (código)
2. Para cada botón, añadir el ActionListener
3. Seguir el patrón: **RECOGER → CONVERTIR → PROCESAR → MOSTRAR**

### PASO 6: Probar la aplicación

1. Click derecho en el archivo → `Run As → Java Application`
2. Probar todas las funcionalidades
3. Verificar manejo de errores

---

## 8️⃣ Errores Comunes y Soluciones

### ❌ Error: "NumberFormatException"

**Causa:** Intentas convertir texto no numérico a número

```java
int numero = Integer.parseInt("abc"); // ❌ ERROR
```

**Solución:** Usa try-catch

```java
try {
    int numero = Integer.parseInt(txtNumero.getText());
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Introduce solo números");
}
```

### ❌ Error: "NullPointerException"

**Causa:** El componente no está inicializado o es null

**Solución:**

- Verifica que hayas creado el objeto antes de usarlo
- Asegúrate de que los nombres coinciden exactamente

### ❌ El texto no aparece en el JTextField resultado

**Causa:** Olvidaste convertir el número a String

**Solución:**

```java
// ❌ INCORRECTO
txtResultado.setText(resultado); // Error si resultado es int

// ✅ CORRECTO
txtResultado.setText(String.valueOf(resultado));
// O también
txtResultado.setText("" + resultado);
```

### ❌ Los botones no hacen nada

**Causa:** No has añadido el ActionListener

**Solución:**

```java
btnCalcular.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Tu código aquí
    }
});
```

### ❌ Campo de texto vacío causa error

**Causa:** `getText()` devuelve cadena vacía "", no null

**Solución:**

```java
String texto = txtNumero.getText();
if (texto.isEmpty()) {
    JOptionPane.showMessageDialog(null, "El campo está vacío");
    return;
}
```

### ❌ División por cero

**Solución:**

```java
if (divisor == 0) {
    JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
    return;
}
int resultado = dividendo / divisor;
```

---

## 9️⃣ Checklist para el Examen

### ✅ Diseño

- [ ] Frame configurado (título, tamaño con `setBounds`)
- [ ] Layout seleccionado apropiadamente
- [ ] Todos los componentes añadidos visualmente
- [ ] Componentes nombrados descriptivamente
- [ ] Propiedades configuradas (texto, columnas, etc.)

### ✅ Código

- [ ] Componentes declarados como variables de instancia (fuera de métodos)
- [ ] Imports correctos en la parte superior
- [ ] ActionListeners añadidos a todos los botones
- [ ] Método `getText()` para obtener valores
- [ ] Conversión String → Integer correcta con `parseInt()`
- [ ] Operaciones matemáticas correctas
- [ ] Conversión Integer → String con `String.valueOf()`
- [ ] Método `setText()` para mostrar resultados
- [ ] Try-catch para manejo de errores
- [ ] Mensajes de error con JOptionPane

### ✅ Funcionalidad

- [ ] La aplicación se ejecuta sin errores
- [ ] Todos los botones funcionan correctamente
- [ ] Los cálculos son correctos
- [ ] Maneja errores (texto en vez de números)
- [ ] Los resultados se muestran correctamente

### ✅ Documentación (si la piden)

- [ ] Capturas de la interfaz en WindowBuilder
- [ ] Capturas del código fuente completo
- [ ] Capturas del programa ejecutándose
- [ ] Capturas mostrando el funcionamiento correcto
- [ ] Explicaciones claras de cada paso
- [ ] Explicación del código línea por línea
- [ ] Archivo .java adjunto

---

## 🔟 Código de Referencia Rápida

### Estructura básica de la clase

```java
package ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class MiInterfaz {
    // Variables de instancia
    private JFrame frame;
    private JTextField txtCampo1;
    private JTextField txtCampo2;
    private JButton btnAccion;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MiInterfaz window = new MiInterfaz();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the application.
     */
    public MiInterfaz() {
        initialize();
    }
    
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        // Configurar frame
        frame = new JFrame();
        frame.setTitle("Mi Aplicación");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        
        // Crear y añadir componentes
        JLabel lblTitulo = new JLabel("Campo 1:");
        frame.getContentPane().add(lblTitulo);
        
        txtCampo1 = new JTextField();
        txtCampo1.setColumns(10);
        frame.getContentPane().add(txtCampo1);
        
        btnAccion = new JButton("Procesar");
        btnAccion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Tu código aquí
            }
        });
        frame.getContentPane().add(btnAccion);
    }
}
```

### Patrón universal para botones

```java
btnNombre.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            // 1. RECOGER datos
            String dato1 = txtCampo1.getText();
            String dato2 = txtCampo2.getText();
            
            // 2. CONVERTIR (si es necesario)
            int numero1 = Integer.parseInt(dato1);
            int numero2 = Integer.parseInt(dato2);
            
            // 3. PROCESAR
            int resultado = numero1 + numero2;
            
            // 4. MOSTRAR
            txtResultado.setText(String.valueOf(resultado));
            // O con ventana emergente:
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, 
                "Error: Introduce solo números",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
});
```

### Operaciones matemáticas comunes

```java
// Suma
int suma = a + b + c;

// Resta
int resta = a - b - c;

// Multiplicación
int multiplicacion = a * b * c;

// División entera
int division = a / b;

// División con decimales
double divisionDecimal = (double)a / b;

// Módulo (resto)
int resto = a % b;

// Potencia (requiere Math)
double potencia = Math.pow(base, exponente);

// Raíz cuadrada
double raiz = Math.sqrt(numero);
```

### Conversiones útiles

```java
// String → int
int numero = Integer.parseInt(texto);

// String → double
double decimal = Double.parseDouble(texto);

// int → String
String texto1 = String.valueOf(numero);
String texto2 = "" + numero;
String texto3 = Integer.toString(numero);

// double → String
String textoDecimal = String.valueOf(decimal);

// Formatear decimales
String formateado = String.format("%.2f", decimal); // 2 decimales
```

### Validaciones útiles

```java
// Verificar campo vacío
if (txtCampo.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "El campo está vacío");
    return;
}

// Verificar división por cero
if (divisor == 0) {
    JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
    return;
}

// Verificar número positivo
if (numero < 0) {
    JOptionPane.showMessageDialog(null, "Introduce un número positivo");
    return;
}
```

---

## 💡 Consejos Finales

1. **Practica escribir código a mano** - No dependas solo de WindowBuilder
2. **Memoriza el patrón**: RECOGER → CONVERTIR → PROCESAR → MOSTRAR
3. **Repasa los métodos clave**: `getText()`, `setText()`, `parseInt()`, `String.valueOf()`
4. **Practica el try-catch** para manejo de errores
