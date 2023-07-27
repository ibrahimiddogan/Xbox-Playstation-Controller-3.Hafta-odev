public class Computer {
    private GameController controller;
// Bilgisayar sınıfımızı oluşturduktan sonra Controller hakkında bize konsol da çıktı ve exception verecektir
    public void addController(GameController controller) {
        this.controller = controller;
        System.out.println("Konsol kontrolu eklendi bilgisayara.");
    }

    public void playGame() {
        if (controller == null) {
            throw new RuntimeException("Hiçbir konsol kontorlcusu bağlanmadı bilgisayara");
        }
        System.out.println("Oyun başladı bilgisayarda.");
    }
}
