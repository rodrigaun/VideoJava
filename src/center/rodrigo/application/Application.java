package center.rodrigo.application;

import java.net.URL;
import javax.swing.JFrame;
import center.rodrigo.core.Core;

public class Application {

    private URL url;
    private Core core;
    private JFrame frame;

    public Application(String video) {

        try {
            this.url = new URL(video);
            frame = new JFrame("Teste Video");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            core = new Core(url);
            frame.add(core);

            frame.setSize(640, 480);
            frame.setVisible(true);
            core.startVideo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}