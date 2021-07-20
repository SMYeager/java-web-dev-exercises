package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(){

    }

    public static boolean searchTerm(){
        boolean value = false;
        String aliceStory = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word from Alice in wonderland: ");
        String word = input.nextLine();
        word.toLowerCase();

        aliceStory.toLowerCase();
        String[] arrAlice = aliceStory.split(" ");

        for(int i = 0; i < arrAlice.length; i++){
            if(word.equals(arrAlice[i])){
                value = true;
            }
        }

        return value;
    }

    public static void removeWord(){

    }
}

