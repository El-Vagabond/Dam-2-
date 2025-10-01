# Guía Intermedia de Desarrollo Android  
**Nivel:** Ya sabes Java y lo básico de Android (Activities, vistas simples, Intents, Toasts)  
**Objetivo:** Llevarte al siguiente nivel con fundamentos modernos y herramientas clave

---

## Índice

1. [RecyclerView: Listas Dinámicas](#recyclerview-listas-dinámicas)
2. [Fragments: Interfaces Modulares](#fragments-interfaces-modulares)
3. [ConstraintLayout Avanzado](#constraintlayout-avanzado)
4. [SharedPreferences: Guardar Datos Simples](#sharedpreferences-guardar-datos-simples)
5. [Retrofit: Consumir APIs REST](#retrofit-consumir-apis-rest)
6. [Room Database: Bases de Datos Locales](#room-database-bases-de-datos-locales)
7. [MVVM y Arquitectura Limpia](#mvvm-y-arquitectura-limpia)
8. [Próximos pasos](#próximos-pasos)

---

## RecyclerView: Listas Dinámicas

### ¿Qué es?
Un widget avanzado para mostrar listas grandes de elementos de manera eficiente.  
**¿Por qué?** Es flexible, eficiente y personalizable (mejor que ListView).  
**¿Cuándo usarlo?** Cuando necesitas mostrar listas o grids de datos que pueden cambiar dinámicamente.

### Dependencia Gradle
```gradle
dependencies {
    implementation 'androidx.recyclerview:recyclerview:1.3.2'
}
```

### Ejemplo Básico

**1. Layout XML**
```xml
<!-- res/layout/activity_main.xml -->
<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/recyclerView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

**2. Item de la lista**
```xml
<!-- res/layout/item_simple.xml -->
<TextView
    android:id="@+id/textViewItem"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="16dp"/>
```

**3. Adapter Java**
```java
public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {
    private List<String> data;

    // ViewHolder: mantiene referencias a las vistas de cada ítem
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewItem;
        public ViewHolder(View itemView) {
            super(itemView);
            textViewItem = itemView.findViewById(R.id.textViewItem);
        }
    }

    // Constructor del Adapter
    public SimpleAdapter(List<String> data) { this.data = data; }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Infla la vista de cada ítem
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_simple, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Asocia datos con la vista
        holder.textViewItem.setText(data.get(position));
    }

    @Override
    public int getItemCount() { return data.size(); }
}
```

**4. Configuración en la Activity**
```java
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<String> lista = Arrays.asList("Uno", "Dos", "Tres", "Cuatro");
        SimpleAdapter adapter = new SimpleAdapter(lista);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
```

**Notas:**
- El Adapter es el “puente” entre tus datos y la vista.
- Puedes personalizar el ítem usando más vistas en `item_simple.xml`.

---

## Fragments: Interfaces Modulares

### ¿Qué es?
Un Fragment es como una mini-Activity reutilizable: una porción de UI y lógica que puede combinarse en una Activity.  
**¿Por qué?** Permite crear pantallas dinámicas, reutilizar interfaces, y facilita la navegación en tablas y teléfonos.  
**¿Cuándo usarlo?** Cuando tu UI es compleja o necesitas dividir la pantalla (ej. tablets).

### Ejemplo Mínimo

**1. Layout para el Fragment**
```xml
<!-- res/layout/fragment_ejemplo.xml -->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent" android:layout_height="match_parent">
    <TextView
        android:id="@+id/textViewFragment"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="¡Hola desde el Fragment!"/>
</LinearLayout>
```

**2. Clase Fragment Java**
```java
public class EjemploFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el layout del fragmento
        return inflater.inflate(R.layout.fragment_ejemplo, container, false);
    }
}
```

**3. Incluir el Fragment en Activity**
```xml
<!-- res/layout/activity_main.xml -->
<FrameLayout
    android:id="@+id/contenedorFragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

**4. Mostrar el Fragment desde la Activity**
```java
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Agrega el fragment al contenedor
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.contenedorFragment, new EjemploFragment())
            .commit();
    }
}
```

**Notas:**
- Puedes comunicar Fragments y Activities usando interfaces o ViewModels (ver MVVM).
- Los Fragments son ideales para pantallas que cambian dinámicamente.

---

## ConstraintLayout Avanzado

### ¿Qué es?
Un layout flexible para diseñar interfaces complejas de manera visual y responsiva sin anidar muchos layouts.  
**¿Por qué?** Permite crear UIs adaptables a diferentes tamaños de pantalla de forma eficiente.  
**¿Cuándo usarlo?** Para cualquier layout que requiera alineaciones precisas y adaptabilidad.

### Dependencia Gradle
```gradle
dependencies {
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
}
```

### Ejemplo Básico: Login

```xml
<!-- res/layout/activity_main.xml -->
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent" android:layout_height="match_parent">

    <EditText
        android:id="@+id/etUsuario"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:hint="Usuario"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        android:layout_margin="32dp"/>

    <EditText
        android:id="@+id/etPassword"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:hint="Contraseña"
        android:inputType="textPassword"
        app:layout_constraintTop_toBottomOf="@id/etUsuario"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        android:layout_marginTop="16dp"
        android:layout_marginLeft="32dp"
        android:layout_marginRight="32dp"/>

    <Button
        android:id="@+id/btnLogin"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Ingresar"
        app:layout_constraintTop_toBottomOf="@id/etPassword"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        android:layout_marginTop="24dp"/>
</androidx.constraintlayout.widget.ConstraintLayout>
```

**Notas:**
- Usa los atributos `app:layout_constraint*` para posicionar vistas relativo a otras.
- El ancho `0dp` significa “match constraints” (extiéndete hasta los límites definidos por constraints).

---

## SharedPreferences: Guardar Datos Simples

### ¿Qué es?
Una forma sencilla de guardar datos clave-valor (strings, ints, booleans) de manera persistente.  
**¿Por qué?** Perfecto para configuraciones, flags, o datos pequeños del usuario.  
**¿Cuándo usarlo?** Guardar preferencias, tokens, ajustes, etc.

### Ejemplo: Guardar y Leer un String

```java
// Guardar un valor
SharedPreferences prefs = getSharedPreferences("MisPrefs", MODE_PRIVATE);
SharedPreferences.Editor editor = prefs.edit();
editor.putString("usuario", "ElVagabond");
editor.apply(); // Usa apply() para guardar en background

// Leer un valor
String usuario = prefs.getString("usuario", "defecto");
// "defecto" es el valor si no existe la clave
```

**Notas:**
- Los datos persisten aunque cierres la app.
- No es seguro para guardar contraseñas o datos sensibles.

---

## Retrofit: Consumir APIs REST

### ¿Qué es?
Una librería para conectar tu app con servicios web de manera sencilla y estructurada.  
**¿Por qué?** Simplifica mucho las llamadas HTTP y el manejo de respuestas JSON.  
**¿Cuándo usarlo?** Siempre que tu app consuma datos de un servidor o API.

### Dependencia Gradle
```gradle
dependencies {
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
}
```

### Ejemplo Mínimo: Obtener lista de usuarios (JSONPlaceholder)

**1. Modelo de datos**
```java
public class Usuario {
    public int id;
    public String name;
    public String username;
}
```

**2. Interfaz de la API**
```java
public interface ApiService {
    @GET("users")
    Call<List<Usuario>> getUsuarios();
}
```

**3. Configurar Retrofit y hacer consulta**
```java
Retrofit retrofit = new Retrofit.Builder()
    .baseUrl("https://jsonplaceholder.typicode.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build();

ApiService api = retrofit.create(ApiService.class);

api.getUsuarios().enqueue(new Callback<List<Usuario>>() {
    @Override
    public void onResponse(Call<List<Usuario>> call, Response<List<Usuario>> response) {
        if (response.isSuccessful()) {
            List<Usuario> usuarios = response.body();
            // Aquí puedes actualizar la UI o procesar datos
        }
    }
    @Override
    public void onFailure(Call<List<Usuario>> call, Throwable t) {
        // Manejar error de red
    }
});
```

**Notas:**
- Todo se ejecuta en background, no bloquea la UI.
- Usa Gson para convertir JSON a objetos Java.

---

## Room Database: Bases de Datos Locales

### ¿Qué es?
Un framework moderno para manejar bases de datos SQLite de forma segura, eficiente y con menos código.  
**¿Por qué?** Provee abstracción, validación y consulta segura de datos locales.  
**¿Cuándo usarlo?** Para apps que necesitan guardar listas o colecciones estructuradas de datos localmente.

### Dependencia Gradle
```gradle
dependencies {
    implementation "androidx.room:room-runtime:2.6.1"
    annotationProcessor "androidx.room:room-compiler:2.6.1"
}
```

### Ejemplo Mínimo: Lista de Tareas

**1. Entidad**
```java
@Entity
public class Tarea {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nombre;
}
```

**2. Dao**
```java
@Dao
public interface TareaDao {
    @Query("SELECT * FROM Tarea")
    List<Tarea> getTodas();

    @Insert
    void insertar(Tarea tarea);
}
```

**3. Base de datos**
```java
@Database(entities = {Tarea.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TareaDao tareaDao();
}
```

**4. Uso en Activity**
```java
AppDatabase db = Room.databaseBuilder(getApplicationContext(),
        AppDatabase.class, "tareas-db").allowMainThreadQueries().build();

// Insertar tarea
Tarea t = new Tarea();
t.nombre = "Estudiar Android";
db.tareaDao().insertar(t);

// Consultar tareas
List<Tarea> lista = db.tareaDao().getTodas();
```
> **Nota:** `allowMainThreadQueries()` solo para pruebas rápidas; en apps reales usa hilos (AsyncTask, Executors, o LiveData).

---

## MVVM y Arquitectura Limpia

### ¿Qué es MVVM?**
- **Model-View-ViewModel:** Patrones para organizar tu código separando lógica de UI, datos y presentación.
- **¿Por qué?** Hace tu app más mantenible, testeable y escalable.
- **¿Cuándo usarlo?** Siempre, especialmente en apps medianas o grandes.

### Esquema Básico

- **Model:** Lógica de datos (Room, Retrofit, etc.)
- **View:** UI (Activity, Fragment, XML)
- **ViewModel:** Gestiona datos y lógica para la View

### Ejemplo Simplificado (sin LiveData/ViewModel, solo estructura)

```java
// Model: accede a Room o Retrofit
public class UsuarioRepository {
    public List<Usuario> getUsuarios() { /* ... */ }
}

// ViewModel: gestiona datos para la UI
public class UsuarioViewModel {
    private UsuarioRepository repo = new UsuarioRepository();

    public List<Usuario> obtenerUsuarios() {
        return repo.getUsuarios();
    }
}

// View (Activity/Fragment): interactúa con ViewModel
public class MainActivity extends AppCompatActivity {
    UsuarioViewModel viewModel = new UsuarioViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Usuario> usuarios = viewModel.obtenerUsuarios();
        // Mostrar usuarios en RecyclerView, etc.
    }
}
```

**Notas:**
- Separa tus clases según estas capas.
- En proyectos reales, usa LiveData y ViewModel de AndroidX para reactividad.

---

## Próximos pasos

¡Felicidades por avanzar!  
Para seguir creciendo, te recomiendo explorar:

- **LiveData:** Para observar cambios de datos en tiempo real.
- **ViewModel (AndroidX):** Para gestionar lógica de UI de forma reactiva y sobrevivir a cambios de configuración.
- **Navigation Component:** Para gestionar navegación entre fragments de forma segura.
- **Data Binding:** Para enlazar vistas y datos de manera declarativa.
- **Dagger/Hilt:** Inyección de dependencias (estructura avanzada).
- **Testing:** Aprende a testear tus repositorios, ViewModels y UI.
- **Coroutines (si migras a Kotlin):** Para manejar tareas asíncronas de manera simple.

**Recuerda:**  
- Consulta la [documentación oficial de Android](https://developer.android.com/guide).
- Prueba, experimenta y nunca dejes de aprender.  
- ¡La práctica y curiosidad son tus mejores aliados!

---
¿Listo para el siguiente reto? 🚀