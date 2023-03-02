import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.binarySearch;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String filePath = "D:\\lucru_java_intellij\\lab2java\\src\\judete.in";

        List<String> listaJudete = new ArrayList<String>();

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader flux_in = new BufferedReader(fileReader);
            while (flux_in.ready())
            {
                String text = flux_in.readLine();

                listaJudete.add(text);
            }
            String[] arrayJudete = new String[listaJudete.size()];
            arrayJudete = listaJudete.toArray(arrayJudete);
            Arrays.sort(arrayJudete);
            System.out.println("Introduceti un judet: ");
            String judet = scan.nextLine();
            int rez = Arrays.binarySearch(arrayJudete,judet);
            if(rez == -1) {
                System.out.println("Judetul nu a fost gasit!");
                return;
            }
            System.out.println("Judetul a fost gasit pe pozitia : "+ rez);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}