class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}
