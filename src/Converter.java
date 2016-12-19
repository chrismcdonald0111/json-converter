// Simple JSON Converter

import java.io.*;

public class Converter {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        File originalFile = new File("/Users/Chris/Downloads/companyNames.csv");
        BufferedReader br = new BufferedReader(new FileReader(originalFile));

        File newFile = new File("/Users/Chris/Downloads/newCompanyNames.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(newFile));

        String row;
        String newString;
        while ((row = br.readLine()) != null) {
            row = row.replaceAll("\"", "");
            newString = "\"" + row + "\",";
            //newString = "{ \"column\": \"092c2cd6-e9b1-46b7-9628-9ad86cf866fb\", \"operation\" : \"like\", \"value\" : [\"" + row + "\"]},";
            pw.println(newString);
        }

        pw.close();
    }

}