public class Main {
    public static void main(String[] args) {

        // İşlem karmaşıklığından kurtulmak için basit birşekilde tüm methot ve sınıflarımı main sınıfında topladım tüm işlemler burada gerçekleşecek
        GameController xboxController = new XboxController();
        GameController playstationController = new PlaystationController();

        Xbox xbox = new Xbox();
        Playstation playstation = new Playstation();
        Computer computer = new Computer();

        xbox.open();
        xbox.addController(xboxController);
        xbox.playGame();
        xbox.shutdown();

        playstation.open();
        playstation.addController(playstationController);
        playstation.playGame();
        playstation.shutdown();

        computer.addController(xboxController); // Xbox kontrolcüsünü bilgisayara bağla
        computer.playGame();
    }
}