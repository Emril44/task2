public class Data {
    private int state=1;

    public int getState() { return state; }

    synchronized void Tic() throws InterruptedException {
        while(state != 1) {
            wait();
        }
        System.out.print("Tic-");
        state=2;
        notifyAll();
    }
    synchronized void Tac() throws InterruptedException {
        while(state != 2) {
            wait();
        }
        System.out.print("Tac-");
        state=3;
        notifyAll();
    }
    synchronized void Toe() throws InterruptedException {
        while(state != 3) {
            wait();
        }
        System.out.println("Toe");
        state=1;
        notifyAll();
    }
}
