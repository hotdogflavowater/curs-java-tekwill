package homeWork5.pc;

public class Cpu {
    static class Processor extends Cpu {};
    static class RAM extends Cpu {};

    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        Cpu ram = new RAM();
        Cpu processor = new Processor();
        MotherBoard motherBoard = new MotherBoard();
        MotherBoard usb = new MotherBoard.USB();
    }
}

