package prb2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static boolean eVocala(char c) {


        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
    }
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String filePath = "D:\\lucru_java_intellij\\lab2java\\src\\prb2\\cantec_in.txt";
        String outfile = "D:\\lucru_java_intellij\\lab2java\\src\\prb2\\cantece_out.txt";
        System.out.println("Introduceti grupul de litere: ");
        String grup = scan.nextLine();

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader flux_in = new BufferedReader(fileReader);
            FileWriter fw = new FileWriter(outfile);
            BufferedWriter flux_out = new BufferedWriter(fw);

            while(flux_in.ready())
            {
                int consoane = 0;
                String vers = flux_in.readLine();
                Vers versObj = new Vers();
                versObj.set_text(vers);
                StringTokenizer word = new StringTokenizer(vers);
                for(int i=0;i<vers.length();i++)
                {

                    if(eVocala(vers.charAt(i))) {
                        consoane++;
                    }
                }

                versObj.set_consoane(consoane);
                if(vers.endsWith(grup))
                {
                    System.out.println(vers);
                    versObj.setSteluta(true);
                }
                if(versObj.get_rndN() < 0.1)
                {
                    versObj.set_text(vers.toUpperCase());
                }
                versObj.set_nrCuvinte(word.countTokens());
                flux_out.append(" " + versObj.get_text() + " " + versObj.get_consoane() + " " + versObj.get_nrCuvinte() + " "+ versObj.get_rndN()+ " ");
                if(versObj.areSteluta())
                    flux_out.append("*");
                flux_out.newLine();
                flux_out.flush();

            }

            flux_out.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
