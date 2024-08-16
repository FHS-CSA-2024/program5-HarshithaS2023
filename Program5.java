//import stuff here?
public class Program5{
    public static void main(String[] args) {
        int royaleMiles = 286;
        int royaleGallons=9;
        double royaleAve = (double)royaleMiles/royaleGallons;
        royaleAve = (double) Math.round(royaleAve*10)/10;
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon: \n");
        System.out.println("Royale averaged " + royaleAve + " m/g \n");
        int koopaMiles = 412;
        int koopaGallons = 40;
        double koopaAve = (double) koopaMiles/koopaGallons;
        koopaAve = (double) Math.round(koopaAve*10)/10;
        System.out.println("Koopa King averaged " + koopaAve + " m/g \n");
        int pipeMiles = 361;
        int pipeGallons = 18;
        double pipeAve = (double) pipeMiles/pipeGallons;
        pipeAve=(double) Math.round(pipeAve*10)/10;
        System.out.println("Pipe Freame averaged "+pipeAve+ " m/g \n");
        int badwagonMiles = 161;
        int badwagonGallons = 11;
        double badAve = (double) badwagonMiles/badwagonGallons;
        badAve = (double) Math.round(badAve*10)/10;
        System.out.println("Badwagon averaged "+badAve+" m/g");
    }
}
//Your code here

//Paste console output below:
/*

Mushroom Cup Prix Racer Average Miles/Per Gallon: 

Royale averaged 31.8 m/g 

Koopa King averaged 10.3 m/g 

Pipe Freame averaged 20.1 m/g 

Badwagon averaged 14.6 m/g
*/
