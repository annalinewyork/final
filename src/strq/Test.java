package strq;

public class Test {

    public static void main(String[] args) {
        final StringQueue queue = new StringQueue() {
            @Override
            public int length() {

                return 0;
            }

            @Override
            public void enqueue(String string) {

            }

            @Override
            public String dequeue(int length) {
                return null;
            }

        };  // FIXME: Use an instance of your SimpleStringQueue.

        queue.enqueue("Hello, world!");
        queue.enqueue("  ");
        queue.enqueue("This is a test.");
        if (queue.length() != 30) throw new AssertionError();
        String s = queue.dequeue(10);
        if (queue.length() != 20) throw new AssertionError();
        if (!s.equals("Hello, wor")) throw new AssertionError();
        s = queue.dequeue(10);
        if (queue.length() != 10) throw new AssertionError();
        if (!s.equals("ld!  This ")) throw new AssertionError();
        queue.enqueue("  All done.");
        if (queue.length() != 21) throw new AssertionError();
        s = queue.dequeue(21);
        if (queue.length() != 0) throw new AssertionError();
        if (!s.equals("is a test.  All done.")) throw new AssertionError();
    }

}
