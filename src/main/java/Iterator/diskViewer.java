package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class diskViewer {
    songIterator song00Iter;
    songIterator song10Iter;

    public diskViewer(songIterator song00Iter, songIterator song10Iter) {
        this.song00Iter = song00Iter;
        this.song10Iter = song10Iter;
    }

    public void showMusic() {
//        Iterator songs00 = song00Iter.createIterator();
//        Iterator song10 = song10Iter.createIterator();

        System.out.println("musica 00:\n\n");
        printTheSongs(song00Iter.createIterator());
        System.out.println("musica 10:\n\n");
        printTheSongs(song10Iter.createIterator());

    }
    public void printTheSongs(Iterator i) {
        while(i.hasNext()) {
            songInfo si = (songInfo) i.next();

            System.out.println(si.songName);
            System.out.println(si.data);
        }
        System.out.println();
    }


}
