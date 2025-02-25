package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int moneda,menu,total = 0,veinte = 0,cincuenta = 0,cien = 0,doscientos = 0,quinientos = 0;
        boolean romper = true;

        while (romper){
            System.out.println("1. Ingresar moneda");
            System.out.println("2. Numero de monedas por denominacion");
            System.out.println("3. Conocer el total");
            System.out.println("4. ROMPER LA ALCANCIA");
            System.out.println("Ingrese la opcion deseada: ");
            menu = teclado.nextInt();
            switch (menu){
                case 1:
                    System.out.println("1. $20");
                    System.out.println("2. $50");
                    System.out.println("3. $100");
                    System.out.println("4. $200");
                    System.out.println("4. $500");
                    System.out.println("Ingrese la opcion deseada: ");
                    moneda = teclado.nextInt();
                    switch (moneda) {
                        case 1:
                            veinte++;
                            total += 20;
                            break;
                        case 2:
                            cincuenta++;
                            total += 50;
                            break;
                        case 3:
                            cien++;
                            total += 100;
                            break;
                        case 4:
                            doscientos++;
                            total += 200;
                            break;
                        case 5:
                            quinientos++;
                            total += 500;
                            break;
                        default:
                            System.out.println("DENOMINACIÓN INVALIDA!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Actualmente cuenta con " + veinte + " monedas de $20");
                    System.out.println("Actualmente cuenta con " + cincuenta + " monedas de $50");
                    System.out.println("Actualmente cuenta con " + cien + " monedas de $100");
                    System.out.println("Actualmente cuenta con " + doscientos + " monedas de $200");
                    System.out.println("Actualmente cuenta con " + quinientos + " monedas de $500");
                    break;
                case 3:
                    System.out.println("Actualmente el total ahorrado es $" + total);
                    break;
                case 4:
                    romper = false;
                    System.out.println("USTED HA ROTO SU ALCANCIA!");
                    total=veinte=cincuenta=cien=doscientos=quinientos=0;
                    break;
                default:
                    System.out.println("OPCIÓN NO VALIDA!");
                    break;
            }
        }
    }
}