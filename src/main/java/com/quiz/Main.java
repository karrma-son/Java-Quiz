package com.quiz;

import com.quiz.inputs.ScannerInput;
import com.quiz.inputs.model.User;

public class Main {
    static void main() {

        ScannerInput input = new ScannerInput();

        char answer;
        boolean isAlphabet;
        do {
            input.showQuestion();
            answer = input.getChar();
            System.out.println("input " + answer);
            isAlphabet = input.isAlphabet(answer);
            if (!isAlphabet) {
                System.err.println("Please enter a character A-Z");
            }
        } while (!isAlphabet);



        if ( answer == 'A' ) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }

//        System.out.println("Please enter your first name");
//        String firstName = input.getString();
//
//        System.out.println("Please enter your last name");
//        String lastName = input.getString();
//
//        System.out.println(firstName + " " + lastName);


//        User myUser = new User();
//        User Marshawn = new User();
//
//        Marshawn.setFirstName("Mason");
//        System.out.println(Marshawn.getFirstName());


//        System.out.println(myUser.FirstName);
//        ScannerInput myInput = new ScannerInput();
    }
}
