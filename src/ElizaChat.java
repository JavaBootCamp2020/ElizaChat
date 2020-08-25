/*
Author: Gil Silva
This is an application that should ask questions to the user and
respond using users inputs.
Output should follow template provided.
Java Bootcamp.
 */
import java.util.Scanner;

public class ElizaChat {
    public static void main(String[] args){
        //Create a scanner to receive user's input.
        Scanner input = new Scanner(System.in);


        //Creates a variable to introduce the chat to the user and reuse the greeting as necessary
        String welcomeMsg = "Welcome to Eliza Chats! My name is Eliza.\n What's your name?";


        //Introduction to user and receive first user's input
        System.out.println(welcomeMsg);
        String name = input.nextLine();

        //Replies to  user and start a conversation
        System.out.println("Nice to meet you, " + name + ". How has your day been?");
        String answer = input.nextLine();

        //Uses user's input to carry on the conversation
        String elizaReply = "I hear you. Anything in particular tha makes you say your days is ";
        System.out.println(elizaReply + answer + "?");
        String userReply = input.nextLine();


        String elizaReplyAgain = ", it has been my pleasure to speak with you. Have a nice day!";
        System.out.println(name + elizaReplyAgain);

        // Ends the chat by acknowledging te user's responses
        System.out.println("Here's a summary of our conversation: \n" +
                name + ", your day has been " + answer + ". Because you said: " + userReply + ".");




    }
}
