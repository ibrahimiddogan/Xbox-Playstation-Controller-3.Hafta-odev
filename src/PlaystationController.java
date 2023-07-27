public class PlaystationController implements GameController{
    public void pressButton(String button) {
        System.out.println("Playstation controller: " + button + " button pressed.");
    }
}
