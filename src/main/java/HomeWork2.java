/*
Created by: Rihards Dzerkals, group 1.
Write a program that uses the vector and checks whether the vector contains a palindrome, i.e. whether the vector does or does not read the same forward as backward
(e.g., a vector containing 1, 2, 3, 2, 1 is a palindrome, but a vector containing 1, 2, 3, 4 is not).
 */
import java.util.Scanner;

public class HomeWork2 {
    //Task 1.
    public static void main(String[] args) {


        //For reading input
        Scanner reader = new Scanner(System.in);
        //Print out the instructions for user what to do
        System.out.print("Enter a text or integers and see if it's a palindrome or no: ");
        //Variables for given word and reversed string, ch just a helper to reverse the strings.
        String givenWord;
        String reversedWord = "";
        char ch;
        givenWord = reader.nextLine();
        //Loops through the word and reverses it by taking char at index of i and putting it at the start of the reversed string.
        for(int i = 0; i < givenWord.length(); i++){
            ch = givenWord.charAt(i);
            reversedWord = ch+reversedWord;
        }
        //Checking if the given word equals the reversed word and then prints out the proper text.
        if(givenWord.equals(reversedWord)){
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome!");
        }


    }



}
