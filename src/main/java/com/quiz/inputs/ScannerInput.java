package com.quiz.inputs;

import java.util.Scanner;

public class ScannerInput {
//    private Scanner scanner = new Scanner(System.in);
    private final Scanner myScanner;

    public void showQuestion() {
        System.out.println("Who was the first super saiayan?");
        System.out.println("A. Goku");
        System.out.println("B. Vegeta");
        System.out.println("C. Chichi");
        System.out.print("\nEnter your choice: ");
    }

//    public boolean isAlphabet(char character){
//        String string = character + "";
//        char uppercaseCharacter = string.toUpperCase().charAt(0);
//        return uppercaseCharacter >= 'A' && uppercaseCharacter <= 'Z';
//    }

    public boolean isAlphabet(char character) {
         for( char i = 'a'; i <= 'z'; i++){
             String letterString = character + "";
             char upperCaseLetter = letterString.toUpperCase().charAt(0);
             if (i == upperCaseLetter) {

                return true;
            }
         }



         return false;
    }

    public ScannerInput() {
        myScanner = new Scanner(System.in);
    }
    public String getString() {
        return myScanner.nextLine();
    }

    public char getChar() {
       return myScanner.nextLine().toUpperCase().charAt(0);


    }
}
