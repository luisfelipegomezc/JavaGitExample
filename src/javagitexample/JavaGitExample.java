/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagitexample;

import java.util.Scanner;

public class JavaGitExample {

    public static void main(String[] args) {

        int opcion;
        Scanner lector = new Scanner(System.in);
        int c = 0;
        Usuario[] nit = new Usuario[10];

        do {

            System.out.println("Digite una opción: ");
            System.out.println("1. ingresar usuario");
            System.out.println("2. actualizar usuario");
            System.out.println("3. eliminar usuario");
            System.out.println("4. buscar usuario");
            System.out.println("5. imprimir base de datos");
            System.out.println("6. salir");
            opcion = lector.nextInt();

            switch (opcion) {

                case 1:
                    c++;
                    nit[c] = new Usuario();
                    System.out.println("ingrese el nombre:");
                    nit[c].nombre = lector.next();
                    System.out.println("ingrese el apellido:");
                    nit[c].apellido = lector.next();
                    System.out.println("ingrese el numero de cedula:");
                    nit[c].cedula = lector.next();
                    System.out.println("se ingreso el usuario con exito");

                    break;

                case 2:

                    int i = 0,
                     estado = 0;
                    String buscar = new String();
                    System.out.println("ingrese el nombre del usuario para actualizar datos:");
                    buscar = lector.next();
                    if (c > 0) {
                        nit[i] = new Usuario();
                        for (i = 0; i < c + 1; i++) {

                            if (buscar.equals(nit[i].nombre)) {
                                System.out.println("el usuario si existe:");
                                System.out.println("datos: ");
                                System.out.println("nombre: " + nit[i].nombre);
                                System.out.println("apellido:" + nit[i].apellido);
                                System.out.println("cedula: " + nit[i].cedula);
                                //actualiza los datos
                                System.out.println("ingrese el nuevo nombre:");
                                nit[i].nombre = lector.next();
                                System.out.println("ingrese el nuevo apellido:");
                                nit[i].apellido = lector.next();
                                System.out.println("ingrese el nuevo numero de cedula:");
                                nit[i].cedula = lector.next();
                                estado = 1;
                                break;

                            }

                        }
                    }

                    if (estado == 0) {
                        System.out.println("no existe el usuario");
                    }
                    break;

                case 3:

                    break;

                case 4:

                    int j = 0, esta = 0;
                    String buscaUsuario;
                    System.out.println("ingrese el nombre del usuario para buscar datos:");
                    buscaUsuario = lector.next();
                    if (c > 0) {
                        nit[j] = new Usuario();
                        for (j = 0; j <= c; j++) {
                            if (nit[j].nombre.equals(buscaUsuario)) {
                                System.out.println("el usuario si existe:");
                                System.out.println("datos: ");
                                System.out.println("nombre: " + nit[j].nombre);
                                System.out.println("apellido: " + nit[j].apellido);
                                System.out.println("cedula: " + nit[j].cedula);
                                esta = 1;
                                break;
                            }
                        }
                    } 
                    if (esta == 0) {
                        System.out.println("no existe el usuario");
                    }
                    break;

                case 5:

                    int p = 0;
                    nit[p] = new Usuario();
                    if (c > 0) {
                        for (p = 0; p <= c; p++) {
                            System.out.println("datos:");
                            System.out.println("nit: " +p);
                            System.out.println("nombre: " + nit[p].nombre);
                            System.out.println("apellido: " + nit[p].apellido);
                            System.out.println("cedula: " + nit[p].cedula);
                        }
                    }
                    break; 
            }
        } while (opcion != 6);

    }
    /*System.out.println("ensayo de repositorio");
        System.out.println("ensayo de actualización");
         System.out.println("ensayo 2 de actualización");
         System.out.println("ensayo 3 de actualización");
     */

}
