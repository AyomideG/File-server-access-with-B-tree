/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mide_
 */
public class MakeFile {

    ArrayList<String> list = new ArrayList<>();

    //Writes the file names to the .txt file.
    public void writeFile(String s) {
        FileName f = new FileName();

        try {
            PrintWriter writer = new PrintWriter(s);
            writeToFile(writer, f);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Read the .txt file and then put(k, v) pair into the B-Tree.
    //This method is not used.
    public void readFile(File f) {
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                if (scan.hasNextLine()) {
                    list.add(scan.nextLine());
                } else {
                    scan.next();
                }
            }
            scan.close();

            BTree tree = new BTree();

            for (String temp : list) {
                tree.put(temp.substring(0, 7), temp);
            }

            System.out.println(tree.height());
            System.out.println(tree.size());
            System.out.println(tree);

            List s = tree.get("9999999"); //<------- This is an example to search for key in the code.

            for (Object t : s) {
                System.out.println(t);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //This creates the list of files based on the value of n.
    public void writeToFile(PrintWriter writer, FileName f) {
        // n is number of file names made.
        int n = 5000;

        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (c == 0) {
                writer.write(f.getFileName() + "\n");
                c = 0;
            } else {
                writer.write(f.getFileName() + " ");
                c++;
            }
        }
    }
}