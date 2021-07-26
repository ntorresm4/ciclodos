/*
La Programación Orientada a Objetos es un Paradigma de programación que surgio en
los años 90, es un enfoque muy aplicado hoy en día en el desarrollo de software.

Paradigma significa pensar o ejecutar algo de manera distinto, por lo que se
requiere tener la mente abierta para programar bajo este enfoque.

Dentro los conceptos de POO tenemos.

- Clase: Al desarrollar los Algoritmos se debe enfocar en identificar los elementos
que forman parte de la solución del problema (identificar las clases).  

Adicional de identificar las clases se debe definir la estructura de la misma (Que
en definitiva es la estructura del objeto).

Las estructura de las clases (Objetos) esta compuesta por:

Atributos: Representa las caracteristicas de la clase (en palabras simples son los
datos de la clase)

Métodos: Son las acciones que puede ejecutar la clase (se puede deducir que son
las funciones de la clase).

Relaciones: Las clases tiene una relación entre ellas que permite responder a los requerimientos
del problema a resolver.

- Objetos: Su estructura esta definida por las clases y partir de estas se puede 
crear un objeto.

- Abstracción: Capacidad de identificar las clases y su estructura que forma parte
de la solución.

- Encapsulamiento: La encapsulación se da cuando se definen los atributos de una 
clase con el nivel de acceso más restrictivo para que ese acceso o modificación 
de los atributos solo sea posible a través de sus métodos.



Hacer un Algoritmo en JAVA bajo el enfoque estructurado que lea el nombre de 3 
estudiantes y sus dos notas parciales y determine quien aprueba o no a asignatura. 
(Si la nota es inferior a 3 debe imprimir REPROBADO, de lo contario imprime 
APROBADO).

Para resolver el ejemplo de los 3 estudiantes y sus dos notas parciales (ver 
EjemploEstructurado.java)

se debe primero identificar las clases:

Clases: Estudiante, asignatura, ProgramaPrincipal
Atributos: Nombre, nota1, nota2
Métodos: CalcularDefinitiva, ImprimirMensaje
Relaciones: Estudiante - Asignatura (Estudiante cursa Asignatura)

Hasta el momento solo hemos aplicado la abstracción, determinando las clases, atributos, métodos y relaciones. Ahora 
vamos a determinar la estructura de las clases:

***************
Estudiante
***************
nombre
nota1
nota2
definitiva
***************

************************
POO (Programa Principal)
************************


*************************

Se descarta para este ejercicio el uso de la clase Asignatura, porque solo se 
realiza las acciones para una asignatura por lo que no se requiere atributos o 
acciones sobre las asignaturas.

Ahora identificamos los métodos de las clases (Acciones):

***************
Estudiante
***************
nombre
nota1
nota2
--------------
pedirNotas
calcularDefinitiva
ImprimirMensaje
***************

************************
POO (Programa Principal)
************************

----------------
main
*************************


 */
package Semana2;

// POO va a ser nuestra clase principal.

import java.util.Scanner;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Estudiante est = new Estudiante();  // Creo el Objeto est como tipo Estudiante.
        String nom;
        float n1, n2;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite el nombre del Estudiante: ");
            //est.nombre = leer.next();
            nom = leer.next();
            System.out.println("Digite la nota del primer Parcial: ");
            n1 = leer.nextFloat();
            System.out.println("Digite la nota del segunda Parcial: ");
            n2 = leer.nextFloat();
            est.datosEstudiante(nom);
            est.notasParciales(n1, n2);
            System.out.println("La nota definitiva del Estudiante "+ est.nombre+" es: "+est.calcularDefinitva());
            System.out.println("El Estudiante "+est.nombre+" el estado de la asignatura es: "+est.imprimirMensaje()+"\n\n");

        }
    }
}
