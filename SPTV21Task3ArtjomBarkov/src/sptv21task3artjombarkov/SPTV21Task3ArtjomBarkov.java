/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task3artjombarkov;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV21Task3ArtjomBarkov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String last = scanner.nextLine();
        System.out.print("Введите число и месяц: ");
        String number = scanner.nextLine();
        System.out.print("Введите год рождения: ");
        String year = scanner.nextLine();
        System.out.println(name+" "+last+" родился "+number+" "+year+" года.");
        // TODO code application logic here
    }
    
}
