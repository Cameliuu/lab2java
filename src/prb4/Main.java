package prb4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String control = "279146358279";
        List<Persoana> persoane= new ArrayList<Persoana>();
        Pattern pattern = Pattern.compile("{1256}[0-9]*");
        System.out.println("Introduceti nr de pers: ");
        int nr = scan.nextInt();
        while(nr > 0)
        {
            Persoana p = new Persoana();
            System.out.println("Introduceti varsta: ");
            p.set_varsta(scan.nextInt());
            System.out.println("Introduceti CNP: ");
            p.set_cnp(scan.nextLine());

        }
    }
}
