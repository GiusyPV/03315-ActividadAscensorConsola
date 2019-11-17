/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Constantes
        final int PISO_MIN = 0;
        final int PISO_MAX = 10;

        //Variables
        int personaUno = 0;
        int personaDos = 0;
        int personaTres = 0;
        int personaCuatro = 0;
        boolean perunoOk = false;
        boolean perdosOk = false;
        boolean pertresOk = false;
        boolean percuatroOk = false;

        //Bucle persona 1
        do {
            try {

                System.out.print("Persona 1 introduzca al piso que desea ir .: ");
                personaUno = SCN.nextInt();
                perunoOk = true;

            } catch (Exception e) {

                System.out.println("ERROR: El valor introducido no es correcto.");

            } finally {
                SCN.nextLine();
            }

            perunoOk = personaUno > PISO_MIN && personaUno <= PISO_MAX;

        } while (!perunoOk);

        System.out.printf("Se dirige al piso ....: %d%n", personaUno);

        do {
            try {
                System.out.print("Persona 2 introduzca al piso que desea ir .:");
                personaDos = SCN.nextInt();
                perdosOk = true;
            } catch (Exception e) {

                System.out.println("ERROR: El valor introducido no es correcto.");
            } finally {
                SCN.nextLine();
            }
            perdosOk = personaDos > PISO_MIN && personaDos <= PISO_MAX;
        } while (!perdosOk);

        System.out.printf("Se dirige al piso ....: %d%n", personaDos);

        do {
            try {
                System.out.print("Persona 3 introduzca al piso que desea ir .:");
                personaTres = SCN.nextInt();
                pertresOk = true;
            } catch (Exception e) {
                System.out.println("ERROR: El valor introducido no es correcto.");
            } finally {
                SCN.nextLine();
            }

            pertresOk = personaTres > PISO_MIN && personaTres <= PISO_MAX;
        } while (!pertresOk);

        System.out.printf("Se dirige al piso ....: %d%n", personaTres);

        do {
            try {
                System.out.print("Persona 4 introduzca al piso que desea ir .:");
                personaCuatro = SCN.nextInt();
                percuatroOk = true;
            } catch (Exception e) {
                System.out.println("ERROR: El valor introducido no es correcto.");
            } finally {
                SCN.nextLine();
            }
            percuatroOk = personaCuatro > PISO_MIN && personaCuatro <= PISO_MAX;
        } while (!percuatroOk);
        System.out.printf("Se dirige al piso ....: %d%n", personaCuatro);

    }
}
