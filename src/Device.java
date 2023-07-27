// Abstract sınıfımızı oluşturduk
abstract class Device {
    private GameController controller;
    private boolean isOpen;
// Fırlatmasını istediğimiz hataları döngüler ile yazdık
    public void open() {
        if (isOpen) {
            throw new RuntimeException(this.getClass().getSimpleName() + " is already open.");
        }
        isOpen = true;
        System.out.println(this.getClass().getSimpleName() + " is now open.");
    }

    public void shutdown() {
        if (!isOpen) {
            throw new RuntimeException(this.getClass().getSimpleName() + " is already closed.");
        }
        isOpen = false;
        System.out.println(this.getClass().getSimpleName() + " is now closed.");
    }

    public void addController(GameController controller) {
        this.controller = controller;
        System.out.println("Controller added to " + this.getClass().getSimpleName() + ".");
    }

    public void playGame() {
        if (!isOpen) {
            throw new RuntimeException(this.getClass().getSimpleName() + " is closed. Cannot play the game.");
        }
        System.out.println("Game started on " + this.getClass().getSimpleName() + ".");
    }
}
