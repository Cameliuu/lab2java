package prb3;

public class Main {
    public static void main(String[] args) {
        String a = "El classico 3-1 scor corect a zis Razvan";
        String b = "Nu stiu";
        String rez = a.substring(0,5)+ " " +   b + " "  +a.substring(5+b.length()) ;
        System.out.println(rez);
        StringBuilder sb = new StringBuilder(rez);
        sb.delete(6,6+b.length());
        System.out.println(sb);

    }
}
