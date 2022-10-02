import javax.swing.*;

public class SomeClass {

    String replyTo;

    Callback callback;

    void registerCallback(Callback callback) {
        this.callback = callback;
    }

    void doSomething() {
        int reply = JOptionPane.showConfirmDialog(null, "Вы программист?", "Опрос", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            replyTo = "YES";
        } else if (reply == JOptionPane.NO_OPTION) {
            replyTo = "NO";
        }
        callback.callingBack(replyTo);
    }
}
