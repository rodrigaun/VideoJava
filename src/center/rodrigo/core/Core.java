package center.rodrigo.core;

import java.awt.BorderLayout;
import java.awt.Component;
import java.net.URL;
import javax.media.Manager;
import javax.media.Player;
import javax.swing.JPanel;

public class Core extends JPanel {

    private Player mediaPlayer;
    private Component video;

    public Core(URL mediaURL) {

        try {
            setLayout(new BorderLayout());
            mediaPlayer = Manager.createRealizedPlayer(mediaURL);
            video = mediaPlayer.getVisualComponent();
            if (video != null)
                add(video, BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startVideo() {
        mediaPlayer.start();
    }

    public void stopVideo() {
        mediaPlayer.stop();
    }
}
