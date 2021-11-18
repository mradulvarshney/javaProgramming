package music.live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String args[]) {
        Veena obj1 = new Veena();
        obj1.play();
        Saxophone obj2 = new Saxophone();
        obj2.play();
        Playable obj[] = new Playable[2];
        obj[0] = obj1;
        obj[1] = obj2;
        for (int i=0;i<obj.length;i++) {
            obj[i].play();
        }
    }
}
