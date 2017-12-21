/* net.macdidi5.kotlin.tutorial.ch15.View.java */

package net.macdidi5.kotlin.tutorial.ch15;

public class View {

    private OnKeyListener listener;

    // 按鍵監聽介面
    @FunctionalInterface
    public interface OnKeyListener {
        boolean onKey(View v, int keyCode, KeyEvent event);
    }

    // 設定按鍵監聽介面物件
    public void setOnKeyListener (View.OnKeyListener listener) {
        this.listener = listener;
    }

    public String toString() {
        return "View";
    }

    // 按下按鍵
    public void keyDown() {
        listener.onKey(this, 32, new KeyEvent(KeyEvent.Action.KEY_DOWN));
    }

    // 放開按鍵
    public void keyUp() {
        listener.onKey(this, 67, new KeyEvent(KeyEvent.Action.KEY_UP));
    }

}
