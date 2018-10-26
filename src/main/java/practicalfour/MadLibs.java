package practicalfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class MadLibs {

  public static void main(String[] args) {
    // TODO: display the name of the programmer and the date
    // declare the starting file and scanner
    File wordInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      wordInputsFile = new File("input/madlibs_inputs.txt");
      scanner = new Scanner(wordInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // TODO: Step One: Read in and display the words and numbers in a story

    // TODO: Step Two: Display the story using the input words and numbers

    // TODO: Step Three: Display a final thankyou message
  }

}
