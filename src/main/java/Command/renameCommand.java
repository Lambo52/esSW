package Command;

public class renameCommand implements Command{

    textFile textfile;
    String name;

    public renameCommand(textFile textfile, String name) {
        this.textfile = textfile;
        this.name = name;
    }

    @Override
    public void execute() {
        textfile.setName(name);
    }
}
