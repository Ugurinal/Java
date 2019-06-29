package javaapplication2;

/**
 *
 * @author ugurinal
 */
public class JavaApplication2 {

    public static void main(String[] args) {
        String x = "Hello World!";
        System.out.println(x);
        x = x.toUpperCase(); //Converts all of the characters in this String to upper case
        System.out.println(x);
        int FirstSpace = x.indexOf(" "); //Returns the index within this string
                                         //of the first occurrence of the specified substring.
        System.out.println("The first space is at "+FirstSpace);
        x = "UGUR INAL - JAVA";
        x = x.toLowerCase(); //Converts all of the characters in this String to lower case
        int LastSpace = x.lastIndexOf(" ");
        System.out.println("The last space is at "+LastSpace);
        
        String FirstWord = x.substring(FirstSpace); // The substring begins with the character at
        System.out.println(FirstWord);
        String LastWord = x.substring(0, FirstSpace);
        System.out.println(LastWord);
        
        System.out.println("The 10. char is  "+x.charAt(10)+"  in x string");
        
        /* OUTPUT
        
        Hello World!
        HELLO WORLD!
        The first space is at 5
        The last space is at 11
        inal - java
        ugur 
        The 10. char is   -  in x string
        */
        
        
        
    }
    
}
