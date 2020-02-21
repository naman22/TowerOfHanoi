package definition;

public class TowerOfHanoi {
    public static void showMove(char from, char to) {
        System.out.println("Move disk from peg " + from + " to peg " + to);
    }

    public static void showMoveVia(char from, char via, char to) {
        showMove(from, via);
        showMove(via, to);
    }

    public static String showMoves(int n, char from, char via, char to) {
        if (n == 1) {
            return ("Move disk from peg " + from + " to peg " + to);
        } else {
            return (showMoves(n - 1, from, via, to) + "\n" + "Move disk " + " from peg " + from + " to peg " + to + "\n" + showMoves(n - 1, via, to, from));
        }
    }

}
