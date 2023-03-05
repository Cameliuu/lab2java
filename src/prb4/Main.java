package prb4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        List<Persoana> persoane= new ArrayList<Persoana>();
        System.out.println("Introduceti nr de pers: ");
        int nr = scan.nextInt();
        scan.nextLine();
        while(nr > 0)
        {
            Persoana p = new Persoana();
            System.out.println("Introduceti numele: ");
            p.set_nume(scan.nextLine());
            System.out.println("Introduceti CNP: ");
            String cnp = scan.nextLine();
            while(!p.isValidCnp(cnp))
            {
                System.out.println("CNP INVALID");
                System.out.println("Introduceti CNP: ");
                 cnp = scan.nextLine();
            }
            p.set_cnp(cnp);
            p.getBirthdateFromCNP(cnp);
            persoane.add(p);
            nr--;



        }
        for(Persoana p: persoane)
        {
            System.out.println("************************************************************");
            System.out.println(p);
            System.out.println("************************************************************");
        }
    }
}
