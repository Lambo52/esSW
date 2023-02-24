package Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Songs10 implements songIterator{
    HashSet<songInfo> bestSongs;

    public Songs10() {
        bestSongs = new HashSet<songInfo>();

        bestSongs.add(new songInfo("higher",2011));
        bestSongs.add(new songInfo("uml",2018));
        bestSongs.add(new songInfo("walking the wire",2017));
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}