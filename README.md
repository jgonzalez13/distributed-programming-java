# Tema 3 Interfaces y Herencia

## Crea un proyecto con Maven utilizando el arquetipo maven-archetype-simple del menú de nuevo proyecto en Intellij IDEA como se muestra en la siguiente figura.

A continuación, elije cualquier nombre para el proyecto y finaliza el asistente de creación de proyecto. Dentro del proyecto, crea una interfaz llamada Polygon que tiene un método getArea() que regresa un flotante con el área del polígono y otro método getSides() que regresa un entero del número de lados que tiene el polígono.

Crea las clases Square, Circle y Rectangle que van a implementar la interfaz Polygon. Dependiendo de la figura, los métodos getArea() y getSides() deben regresar los valores correctos. En la clase App donde se encuentra el método main(), crea distintos objetos para Square, Circle y Rectangle utilizando Polygon como tipo de objeto al momento de declararlos. Después utiliza los métodos de cada uno de los objetos getArea() y getSides() para imprimir los resultados y observar el polimorfismo que creamos a partir de la interfaz Polygon.

[Volver Al Inicio](https://github.com/jgonzalez13/distributed-programming-java)
