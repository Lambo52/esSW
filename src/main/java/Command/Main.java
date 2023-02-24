package Command;

public class Main {
    public static void main(String[] args) {
        textFile file = new textFile("file.txt", 1234);
        Command rename = new renameCommand(file,"ambrogio.xml");
        rename.execute();
        //così portiamo fuori l'operazione rename, la usiamo tutte le volte che ci serve, classe renameCommand fa
        // solo quello
        //file.setName("ambrogio.xml");
        System.out.println(file);
    }
}
