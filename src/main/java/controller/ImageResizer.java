package controller;

import org.imgscalr.Scalr;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageResizer {

    public static void main(String[] args) throws IOException {
        // Get the source directory
        File sourceDir = new File(System.getProperty("user.home")+"\\Pictures\\"+args[0]);

        // Get the destination directory
        File destDir = new File(System.getProperty("user.home")+"\\Pictures\\"+args[1]);

        // Create a list of all JPEG files in the source directory
        File[] files = sourceDir.listFiles((dir, name) -> name.endsWith(".jpg"));

        // Resize all JPEG files
        for (File file : files) {
            // Read the image
            BufferedImage image = ImageIO.read(file);

            // Resize the image
            int newWidth = Integer.parseInt(args[2]);
            int newHeight = Integer.parseInt(args[3]);
            BufferedImage resizedImage = Scalr.resize(image, Scalr.Method.ULTRA_QUALITY, Scalr.Mode.FIT_EXACT, newWidth, newHeight, Scalr.OP_ANTIALIAS);

            // Write the resized image to the destination directory
            ImageIO.write(resizedImage, "jpg", new File(destDir, file.getName()));
        }
    }
}

