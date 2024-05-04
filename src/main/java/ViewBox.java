import java.awt.*;

public final class ViewBox extends Frame {

    private final GameShell shell;

	@SuppressWarnings("deprecation")
    public ViewBox(GameShell shell, int width, int height) {
        this.shell = shell;
        this.setTitle("Jagex");
        this.setResizable(false);
        this.show();
        this.toFront();
        this.resize(width + 8, height + 28);
    }

    @Override
    public Graphics getGraphics() {
        Graphics graphics = super.getGraphics();
        graphics.translate(4, 24);
        return graphics;
    }

    @Override
    public void update(Graphics arg0) {
        this.shell.update(arg0);
    }

    @Override
    public void paint(Graphics arg0) {
        this.shell.paint(arg0);
    }
}
