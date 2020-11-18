/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author victor
 */
public class Image extends File 
{

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    public Image(File imageFile, String path) throws IOException {
        super(path);
        setImage(imageFile);
        setBufferedImage(ImageIO.read(image));
        setAbsolutePath(imageFile.getAbsolutePath());
        setFilename(imageFile.getName());
        setExtension(getName().split("\\.")[1]);
        setWidth(this.getBufferedImage().getWidth());
        setHeight(this.getBufferedImage().getHeight());

    }
    
    private File image = null;
    private BufferedImage bufferedImage = null;
    private String absolutePath = "";
    private String filename = "";
    private String extension = "";
    private int width = 0;
    private int height = 0;

    
    /**
     * @return the image
     */
    public File getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(File image) {
        this.image = image;
    }
    
    /**
     * @return the bufferedImage
     */
    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    /**
     * @param bufferedImage the bufferedImage to set
     */
    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }
    
   /**
     * @return the path
     */
    public String getAbsolutePath() {
        return absolutePath;
    }

    /**
     * @param path the path to set
     */
    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    /**
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param filename the filename to set
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }
}
