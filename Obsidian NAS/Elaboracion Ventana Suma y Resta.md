Primer comenzamos con la elaboración de la ventana a través de la interfaz grafica con Java Swing, Creamos los 3 Jlabel con el nombre de los números para diferenciarlos  y sus respectivos JTextField,  también colocamos los botones para sumar y para restar respetivamente y por ultimo el JTextField que mostrara el resultado de dicha Suma o resta. Una vez todo creado y colocado nos quedaría una ventana de este estilo:

![[Pasted image 20250924082128.png]]

Una vez tengamos la parte grafica de nuestra ventana pasamos a modificar el código del mismo para darle funcionalidad. Lo importante en esta ventana es la función de los botones de Suma y Resta.

Para el botón de Sumar , tenemos que  guardar en variables lo que el usuario introduzca en los JTextField creados con anterioridad convirtiendo el valor del texto en Integer  para luego sumarlos y mostrarlos en el ultimo JTextField en mi caso llamado Resultado para diferenciarlo mejor .


![[Pasted image 20250924082945.png]]

Realizamos el mismo código para la interacción del botón resta cambiando la operación de sumarlos por restarlos y que siga mostrando el valor obtenido en el JTextField resultado.

![[Pasted image 20250924083122.png]]

Una vez introducido el código pasamos a la comprobación del programa.

Primero probamos una Suma 

![[Pasted image 20250924083227.png]]


Vemos que la Suma la realiza correctamente, procedemos a probar el botón resta

![[Pasted image 20250924083621.png]]


 y como podemos observar realiza la operación también correctamente  , comprobando que el programa funciona correctamente.