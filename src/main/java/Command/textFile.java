package Command;

public class textFile {
    String name;
    int size;

    public textFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "textFile{" + "name='" + name + '\'' + ", size=" + size + '}';
    }
}
