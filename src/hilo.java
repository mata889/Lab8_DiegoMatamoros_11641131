
import javax.swing.JProgressBar;


public class hilo implements Runnable{
    private JProgressBar hada1;
    private JProgressBar hada2;
    boolean vive, sigue, sigue2;

    public hilo(JProgressBar hada1, JProgressBar hada2) {
        this.hada1 = hada1;
        this.hada2 = hada2;
        vive = true;
        sigue = true;
        sigue2 = true;
    }

    public JProgressBar getHada1() {
        return hada1;
    }

    public void setHada1(JProgressBar hada1) {
        this.hada1 = hada1;
    }

    public JProgressBar getHada2() {
        return hada2;
    }

    public void setHada2(JProgressBar hada2) {
        this.hada2 = hada2;
    }

    public void run() {
        hada2.setString(Integer.toString(hada2.getValue()));
        hada1.setString(Integer.toString(hada1.getValue()));

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        while (vive) {
            if (sigue) {
                if (hada1.getValue() != 0) {
                    hada1.setValue(hada1.getValue() - 70);
                    hada1.setString(Integer.toString(hada1.getValue()));
                } else {
                    sigue2 = false;
                    vive = false;
                }

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }

            if (sigue2) {
                if (hada2.getValue() != 0) {
                    hada2.setValue(hada2.getValue() - 55);
                    hada2.setString(Integer.toString(hada2.getValue()));
                } else {
                    sigue = false;
                    vive = false;
                }

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
    }

}
