package gcj2016.qualification;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by anton on 16/1/17.
 */
public class Teat {

    static class Event implements Runnable, Comparable {
        double time;
        Runnable runnable;

        Event(double time, Runnable aRunnable) {
            this.time = time;
            runnable = aRunnable;
        }

        public boolean lessThan(Comparable y) {
            Event e = (Event) y; // Will throw an exception if y is not an Event
            return this.time <= e.time;
        }

        @Override
        public void run() {
            runnable.run();

        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

    public static void main(String ... args) {
        Integer.toString(123);
        JFrame frame = new JFrame("Test");
        frame.setSize(300, 300);
        JLabel label = new JLabel("This is text!!!");
        frame.add(label);
        frame.setVisible(true);

        final int labelWidth = 300;
        final AtomicInteger labelPadding = new AtomicInteger();
        Timer timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setBorder(new EmptyBorder(0, labelPadding.getAndIncrement() % labelWidth, 0, 0));
            }
        });
        timer.start();


    }
}
