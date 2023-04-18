package com.zeeshan.resumemaker;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class Click{
    Click() {
        try {
            Thread.sleep(120);
            Robot r = new Robot();
            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image, "png", new File("Data\\file.view.temp"));
            System.out.println("Resume saved");

            System.out.println("Start cropping");

            File imageFile = new File("Data\\file.view.temp");
            BufferedImage bufferedImage = ImageIO.read(imageFile);
            BufferedImage croppedImage = bufferedImage.getSubimage(0, 0, 683, 720);
            ImageIO.write(croppedImage, "png", new File("Data\\file.view.temp"));

            System.out.println("Cropping complete");

        }
        catch (AWTException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
public class ScreenShot {
    public static void main(String[] args) {
        System.out.println("Screen Shot");
    }
}
