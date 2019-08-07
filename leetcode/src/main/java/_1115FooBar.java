public class _1115FooBar {

    public static void main(String ... args) {
        _1115FooBar fooBar = new _1115FooBar(5);
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fooBar.foo(new Runnable() {
                        @Override
                        public void run() {
                            System.out.print("foo");
                        }
                    });
                }catch (InterruptedException e) {}
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fooBar.bar(new Runnable() {
                        @Override
                        public void run() {
                            System.out.print("bar");
                        }
                    });
                }catch (InterruptedException e) {}
            }
        });
        b.start();
        a.start();
    }

    private int n;
    private boolean foo = false;

    public _1115FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            foo = true;
            notify();
            wait();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while (!foo) {
                wait();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            foo = false;
            notify();
        }
    }

}
