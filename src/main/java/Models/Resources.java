/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import ij.IJ;
import Models.Image;
import ij.ImagePlus;
import ij.plugin.ContrastEnhancer;
import ij.plugin.filter.GaussianBlur;
import ij.process.ByteProcessor;
import ij.process.ImageConverter;
import ij.process.ImageProcessor;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public abstract class Resources {
    public final static String jpeg = "jpeg";
    public final static String jpg = "jpg";
    public final static String gif = "gif";
    public final static String tiff = "tiff";
    public final static String tif = "tif";
    public final static String png = "png";

    /*
     * Get the extension of a file.
     */
    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }
    
    public static int ConfirmationDialog(String message, String title){
        return JOptionPane.showConfirmDialog(null, message, title, JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
    }

    /** Returns an ImageIcon, or null if the path was invalid.
     * @param path
     * @return ImageIcon 
     */
    public static ImageIcon createImageIcon(String path) {
        //String path = image.getAbsolutePath();
        if (path != null) {
            return new ImageIcon(path);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }    
    
    /**
     * Remove the noise in image and return
     * @param ip
     * @return ImageProcessor
     */
    public static ImageProcessor removeImageNoise(ImageProcessor ip) {
        ip.medianFilter();
        ip.autoThreshold();
        return ip;
    }
    /**
     * Convert colorfull image into a binary image
     * @param image
     * @return ImageIcon
     */
    public static ImagePlus convertInABinaryImage(String path){
        ImagePlus imagePlus = IJ.openImage(path);
        
        ContrastEnhancer ce = new ContrastEnhancer();
        ce.equalize(imagePlus);
        
        new ImageConverter(imagePlus).convertToGray8();
        imagePlus.updateAndDraw();
        
        ImageProcessor ip = imagePlus.getProcessor();
        ip.medianFilter();
        ip.autoThreshold();
        
        return imagePlus;
    }
    
    
}
