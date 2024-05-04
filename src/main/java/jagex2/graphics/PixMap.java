package jagex2.graphics;

import java.awt.*;
import java.awt.image.*;

public final class PixMap implements ImageProducer, ImageObserver {

    public int[] pixels;
    private ImageConsumer imageConsumer;
    private final int width;
    private final int height;
    private final ColorModel colorModel;

    private final Image image;

    public PixMap(Component component, int width, int height) {
        this.width = width;
        this.height = height;
        this.pixels = new int[width * height];
        this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
        this.image = component.createImage(this);
        this.setPixels();
        component.prepareImage(this.image, this);
        this.setPixels();
        component.prepareImage(this.image, this);
        this.setPixels();
        component.prepareImage(this.image, this);
        this.method130();
    }

    public void method130() {
        Draw2D.bind(this.width, this.height, this.pixels);
    }

    public void method131(int arg0, int arg1, Graphics g) {
        this.setPixels();
        g.drawImage(this.image, arg1, arg0, this);
    }

    @Override
    public synchronized void addConsumer(ImageConsumer consumer) {
        this.imageConsumer = consumer;
        consumer.setDimensions(this.width, this.height);
        consumer.setProperties(null);
        consumer.setColorModel(this.colorModel);
        consumer.setHints(14);
    }

    @Override
    public synchronized boolean isConsumer(ImageConsumer consumer) {
        return this.imageConsumer == consumer;
    }

    @Override
    public synchronized void removeConsumer(ImageConsumer consumer) {
        if (this.imageConsumer == consumer) {
            this.imageConsumer = null;
        }
    }

    @Override
    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @Override
    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
        System.out.println("TDLR");
    }

    private synchronized void setPixels() {
        if (this.imageConsumer != null) {
            this.imageConsumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
            this.imageConsumer.imageComplete(2);
        }
    }

    @Override
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
