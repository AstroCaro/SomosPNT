#Ejercicio y consideraciones generales de resolución

## Algunas consideraciones previas
En la capa de servicio donde se implementa la lógica de negocio, se utilizan algunas validaciones en las operaciones de creación de entidades para restringir el uso de valores en los atributos por fuera del dominio, y por fines prácticos y para mantener la simplicidad del proyecto, no se realizan validaciones en el modelo.

Así como tampoco, se utiliza una capa controladora para separar los métodos que muestran información al usuario.

## Ejercicio

Imaginemos un supermercado de barrio.

Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina la ejecución:

```
Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20

Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18

Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19

Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
=============================

Producto más caro: Frutillas

Producto más barato: Coca-Cola
```

La solución debe cumplir con los siguientes requisitos:

1. Diseñar una solución orientada a objetos.
2. La salida es por consola y exactamente como se requiere.
3. Usar solamente las clases provistas por Java 8..
4. Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo.
5. El algoritmo usado para la impresión no tiene que depender de la cantidad o tipo de productos. 
6. Para mostrar el mayor / menor, utilizar la interfaz Comparable. 
7. Para imprimir por pantalla, sobrescribir el método toString()
