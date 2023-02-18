/**
 * @author Muhammad Fahd, Syed Ali
 * @version 1.0
 * Activity1
 * Term : Spring 2023
 * Year : 2023
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Menagerie{    //Main class used to create objects and save in file,Group03,Muhammad Fahd, Syed Ali, "Activity01",Spring, 2022
    /**
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        Animal animalObjects[] = new Animal[5];                                                 //Creates array of type Animal object with 5 lenght
        Tiger tiger1 = new Tiger("Javan tiger", "Tiger acreage #6");
        Fish fish1 = new Fish("False network catfish", "Fresh water");
        Tiger tiger2 = new Tiger("Begal tiger", "Ritchie area of RIT");
        Fish fish2 = new Fish("Shark", "Salt water");
        Tiger tiger3 = new Tiger("Siberian tiger", "Tiger acreage #4");
        animalObjects[0] = tiger1;                                                              //Appends objects toa array
        animalObjects[1] = fish1; 
        animalObjects[2] = tiger2; 
        animalObjects[3] = fish2; 
        animalObjects[4] = tiger3; 
        
        String line = "Report on animals..... \nTiger: "+animalObjects[0]+"\nFish: "+animalObjects[1]+"\nTiger: "+animalObjects[2]+"\nFish: "
        +animalObjects[3]+"\nTiger: "+animalObjects[4]+"\n\nCounts: \n       "+Fish.fishCount+" Fish\n       "+Tiger.tigerCount+" Tiger\n";
        final String filename = "Menagerie.txt";            //Name of file
        File file = new File(filename);

        if (!file.exists()) {                               //If file doesn't exits, creates one
            file.createNewFile();
            System.out.println("Creating a new file " + filename);
        }
        else{                                               // If file exists, it only appends
            System.out.println("Adding to the current file "+filename);
        }

        FileWriter writer = new FileWriter(file, true);         //Used to write the report into the file
        writer.write(line);
        writer.close();
        System.out.println("\n"+line);                  //Prints report
    }
}