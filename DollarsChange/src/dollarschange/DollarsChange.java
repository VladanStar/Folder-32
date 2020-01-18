package dollarschange;

import java.util.Scanner;

public class DollarsChange {

    public static void main(String[] args) {
        // kreiranje objekta klase scanner
        Scanner input = new Scanner(System.in);
        
        // unos ukupne sume u dolarima, sa decimalama
        double sumaDolara = input.nextDouble();
        
        int ostatakSume = (int)(sumaDolara*100);
        
        //utvrditi sumu samo u dolarima a ostatk u centima
        int brojJednogDolara =  ostatakSume/100;
        ostatakSume = ostatakSume%100;
        
        // Utvrditi broj quarters i ostatak u centima
        int brojCetvrtDolara = ostatakSume/25;
        ostatakSume = ostatakSume%25;
        
        // Utvrditi broj u dimes i ostatak u centima
        int brojDimea = ostatakSume/10;
        ostatakSume = ostatakSume%10;
        
        // utvrditi broj niklesa i ostatk u centima
        int brojNikles = ostatakSume/5;
        ostatakSume = ostatakSume%15;
        
        // utvrditi broj penija
        int brojPenija = ostatakSume;
        
        System.out.println("Vasa sume " + sumaDolara + " sastoji se od: ");
        System.out.println("Od novcanica jednog dolara: " + brojJednogDolara + " dolara" );
        System.out.println("Od kovanica cetvrt dolara:  " + brojCetvrtDolara + "cetvrt dolara" );
        System.out.println("Od kovanica dimes:  " + brojDimea + " dimes");
        System.out.println("Od kovanica nikles:  " + brojNikles + " nikles");
        System.out.println("Od kovanica penija: " + brojPenija ) + "penija'";
        
   

    }

}
