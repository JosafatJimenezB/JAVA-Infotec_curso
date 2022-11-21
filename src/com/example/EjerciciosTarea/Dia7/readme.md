# Ejercicios propuestos
1.- Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.

2.- Realiza un programa que pinte en consola un triángulo completo y un triángulo hueco, dada la altura de la figura solicita al usuario:
Ejemplo
Introduzca la altura de la figura: 5
*****

****

***

**

*

*****

*   *

*  *

* *

*


3.- Realiza un programa que solicite números al usuario y cuando el usuario ingrese un -1 se terminará el programa.
Al terminar el programa, mostrará lo siguiente en consola:
– mayor número introducido
– menor  número introducido
– suma de todos los números
– suma de los números positivos
– suma de los números negativos
– lista de todos los números primos de los números negativos
*El número -1 no contara como número.

4.- Uso de archivos json:
Investigar como leer y escribir información en archivos json.
Crea una clase llamada ArchivoJSON que contenga los siguientes atributos: nombre, tipo y peso.
Crea un archivo json que contenga una lista de elementos utilizando la misma estructura de la clase. Lee el archivo json y asigna los valores a una lista de objetos de tipo ArchivoJSON.
Modifica el nombre de cada elemento de la lista concatenando la siguiente cadena “ -modificado” a su nombre.
Guarda estos elementos modificados en el mismo archivo json.
**Extra** genera un backup del archivo original que mantenga su nombre original + la fecha en la que fue modificado.

Elabora un programa que traduzca palabras del español al inglés y al francés, se le solicitará al usuario la palabra a traducir, si la palabra existe en nuestro diccionario se obtendrán las traducciones correspondientes y se las mostrará al usuario en consola, en caso de que no exista la palabra en el diccionario el programa le solicitará al usuario las traducciones correspondientes para el lenguaje de inglés y francés. Las traducciones se almacenarán en un archivo con el formato y estructura de su preferencia.

Crear una clase llamada Película con las siguientes características:

Sus atributos son titulo, duración, estatus, genero y director.
Por defecto, la duración es de 2 horas y estatus es false.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el titulo y director.
Un constructor con todos los atributos, excepto de estatus.

Los métodos que se implementara serán:
Métodos get de todos los atributos, excepto de estatus.
Métodos set de todos los atributos, excepto de estatus.
Sobrescribe los métodos toString.
Crearemos una clase Videojuego con las siguientes características:
Sus atributos son titulo, duración, estatus, genero y compañía .
Por defecto, la duración será de 10 horas y estatus false.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el titulo y duración.
Un constructor con todos los atributos, excepto de entregado.

Los métodos que se implementara serán:
Métodos get de todos los atributos, excepto de estatus.
Métodos set de todos los atributos, excepto de estatus.
Sobrescribe los métodos toString.
Crear una interfaz llamada  Activar con los siguientes métodos:

activar(): cambia el atributo estatus a true.
desactivar(): cambia el atributo estatus a false.
isActivo(): devuelve el estado del atributo estatus;.
Método compareTo (Object a), compara duración de los videojuegos y las películas. Como parámetro que tenga un objeto.
Implementa los anteriores métodos en las clases Videojuego y Película. Ahora en tu método main realiza lo siguiente:

Crea dos arrays, uno de Películas y otro de Videojuegos, de 5 posiciones cada uno.
Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
Activa algunos  Videojuegos y Películas con el método  activar().
Cuenta cuant as Películas y Videojuegos hay activados. Al contarlos, devuelve los elementos inactivos.
Por último, indica el Videojuego con la mayor duración y la película que sean del género de terror y tenga mayor duración. Muéstralos en pantalla con toda su información (usa el método toString()).
**EXTRA investiga como utilizar enumeradores para los datos de género en la clase Película;