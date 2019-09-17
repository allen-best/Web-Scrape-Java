/* OpenCommercial.java */

import java.io.IOException;
import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    URL u = new URL("http://www." + inputLine  +  ".com/"); 
    InputStream ins = u.openStream(); 
    InputStreamReader isr = new InputStreamReader(ins); 
    BufferedReader company = new BufferedReader(isr); 
    String[] strArray = new String[5]; 
    for(int i = 0; i < 5; i++){
      strArray[i] = company.readLine();
    }
    for(int i = 0; i < strArray.length; i++){
      System.out.println(strArray[strArray.length - i - 1]);
    }
  }
}
