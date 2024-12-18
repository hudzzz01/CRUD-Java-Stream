package com.enigma.service;

import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    //Input Number atau input string
    public Integer getInt(String prompt){
        System.out.print(prompt);
        //lakukan validasi input harus berupa angka
        while (!scanner.hasNextInt()){
            System.out.println("input harus berupa angka");
            scanner.nextLine();
            System.out.println(prompt);
        }
        Integer result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public double getDouble(String prompt){
        System.out.print(prompt);
        //lakukan validasi input harus berupa angka
        while (!scanner.hasNextDouble()){
            System.out.println("input harus berupa angka desimal");
            scanner.nextLine();
            System.out.println(prompt);
        }
        double result = scanner.nextDouble();
        scanner.nextLine();
        return result;
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }
}

