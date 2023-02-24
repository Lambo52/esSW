package Iterator;

public class songInfo {
    String songName;
    int data;

    public songInfo(String songName, int data) {
        this.songName = songName;
        this.data = data;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
