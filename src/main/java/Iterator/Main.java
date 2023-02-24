package Iterator;

public class Main { //male male
    public static void main(String[] args) {
        Songs00 songs00 = new Songs00();
        Songs10 songs10 = new Songs10();

        diskViewer disk = new diskViewer(songs00, songs10);
        disk.showMusic();
    }
}
