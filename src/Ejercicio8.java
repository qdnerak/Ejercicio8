import java.util.Scanner;

/*Queremos guardar los nombres y las edades de los alumnos de un curso.
* Realiza un programa que introdusca el nombre y la edad de cada alumno
* El proceso de lectura terminara cuandp se introduzca como nombre un *
* Alfinal se mostrara los siguientes datos:
* -todos los alumnos que tienen más edad*/
public class Ejercicio8 {
    String [] nombre;
    int [] edad;
    Scanner scanner;
    String input;
    public Ejercicio8(){
        nombre= new String[3];
        edad= new int[3];
        scanner= new Scanner(System.in);
    }
    public void ejecutar(){
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Edad["+i+"]:");
            edad[i]= scanner.nextInt();
            for (int k = 0; k < nombre.length; k++) {
                System.out.println("Nombre["+k+"]:");
                nombre[k]=scanner.next();
                break;
            }
        }
        //ordenamos el vector con metodo burbuja
        for (int i = 0; i < edad.length-1; i++) {
            for (int j = 0; j < edad.length - 1 - i; j++) {
                if (edad[j]<edad[j + 1]){
                    int auxiliar= edad[j];
                    edad [j]=edad[j+1];
                    edad[j + 1]=auxiliar;

                }

            }

        }

        //mostramos alumnos con mas edad
        System.out.println("ALUMNOS CON MAS EDAD");
        //mostramos edades
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad:" + edad[i]);
            //mostramos nombres
            for (int k = 0; k < nombre.length; k++) {
                System.out.println("nombre:" + nombre[k]);
            }
        }
    }
}

