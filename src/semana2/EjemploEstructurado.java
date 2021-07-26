/*
Hacer un Algoritmo en JAVA bajo el enfoque estructurado que lea el nombre de 3 estudiantes 
y sus dos notas parciales y determinar quien aprueba o no a asignatura. (Si la nota 
es inferior a 3 debe imprimir REPROBADO, de lo contario imprime APROBADO.
 */
package Semana2;

import java.util.Scanner;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class EjemploEstructurado {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String nombre;
        float nota1 = 0, nota2 = 0, definitiva = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite el nombre del Estudiante: ");
            nombre = leer.next();

            System.out.println("Digite la nota del primer parcial del Estudiante " + nombre + ": ");
            nota1 = leer.nextFloat();

            System.out.println("Digite la nota del segundo parcial del Estudiante " + nombre + ": ");
            nota2 = leer.nextFloat();

            definitiva = (nota1 + nota2) / 2;

            System.out.println("Definitiva : " + definitiva);

            if (definitiva >= 3) {
                System.out.println("Estudiante " + nombre + " APRUEBA LA ASIGNATURA\n\n");
            } else {
                System.out.println("Estudiante " + nombre + " NO APRUEBA LA ASIGNATURA\n\n");
            }
        }
    }
}
