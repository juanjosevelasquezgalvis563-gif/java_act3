java_act3
Este proyecto consiste en la implementación de una clase Product y una clase Main en Java, siguiendo los estándares de programación orientada a objetos y organización por paquetes.

Se desarrollaron las siguientes funcionalidades:

Atributos privados para asegurar el encapsulamiento de los datos.

Constructor por defecto para inicializar objetos vacíos.

Constructor parametrizado para la creación ágil de productos.

Métodos getter y setter con validaciones de lógica de negocio para precio y stock.

Sobrescritura del método toString() para una representación clara de los objetos.

Clase Main que demuestra el funcionamiento y flujo del sistema.

Estructura del Proyecto
El código fuente está organizado siguiendo el estándar de Maven, ubicándose en el paquete com.example. Los archivos se encuentran en la ruta: src/main/java/com/example/.

Cómo compilar y ejecutar el código
Para que el programa funcione correctamente con su estructura de paquetes, se deben seguir estos pasos desde la raíz del proyecto:

Compilación: Se utiliza el compilador de Java especificando el directorio de salida para que respete la jerarquía de paquetes:
javac -d . src/main/java/com/example/*.java

Ejecución: Se invoca la máquina virtual de Java llamando a la clase principal por su nombre calificado:
java com.example.Main

Resultado esperado en consola:
Al ejecutar el programa, se visualizará la siguiente información

Producto 1 - Nombre: Laptop
Producto 1 - Precio: 1200.0
Producto 2 - Nombre: Mouse
Producto 2 - Stock: 100
Representación completa:
Producto [ID: P123, Nombre: Laptop, Precio: 1200.0, Stock: 50]
Producto [ID: P456, Nombre: Mouse, Precio: 25.0, Stock: 100]

proyecto actualizado:estructura de paquetes corregida

