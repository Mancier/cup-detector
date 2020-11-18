/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author victor
 */

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.*;

public class ImageFilter extends FileFilter {
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = Resources.getExtension(f);
        if (extension != null) {
            if (extension.equals(Resources.gif) ||
                extension.equals(Resources.jpeg) ||
                extension.equals(Resources.jpg) ||
                extension.equals(Resources.png)) {
                    return true;
            } else {
                return false;
            }
        }

        return false;
    }

    //The description of this filter
    public String getDescription() {
        return "Apenas Images GIF,JPEG,PNG";
    }
}
