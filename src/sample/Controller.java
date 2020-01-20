package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label labelStroka;
    public TextField doSkolki_ID;
    public Label labelStroka2;
    public Label labelStroka3;
    public Label labelStroka4;

    public void Knopka(ActionEvent actionEvent) throws InterruptedException {
        String doSkol = doSkolki_ID.getText();
        long o = Long.parseLong(doSkol);
        long i =0;
        long t = System.currentTimeMillis();
        for (; i < o; i++) {
            System.currentTimeMillis();
            }
            labelStroka.setText("Выполнено за: " + ((double) System.currentTimeMillis() - t) / 1000 + " секунд");
            labelStroka2.setText("Или за: " + ((double) System.currentTimeMillis() - t) / 1000 / 60 + " минут");
            if (o==1000000) {
                labelStroka3.setText("Сосчитание от 0 до 1 миллиона");
            }
            else if (o==10000000) {
            labelStroka3.setText("Сосчитание от 0 до 10 миллиона");
            }
            else if (o==100000000) {
            labelStroka3.setText("Сосчитание от 0 до 100 миллиона");
            }
            else if (o==1000000000) {
            labelStroka3.setText("Сосчитание от 0 до 1 миллиарда");
            }
            else if (o==10000000000L) {
            labelStroka3.setText("Сосчитание от 0 до 10 миллиарда");
            }
            else if (o==100000000000L) {
            labelStroka3.setText("Сосчитание от 0 до 100 миллиарда");
            }
            else {
                labelStroka3.setText("Сосчитание от 0 до: " + o);
            }
            labelStroka4.setText("Кол-во символов: " + Long.toString(o).length());
            }

    public void Knopka_ochistit(ActionEvent actionEvent) {
        labelStroka.setText(null);
        labelStroka2.setText(null);
        labelStroka3.setText(null);
        labelStroka4.setText(null);
        doSkolki_ID.setText(null);
    }

    public void action_1mln(ActionEvent actionEvent) {
        doSkolki_ID.setText("1000000");
    }

    public void action_10mln(ActionEvent actionEvent) {
        doSkolki_ID.setText("10000000");
    }

    public void action_100mln(ActionEvent actionEvent) {
        doSkolki_ID.setText("100000000");
    }

    public void action_1mlrd(ActionEvent actionEvent) {
        doSkolki_ID.setText("1000000000");
    }

    public void action_10mlrd(ActionEvent actionEvent) {
        doSkolki_ID.setText("10000000000");
    }

    public void action_100mlrd(ActionEvent actionEvent) {
        doSkolki_ID.setText("100000000000");
    }
}