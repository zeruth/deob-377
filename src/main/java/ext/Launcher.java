package ext;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Launcher implements AppletStub {
    static JFrame frame = new JFrame("RS2 377");
    static BorderLayout layout = new BorderLayout();
    static JPanel gamePanel = new JPanel(layout);
    static Dimension gameSize = new Dimension(779, 530);

    static URL baseURL;

    static Launcher INSTANCE = new Launcher();

    static {
        try {
            baseURL = new URL("http://127.0.0.1");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        frame.setSize(gameSize);
        gamePanel.setSize(gameSize);
        gamePanel.setBackground(Color.BLACK);
        Applet client = (Applet) ClassLoader.getSystemClassLoader().loadClass("Client").newInstance();
        client.setStub(INSTANCE);
        gamePanel.add(client, BorderLayout.CENTER);
        frame.add(gamePanel);
        frame.setVisible(true);
        client.init();
        client.start();
        frame.show();
    }

    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public URL getDocumentBase() {
        return baseURL;
    }

    @Override
    public URL getCodeBase() {
        return baseURL;
    }

    @Override
    public String getParameter(String name) {
        switch (name) {
            case "nodeid":
                return "10";
            case "portoff":
                return "0";
            case "lowmem":
            case "free":
                return "false";
            default:
                throw new RuntimeException("unknown paramater: " + name);
        }
    }

    @Override
    public AppletContext getAppletContext() {
        return null;
    }

    @Override
    public void appletResize(int width, int height) {
    }
}
