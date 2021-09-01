package cstevens_week1;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 1 - Data Output
 * @Date: May 17, 2021
 * @Description: Data Output - A Simple Program That Outputs Some Text
 */

/* ASSIGNMENT
 *      Write a program that will output the following text.
 *      Your output should look exactly like the example.
 */

 /* REQUIREMENTS
 *      Complete the program header (name, date, brief description)
 *      Use 6 "System.out" lines of code
 *      The last ouotput line should include a basic math formula to show the
 *          total of 17 as per the example
 *      Insert comment(s) in your code where appropriate
 */

 /* DELIVERABLES
 *      Please zip your program and submit the zip file by the due date listed
 *          in the requirements.
 */

//**************
// BEGIN PROGRAM
//**************

// Imports

//Begin Class Main
public class Main {

    //Begin Main Method
    public static void main(String[] args) {
        
    // Define integer variables for 5(1st instance),7 and 5(2nd instance)
    int x = 5;
    int y = 7;
    int z = 5;
    
    // Use 6 "System.out" lines of code
    System.out.println("This is my Haiku");
    System.out.println("It is a Java Haiku");
    System.out.println("With Five Seven Five");
    
    // Use two lines of code for the 4th output line
    System.out.print("That means it has " + x + " syllables, then " + y);
    System.out.println(" syllables, then " + z + " syllables yet again.");
    
    // Last output line should incluide basic math formula to return '17' value
    System.out.println("That means there are a total of " + (x+y+z) + 
            " syllables in a Haiku.");

    } //End Main Method

} //End Class Main


