# Guía completa de Android para principiantes

## Introducción

Esta guía está diseñada para personas que conocen Java básico (variables, bucles, condicionales, métodos y clases) pero nunca han trabajado con Android Studio. Aprenderás paso a paso cómo crear tu primera aplicación Android funcional.

---

## 1. ¿Qué es Android Studio?

**Android Studio** es el entorno de desarrollo integrado (IDE) oficial para crear aplicaciones Android. Incluye:

- Editor de código Java/Kotlin
- Diseñador visual de interfaces
- Emulador de dispositivos Android
- Herramientas de depuración
- SDK de Android (librerías y herramientas necesarias)

### Instalación básica

1. Descarga Android Studio desde [developer.android.com](https://developer.android.com/studio)
2. Ejecuta el instalador y sigue el asistente
3. Al finalizar, Android Studio descargará el SDK más reciente
4. Configura un dispositivo virtual (AVD) para probar tus aplicaciones

---

## 2. Estructura básica de un proyecto Android

Cuando creas un nuevo proyecto, Android Studio genera esta estructura:

```
MiProyecto/
├── app/
│   ├── manifests/
│   │   └── AndroidManifest.xml     (Configuración de la app)
│   ├── java/
│   │   └── com.example.miproyecto/
│   │       └── MainActivity.java    (Código Java)
│   └── res/
│       ├── layout/
│       │   └── activity_main.xml    (Diseño de la interfaz)
│       ├── values/
│       │   └── strings.xml          (Textos reutilizables)
│       └── drawable/                (Imágenes)
└── Gradle Scripts/                  (Configuración de compilación)
```

### Carpetas clave

- **`java/`**: Contiene todo el código Java de tu aplicación
- **`res/`**: Recursos (interfaces XML, imágenes, textos, colores)
- **`AndroidManifest.xml`**: Declara componentes, permisos y configuración general

---

## 3. MainActivity.java y activity_main.xml

### ¿Qué es una Activity?

Una **Activity** es una pantalla de tu aplicación. Cada Activity tiene:

- Un archivo Java (la lógica)
- Un archivo XML (la interfaz visual)

### MainActivity.java

```java
package com.example.miproyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Este método conecta el código Java con el diseño XML
        setContentView(R.layout.activity_main);
        
        // Aquí escribirás tu código cuando la Activity se cree
    }
}
```

**Explicación:**

- `extends AppCompatActivity`: MainActivity hereda funcionalidades de Android
- `onCreate()`: Se ejecuta cuando se crea la pantalla (es el punto de entrada)
- `setContentView(R.layout.activity_main)`: Carga el diseño XML

### activity_main.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <!-- Aquí colocarás tus vistas (TextView, Button, etc.) -->

</LinearLayout>
```

**Explicación:**

- `LinearLayout`: Organiza elementos en vertical u horizontal
- `match_parent`: Ocupa todo el espacio disponible
- `padding="16dp"`: Espacio interno de 16 píxeles independientes de densidad

---

## 4. Diseñar una interfaz básica

### TextView (Mostrar texto)

```xml
<TextView
    android:id="@+id/tvTitulo"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Bienvenido a mi App"
    android:textSize="24sp"
    android:textStyle="bold"
    android:gravity="center" />
```

**Propiedades importantes:**

- `android:id`: Identificador único para acceder desde Java
- `wrap_content`: El tamaño se ajusta al contenido
- `textSize`: Tamaño de fuente (usa `sp` para escalar con accesibilidad)

### EditText (Campo de entrada)

```xml
<EditText
    android:id="@+id/etNombre"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Escribe tu nombre"
    android:inputType="textPersonName"
    android:layout_marginTop="16dp" />
```

**Propiedades importantes:**

- `hint`: Texto indicativo que desaparece al escribir
- `inputType`: Tipo de teclado (texto, números, email, etc.)

### Button (Botón)

```xml
<Button
    android:id="@+id/btnSaludar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Saludar"
    android:layout_marginTop="16dp" />
```

### ImageView (Mostrar imagen)

```xml
<ImageView
    android:id="@+id/ivLogo"
    android:layout_width="100dp"
    android:layout_height="100dp"
    android:src="@drawable/ic_launcher_foreground"
    android:layout_marginTop="16dp"
    android:layout_gravity="center" />
```

**Nota:** Las imágenes se colocan en `res/drawable/`

---

## 5. Vincular elementos XML con Java

### Método tradicional: findViewById

```java
public class MainActivity extends AppCompatActivity {
    
    // Declarar variables para las vistas
    private TextView tvTitulo;
    private EditText etNombre;
    private Button btnSaludar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Vincular las vistas con sus IDs del XML
        tvTitulo = findViewById(R.id.tvTitulo);
        etNombre = findViewById(R.id.etNombre);
        btnSaludar = findViewById(R.id.btnSaludar);
    }
}
```

**Explicación:**

- `findViewById(R.id.nombre)`: Busca la vista por su ID
- `R.id`: La clase R se genera automáticamente con todos los recursos
- Las variables se declaran fuera de `onCreate` para usarlas en toda la clase

---

## 6. Manejar eventos de clic

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    tvTitulo = findViewById(R.id.tvTitulo);
    etNombre = findViewById(R.id.etNombre);
    btnSaludar = findViewById(R.id.btnSaludar);
    
    // Configurar qué hacer cuando se pulse el botón
    btnSaludar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Este código se ejecuta al hacer clic
            String nombre = etNombre.getText().toString();
            tvTitulo.setText("Hola, " + nombre);
        }
    });
}
```

**Versión con lambda (Java 8+):**

```java
btnSaludar.setOnClickListener(v -> {
    String nombre = etNombre.getText().toString();
    tvTitulo.setText("Hola, " + nombre);
});
```

**Explicación:**

- `setOnClickListener()`: Registra un evento al hacer clic
- `getText().toString()`: Obtiene el texto del EditText como String
- `setText()`: Cambia el texto del TextView

---

## 7. Mostrar mensajes con Toast

Un **Toast** es un mensaje temporal que aparece en la pantalla.

```java
btnSaludar.setOnClickListener(v -> {
    String nombre = etNombre.getText().toString();
    
    // Validar que el campo no esté vacío
    if (nombre.isEmpty()) {
        Toast.makeText(MainActivity.this, 
                      "Por favor escribe tu nombre", 
                      Toast.LENGTH_SHORT).show();
    } else {
        Toast.makeText(MainActivity.this, 
                      "Hola, " + nombre, 
                      Toast.LENGTH_LONG).show();
    }
});
```

**Parámetros de Toast:**

- `MainActivity.this`: Contexto de la Activity
- `"mensaje"`: Texto a mostrar
- `Toast.LENGTH_SHORT` o `LENGTH_LONG`: Duración
- `.show()`: Muestra el Toast (obligatorio)

---

## 8. Cambiar propiedades de vistas desde Java

```java
// Cambiar texto
tvTitulo.setText("Nuevo título");

// Cambiar color de texto (necesitas importar Color)
tvTitulo.setTextColor(Color.RED);

// Cambiar tamaño de texto
tvTitulo.setTextSize(30);

// Ocultar/mostrar vista
tvTitulo.setVisibility(View.GONE);    // Oculta y no ocupa espacio
tvTitulo.setVisibility(View.INVISIBLE); // Oculta pero ocupa espacio
tvTitulo.setVisibility(View.VISIBLE);   // Muestra la vista

// Cambiar imagen en ImageView
ImageView ivLogo = findViewById(R.id.ivLogo);
ivLogo.setImageResource(R.drawable.mi_imagen);
```

---

## 9. Navegar a una segunda Activity con Intent

### Paso 1: Crear la segunda Activity

**SecondActivity.java:**

```java
package com.example.miproyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        
        TextView tvMensaje = findViewById(R.id.tvMensaje);
        
        // Recibir datos del Intent
        String nombreRecibido = getIntent().getStringExtra("NOMBRE");
        tvMensaje.setText("Bienvenido, " + nombreRecibido);
    }
}
```

**activity_second.xml:**

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    android:gravity="center">

    <TextView
        android:id="@+id/tvMensaje"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Mensaje"
        android:textSize="20sp" />

</LinearLayout>
```

### Paso 2: Registrar SecondActivity en AndroidManifest.xml

```xml
<manifest ...>
    <application ...>
        <activity android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        
        <!-- Agregar la segunda Activity -->
        <activity android:name=".SecondActivity" />
    </application>
</manifest>
```

### Paso 3: Navegar desde MainActivity

```java
btnSaludar.setOnClickListener(v -> {
    String nombre = etNombre.getText().toString();
    
    if (!nombre.isEmpty()) {
        // Crear Intent para abrir SecondActivity
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        
        // Enviar datos a la segunda Activity
        intent.putExtra("NOMBRE", nombre);
        
        // Iniciar la segunda Activity
        startActivity(intent);
    } else {
        Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_SHORT).show();
    }
});
```

**Explicación:**

- `Intent`: Objeto que solicita abrir otra Activity
- `putExtra("clave", valor)`: Envía datos a la siguiente Activity
- `getStringExtra("clave")`: Recibe datos en la Activity destino

---

## 10. Ciclo de vida de una Activity

Las Activities pasan por diferentes estados. Estos son los métodos principales:

```java
public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Se ejecuta cuando se crea la Activity por primera vez
        // Aquí inicializas vistas y variables
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        // La Activity se hace visible (pero aún no interactuable)
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        // La Activity está en primer plano y el usuario puede interactuar
        // Aquí reanudas animaciones, actualizas datos, etc.
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        // La Activity va a pasar a segundo plano
        // Pausa operaciones pesadas (animaciones, videos)
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        // La Activity ya no es visible
        // Libera recursos que no se necesitan
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // La Activity va a ser destruida
        // Limpieza final de recursos
    }
}
```

**Para principiantes:** Normalmente solo necesitas `onCreate()` al empezar. Los demás métodos se usan para gestionar recursos cuando la app va a segundo plano.

---

## 11. Ejemplo completo funcional

### activity_main.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="24dp"
    android:gravity="center">

    <TextView
        android:id="@+id/tvTitulo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Mi Primera App"
        android:textSize="28sp"
        android:textStyle="bold"
        android:layout_marginBottom="32dp" />

    <EditText
        android:id="@+id/etNombre"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Escribe tu nombre"
        android:inputType="textPersonName"
        android:layout_marginBottom="16dp" />

    <Button
        android:id="@+id/btnSaludar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Continuar" />

</LinearLayout>
```

### MainActivity.java

```java
package com.example.miproyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    // Declarar variables para las vistas
    private TextView tvTitulo;
    private EditText etNombre;
    private Button btnSaludar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Vincular vistas con sus IDs
        tvTitulo = findViewById(R.id.tvTitulo);
        etNombre = findViewById(R.id.etNombre);
        btnSaludar = findViewById(R.id.btnSaludar);
        
        // Configurar evento de clic del botón
        btnSaludar.setOnClickListener(v -> {
            String nombre = etNombre.getText().toString().trim();
            
            // Validar entrada
            if (nombre.isEmpty()) {
                Toast.makeText(this, 
                    "Por favor escribe tu nombre", 
                    Toast.LENGTH_SHORT).show();
            } else {
                // Crear Intent para abrir segunda Activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("NOMBRE", nombre);
                startActivity(intent);
            }
        });
    }
}
```

---

## 12. Buenas prácticas básicas

### Nombres de variables

```java
// ✅ BIEN: Nombres descriptivos
private TextView tvTitulo;
private EditText etNombre;
private Button btnSaludar;

// ❌ MAL: Nombres confusos
private TextView t1;
private EditText e;
private Button b;
```

**Convención:**

- `tv` = TextView
- `et` = EditText
- `btn` = Button
- `iv` = ImageView

### IDs en XML

```xml
<!-- ✅ BIEN: IDs descriptivos en camelCase -->
<TextView android:id="@+id/tvTituloPrincipal" />
<Button android:id="@+id/btnEnviarFormulario" />

<!-- ❌ MAL: IDs genéricos -->
<TextView android:id="@+id/textview1" />
<Button android:id="@+id/button" />
```

### Organizar onCreate()

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    // 1. Inicializar vistas
    inicializarVistas();
    
    // 2. Configurar listeners
    configurarListeners();
    
    // 3. Cargar datos si es necesario
    cargarDatos();
}

private void inicializarVistas() {
    tvTitulo = findViewById(R.id.tvTitulo);
    etNombre = findViewById(R.id.etNombre);
    btnSaludar = findViewById(R.id.btnSaludar);
}

private void configurarListeners() {
    btnSaludar.setOnClickListener(v -> saludar());
}

private void saludar() {
    String nombre = etNombre.getText().toString().trim();
    if (!nombre.isEmpty()) {
        Toast.makeText(this, "Hola, " + nombre, Toast.LENGTH_SHORT).show();
    }
}
```

### Usar recursos strings.xml

En lugar de escribir textos directamente:

```xml
<!-- res/values/strings.xml -->
<resources>
    <string name="app_name">Mi Proyecto</string>
    <string name="titulo_principal">Mi Primera App</string>
    <string name="hint_nombre">Escribe tu nombre</string>
    <string name="btn_continuar">Continuar</string>
    <string name="error_nombre_vacio">Por favor escribe tu nombre</string>
</resources>
```

Usar en XML:

```xml
<TextView
    android:text="@string/titulo_principal" />
```

Usar en Java:

```java
tvTitulo.setText(R.string.titulo_principal);
Toast.makeText(this, R.string.error_nombre_vacio, Toast.LENGTH_SHORT).show();
```

---

## Conclusión

Has aprendido los fundamentos esenciales para crear aplicaciones Android:

- ✅ Estructura de un proyecto Android
- ✅ Relación entre Java y XML
- ✅ Componentes básicos de interfaz
- ✅ Manejo de eventos
- ✅ Navegación entre pantallas
- ✅ Ciclo de vida de Activities

Has dado los primeros pasos en Android con Activities, Intents y vistas básicas.  

Ahora toca subir de nivel con herramientas modernas y esenciales que te permitirán crear apps profesionales.

En esta guía veremos:  

1. RecyclerView  

2. Fragments  

3. ConstraintLayout avanzado  

4. SharedPreferences  

5. Retrofit  

6. Room Database  

7. MVVM y arquitectura limpia  

Cada sección incluye explicación breve, ejemplos en **Java + XML** y dependencias necesarias.

  

---

  

## 1. RecyclerView

### ¿Qué es?

Un componente para mostrar listas dinámicas y eficientes.  

Es más flexible y moderno que `ListView`.

### ¿Por qué usarlo?

- Muestra grandes cantidades de datos sin perder rendimiento.  

- Permite personalizar el diseño de cada ítem.    

### ¿Cuándo usarlo?

Siempre que quieras mostrar colecciones de elementos (ej. lista de contactos, productos, mensajes).  

### Ejemplo mínimo
  
**Gradle (app/build.gradle):**

```gradle

dependencies {

    implementation 'androidx.recyclerview:recyclerview:1.3.2'

}

```


**XML (activity_main.xml):**

```xml

<androidx.recyclerview.widget.RecyclerView

    android:id="@+id/recyclerView"

    android:layout_width="match_parent"

    android:layout_height="match_parent"/>

```

  

**Layout de ítem (item_text.xml):**

```xml

<TextView

    android:id="@+id/textItem"

    android:layout_width="match_parent"

    android:layout_height="wrap_content"

    android:padding="16dp"

    android:textSize="18sp"/>

```

  

**Adapter (MyAdapter.java):**

```java

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] data;

  

    public MyAdapter(String[] data) {

        this.data = data;

    }

  

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public ViewHolder(View itemView) {

            super(itemView);

            textView = itemView.findViewById(R.id.textItem);

        }

    }

  

    @Override

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Inflamos el layout del ítem

        View view = LayoutInflater.from(parent.getContext())

                .inflate(R.layout.item_text, parent, false);

        return new ViewHolder(view);

    }

  

    @Override

    public void onBindViewHolder(ViewHolder holder, int position) {

        // Asignamos el texto al TextView

        holder.textView.setText(data[position]);

    }

  

    @Override

    public int getItemCount() {

        return data.length;

    }

}

```

  

**Activity (MainActivity.java):**

```java

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] items = {"Uno", "Dos", "Tres", "Cuatro"};

  

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

  

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MyAdapter(items));

    }

}

```

  

---

## 2. Fragments


### ¿Qué es?

Una pieza modular de UI que vive dentro de una Activity.  
  

### ¿Por qué usarlo?

- Reutilizar pantallas en diferentes Activities.  

- Crear interfaces adaptables (ej. tablets).  


### ¿Cuándo usarlo?

Cuando quieras dividir tu UI en secciones reutilizables.

### Ejemplo mínimo


**Fragment layout (fragment_example.xml):**

```xml

<LinearLayout

    xmlns:android="http://schemas.android.com/apk/res/android"

    android:orientation="vertical"

    android:layout_width="match_parent"

    android:layout_height="match_parent"

    android:gravity="center">

  

    <TextView

        android:id="@+id/textFragment"

        android:layout_width="wrap_content"

        android:layout_height="wrap_content"

        android:text="Hola desde Fragment"/>

</LinearLayout>

```


**Fragment class (ExampleFragment.java):**

```java

public class ExampleFragment extends Fragment {

    @Nullable

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_example, container, false);

    }

}

```


**Activity layout (activity_main.xml):**

```xml

<FrameLayout

    android:id="@+id/container"

    android:layout_width="match_parent"

    android:layout_height="match_parent"/>

```


**Activity (MainActivity.java):**

```java

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

  

        // Cargamos el fragmento

        getSupportFragmentManager()

                .beginTransaction()

                .replace(R.id.container, new ExampleFragment())

                .commit();

    }

}

```

  

---

  

## 3. ConstraintLayout Avanzado


### ¿Qué es?

Un layout flexible que permite diseñar interfaces complejas con menos anidaciones.
### ¿Por qué usarlo?

- Optimiza el rendimiento.  

- Facilita crear diseños responsivos.   
### ¿Cuándo usarlo?

Siempre que necesites una UI compleja.
### Ejemplo mínimo

**XML (activity_main.xml):**

```xml

<androidx.constraintlayout.widget.ConstraintLayout

    xmlns:android="http://schemas.android.com/apk/res/android"

    xmlns:app="http://schemas.android.com/apk/res-auto"

    android:layout_width="match_parent"

    android:layout_height="match_parent">

  

    <Button

        android:id="@+id/button1"

        android:layout_width="0dp"

        android:layout_height="wrap_content"

        android:text="Botón 1"

        app:layout_constraintStart_toStartOf="parent"

        app:layout_constraintEnd_toStartOf="@+id/button2"

        app:layout_constraintTop_toTopOf="parent"

        app:layout_constraintHorizontalWeight="1"/>

  

    <Button

        android:id="@+id/button2"

        android:layout_width="0dp"

        android:layout_height="wrap_content"

        android:text="Botón 2"

        app:layout_constraintStart_toEndOf="@id/button1"

        app:layout_constraintEnd_toEndOf="parent"

        app:layout_constraintTop_toTopOf="parent"

        app:layout_constraintHorizontalWeight="1"/>

</androidx.constraintlayout.widget.ConstraintLayout>

```

  

---

  

## 4. SharedPreferences

### ¿Qué es?

Un sistema para guardar datos simples en clave-valor.  
### ¿Por qué usarlo?

- Ideal para configuraciones, estados o preferencias del usuario.  
### Ejemplo mínimo

```java

public class MainActivity extends AppCompatActivity {

    SharedPreferences prefs;

  

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

  

        prefs = getSharedPreferences("MisPrefs", MODE_PRIVATE);

  

        // Guardar un dato

        prefs.edit().putString("nombre", "Vagabond").apply();

  

        // Leer un dato

        String nombre = prefs.getString("nombre", "Por defecto");

        Toast.makeText(this, "Hola " + nombre, Toast.LENGTH_SHORT).show();

    }

}

```

  

---

  

## 5. Retrofit (APIs REST)

### ¿Qué es?

Una librería para consumir APIs REST fácilmente.

### ¿Por qué usarlo?

- Convierte JSON automáticamente en objetos Java.  

- Simplifica llamadas a internet.  


### Dependencia

```gradle

implementation 'com.squareup.retrofit2:retrofit:2.9.0'

implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

```


### Ejemplo mínimo

**Interfaz API:**

```java

public interface ApiService {

    @GET("posts/1")

    Call<Post> getPost();

}

```


**Modelo:**

```java

public class Post {

    public int userId;

    public int id;

    public String title;

    public String body;

}

```


**Uso en Activity:**

```java

Retrofit retrofit = new Retrofit.Builder()

        .baseUrl("https://jsonplaceholder.typicode.com/")

        .addConverterFactory(GsonConverterFactory.create())

        .build();

  

ApiService api = retrofit.create(ApiService.class);

api.getPost().enqueue(new Callback<Post>() {

    @Override

    public void onResponse(Call<Post> call, Response<Post> response) {

        if (response.isSuccessful()) {

            Post post = response.body();

            Toast.makeText(MainActivity.this, post.title, Toast.LENGTH_SHORT).show();

        }

    }

  

    @Override

    public void onFailure(Call<Post> call, Throwable t) {

        Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();

    }

});

```

  

---

  

## 6. Room Database

### ¿Qué es?

Una librería para manejar bases de datos SQLite de forma sencilla.

### ¿Por qué usarlo?

- Evita escribir SQL manual.  

- Soporta consultas reactivas.  

### Dependencia

```gradle

implementation "androidx.room:room-runtime:2.6.1"

annotationProcessor "androidx.room:room-compiler:2.6.1"

```

  
### Ejemplo mínimo


**Entidad (User.java):**

```java

@Entity

public class User {

    @PrimaryKey(autoGenerate = true)

    public int id;

  

    public String name;

}

```

  
**DAO (UserDao.java):**

```java

@Dao

public interface UserDao {

    @Insert

    void insert(User user);

  

    @Query("SELECT * FROM User")

    List<User> getAll();

}

```
  

**Database (AppDatabase.java):**

```java

@Database(entities = {User.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();

}

```


**Uso en Activity:**

```java

AppDatabase db = Room.databaseBuilder(getApplicationContext(),

        AppDatabase.class, "mi-db").allowMainThreadQueries().build();

  

User user = new User();

user.name = "Vagabond";

db.userDao().insert(user);

  

List<User> users = db.userDao().getAll();

Toast.makeText(this, "Usuarios: " + users.size(), Toast.LENGTH_SHORT).show();

```

  

---

  

## 7. MVVM y Arquitectura Limpia

### ¿Qué es?

Un patrón para organizar el código en capas:


- **Model**: datos (ej. Room, Retrofit).  

- **View**: la UI (Activity/Fragment).  

- **ViewModel**: conecta datos con la UI.  
  
### ¿Por qué usarlo?

- Código más limpio y mantenible.  

- Separa lógica de negocio de la UI.  


### Ejemplo mínimo


**ViewModel (MainViewModel.java):**

```java

public class MainViewModel extends ViewModel {

    private MutableLiveData<String> text = new MutableLiveData<>();

  

    public LiveData<String> getText() {

        return text;

    }

  

    public void setText(String value) {

        text.setValue(value);

    }

}

```


**Activity (MainActivity.java):**

```java

public class MainActivity extends AppCompatActivity {

    MainViewModel viewModel;

    TextView textView;

    Button button;

  

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

  

        textView = findViewById(R.id.textView);

        button = findViewById(R.id.button);

  

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

  

        // Observa cambios en el ViewModel

        viewModel.getText().observe(this, new Observer<String>() {

            @Override

            public void onChanged(String s) {

                textView.setText(s);

            }

        });

  

        button.setOnClickListener(v -> viewModel.setText("Hola MVVM"));

    }

}

```


**Layout (activity_main.xml):**

```xml

<LinearLayout

    xmlns:android="http://schemas.android.com/apk/res/android"

    android:orientation="vertical"

    android:padding="16dp"

    android:layout_width="match_parent"

    android:layout_height="match_parent">

  

    <TextView

        android:id="@+id/textView"

        android:layout_width="wrap_content"

        android:layout_height="wrap_content"

        android:text="Texto inicial"/>

  

    <Button

        android:id="@+id/button"

        android:layout_width="wrap_content"

        android:layout_height="wrap_content"

        android:text="Actualizar"/>

</LinearLayout>

```





