import java.util.*;
public class Main
{
   
  /* 
Current Operations:-
 1. print() - Prints query.
 2. input() - inputs as string printing text in ("");
 3. int_input() - similar to input but integer
 4. char_input() - similar to input but character
 5. double_input() - similar to input but double
 6. exit() - exits the program
 7. time_sleep() - puts the terminal to sleep as per the amount of seconds mentioned in (); Note: Do not use "" inside ();
 8. os_system() - Executes operating commands. 
     -> cls - Usage: os_system("cls") = Clears terminal
 9. Color - To add color to your text use the following syntax:
   print(COLOR+"text or variable"+variable+RESET);
NOTE: If you are using IDEs such as BlueJ, the color and cls functions will not work. It is recommended to use the program in windows terminal or replit.
*/

   //Main Function. All Operations to be done here 
  public static void main(String[] args)
    {
        print("Hi"); // basic print
        String a = input("Enter string: "); //string input
        int b = int_input("Enter number: "); // integer input
        print(b);// variable print
        time_sleep(2); //terminal sleep
        os_system("cls"); // Clear terminal
        print(RED+"Example"+RESET); // Color print
        exit(); //exit terminal
        print("Exit");
    }


// Functions are located below ⬇️⬇️. 










  
  //Colors Start
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE
//Colors End
//Print Function
   private static void print(String a)
   {
       System.out.println(a);
       
   }
  private static void print(int a)
   {
       System.out.println(a);
   }
   private static void print(double a)
   {
       System.out.println(a);
   }
   private static void print(char a)
   {
       System.out.println(a);
   }
   private static void print(float a)
   {
       System.out.println(a);
   }
  //input function
   private static String input(String a)
   {
       Scanner in = new Scanner(System.in);
       print(a);
       String c = in.nextLine();
       return c;
   }
  //integer input function
   private static int int_input(String a)
   {
       Scanner in = new Scanner(System.in);
       print(a);
       int c = in.nextInt();
       return c;
   }
  //character input function
   private static char char_input(String a)
   {
       Scanner in = new Scanner(System.in);
       print(a);
       char c = in.next().charAt(0);
       return c;
   }
  //double unput function
  private static double double_input(String a)
   {
       Scanner in = new Scanner(System.in);
       print(a);
       double c = in.nextDouble();
       return c;
   }
  //Exit Function
  private static void exit()
   {
       System.exit(0);
   }
  //Sleep function
  private static void time_sleep(long s)
   {
    long ms = s*1000;
    try {
    Thread.sleep(ms);
    } catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    }
   }
  //Clear Screen function
  private static void os_system(String a)
  {
if(a=="cls")
{
System.out.print("\033[H\033[2J");  
System.out.flush();  
}
else
{
 print(RED+"Not yet implemented!"+RESET);
}
    
  }
    
}
