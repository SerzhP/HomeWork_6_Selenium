import java.awt.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class HomeWorkChallenge {
    public static void main(String[] args) throws IOException {

        //1
//        readCsv();
        //3
//    archiveFile("C:\\Users\\Sergii\\Desktop\\TestJava.txt");
        //4
//        getWebsite();

//        String filePath = "C:\\Users\\Sergii\\Desktop\\website_content.txt";
//        getWebsite(filePath);

//    }


    //1
    /**Read the all players id’s and levels from the csv file named
     “Playes.csv” (which can be found in the homework folder).*/

//    private static void readCsv() throws IOException {
//        BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\Sergii\\Desktop\\Players.csv"));
//        String row;
//        while ((row = csvReader.readLine()) != null) {
//
//            String[] data = row.split(",");
//            System.out.println(data[0] + " , " + data[1]);
//
//        }
//        csvReader.close();
//    }

//    String filePath = "C:\\Users\\Sergii\\Desktop\\Players.csv";
//
//    String content = new String(Files.readAllBytes(Paths.get(filePath)));
//        System.out.println(content);}

    //2
    /**Answer questions 1+3 using Junit (Inside another project)*/

    //3
    /**Create a method which gets a file path and archive it (using zip /
     7z / rar etc.) */

//        private static void archiveFile(String fileToArchive) throws IOException {
//            File f = new File("C:\\Users\\Sergii\\Desktop\\Challenge.zip");
//            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f));
//            ZipEntry e = new ZipEntry(fileToArchive);
//            out.putNextEntry(e);
//            out.closeEntry();
//            out.close();
//        }

    //4

    /**
     * Create a method which writes a website (HTML) into a text file
     * For example: google.com HTML into a text file.
     */

//    private static void getWebsite() {
//        String content = null;
//        URLConnection connection = null;
//        try {
//            connection = new URL("https://www.google.com").openConnection();
//            Scanner scanner = new Scanner(connection.getInputStream());
//            scanner.useDelimiter("\\Z");
//            content = scanner.next();
//            scanner.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        System.out.println(content);
//    }
//    private static void getWebsite(String filePath) {
//        String content = null;
//        URLConnection connection = null;
//        try {
//            connection = new URL("https://www.google.com").openConnection();
//            Scanner scanner = new Scanner(connection.getInputStream());
//            scanner.useDelimiter("\\Z");
//            content = scanner.next();
//            scanner.close();
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
//                writer.write(content);
//                System.out.println("HTML content saved successful in file: " + filePath);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//}













