package CommonProblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StringExtractor {
    public static void main ( String [] arguments )
    {
        readFile(arguments[0]);
    }

    private static void readFile(String filename)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename + "_new"));
            String line;
            while ((line = reader.readLine()) != null)
            {
                if (line.toLowerCase().contains("profileid")) {
                    writer.write(line);
                }
            }
            reader.close();
            writer.close();
        }
        catch (Exception e)
        {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
        }
        System.out.println("Finished!");
    }
}
