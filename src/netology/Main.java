package netology;

public class Main {

    public static void main(String[] args) {
	OnTaskDoneListener listener = System.out::println;
    OnTaskErrorListener errorListener = System.out::println;
    Woker woker = new Woker(listener, errorListener);
    woker.srart();
    }
}
