/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagitexample;

import java.util.Scanner;

public class JavaGitExample {

    public static void main(String[] args) {

        int opcion, c = 0;
        String nombreClase, apellidoClase, cedulaClase;
        Scanner lector = new Scanner(System.in);

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
                    nombreClase = lector.next();
                    nit[c].setNombre1(nombreClase);
                    //nit[c].nombre = lector.next();
                    System.out.println("ingrese el apellido:");
                    apellidoClase = lector.next();
                    nit[c].setApellido1(apellidoClase);
                    //nit[c].apellido = lector.next();
                    System.out.println("ingrese el numero de cedula:");
                    cedulaClase = lector.next();
                    nit[c].setCedula1(cedulaClase);
                    //nit[c].cedula = lector.next();
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

                            if (buscar.equals(nit[i].getNombre1())) {
                                System.out.println("el usuario si existe:");
                                System.out.println("datos: ");
                                System.out.println("nombre: " + nit[i].getNombre1());
                                System.out.println("apellido:" + nit[i].getApellido1());
                                System.out.println("cedula: " + nit[i].getCedula1());
                                //actualiza los datos
                                System.out.println("ingrese el nuevo nombre:");
                                nombreClase = lector.next();
                                nit[i].setNombre1(nombreClase);
                                //nit[i].nombre = lector.next();
                                System.out.println("ingrese el nuevo apellido:");
                                apellidoClase = lector.next();
                                nit[i].setApellido1(apellidoClase);
                                //nit[i].apellido = lector.next();
                                System.out.println("ingrese el nuevo numero de cedula:");
                                cedulaClase = lector.next();
                                nit[i].setCedula1(cedulaClase);
                                //nit[i].cedula = lector.next();
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

                    int j = 0,
                     esta = 0;
                    String buscaUsuario;
                    System.out.println("ingrese el nombre del usuario para buscar datos:");
                    buscaUsuario = lector.next();
                    if (c > 0) {
                        nit[j] = new Usuario();
                        for (j = 0; j <= c; j++) {
                            if (buscaUsuario.equals(nit[j].getNombre1())) {
                                System.out.println("el usuario si existe:");
                                System.out.println("datos: ");
                                System.out.println("nombre: " + nit[j].getNombre1());
                                System.out.println("apellido: " + nit[j].getApellido1());
                                System.out.println("cedula: " + nit[j].getCedula1());
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
                            System.out.println("nit: " + p);
                            System.out.println("nombre: " + nit[p].getNombre1());
                            System.out.println("apellido: " + nit[p].getApellido1());
                            System.out.println("cedula: " + nit[p].getCedula1());
                            
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
