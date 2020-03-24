package jay.learning;

public class MegaBytesConverter {
    private static final int KB_TO_MB=1024;
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }else {
            int mb = kiloBytes / KB_TO_MB;
            int kb = kiloBytes % KB_TO_MB;

            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }
}
