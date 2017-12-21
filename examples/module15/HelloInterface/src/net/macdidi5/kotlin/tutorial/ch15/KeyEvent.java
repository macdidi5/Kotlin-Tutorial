/* net.macdidi5.kotlin.tutorial.ch15.KeyEvent.java */

package net.macdidi5.kotlin.tutorial.ch15;

public class KeyEvent {

    // Java enum型態，按鍵的操作種類
    public enum Action {
        KEY_DOWN, KEY_UP
    }

    private Action action;

    public KeyEvent(Action action) {
        this.action = action;
    }

    public Action getAction() {
        return action;
    }

}
