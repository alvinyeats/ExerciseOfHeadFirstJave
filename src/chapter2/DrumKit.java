package chapter2;

public class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    public static void main(String [] args) {
        DrumKit d = new DrumKit();
        if (d.snare) {
            d.playSnare();
            d.snare = false;
        }
        d.playTopHat();

    }

}