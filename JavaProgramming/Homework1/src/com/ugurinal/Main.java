package com.ugurinal;

import java.io.File;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        {
            int total = 0;
            float average = 0;

            File myFile = new File("Summary.txt");
            myFile.createNewFile();

            PrintWriter output = new PrintWriter(myFile);
            output.print("Scores = [");

            try {
                URL url = new URL("http://enformatik.cu.edu.tr/Java-2/Scores.txt");

                Scanner input = new Scanner(url.openStream());
                ArrayList<Integer> numbers = new ArrayList<Integer>();

                while (input.hasNext()) {
                    int number = Integer.parseInt(input.next());
                    numbers.add(number);

                    // check if it is last element or not
                    if(input.hasNext()){
                        output.print(number + ", ");
                    }
                    else{
                        output.print(number);
                    }
                }

                for (Integer number : numbers) {
                    total += number;
                }


                average = total / (float)numbers.size();
                output.print("]\n");
                output.println("Total = " + total);
                output.println("Average = " + average);
                output.close();
            }
            catch (MalformedURLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
