package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Songs00 implements songIterator{


    ArrayList<songInfo> bestSongs;

    public Songs00() {
        bestSongs = new ArrayList<songInfo>();

        bestSongs.add(new songInfo("demons",2008));
        bestSongs.add(new songInfo("canzone brutta",2009));
        bestSongs.add(new songInfo("amala",2001));
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
