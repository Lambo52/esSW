package Facade;

public class Computer {

    CPU cpu;
    RAM ram;
    Disk disk;

    public Computer() {
        cpu = new CPU();
        ram = new RAM();
        disk = new Disk();
    }

    public void start() {
        cpu.stop();
        ram.load();
        disk.start();
        cpu.start();
    }
}
