public class XboxController implements GameController{
    public void pressButton(String button) {
        System.out.println("XBOX controller: " + button + " button pressed.");
    }
}
