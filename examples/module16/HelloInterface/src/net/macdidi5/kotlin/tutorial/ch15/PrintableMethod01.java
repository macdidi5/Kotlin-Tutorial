/* net.macdidi5.kotlin.tutorial.ch15.PrintableMethod01.java */

package net.macdidi5.kotlin.tutorial.ch15;

public class PrintableMethod01 {

    private Printable01 p;

    // 接收一個Printable01型態的參數
    public void set(Printable01 p) {
        this.p = p;
    }

    public void process() {
        p.print();
    }

}
