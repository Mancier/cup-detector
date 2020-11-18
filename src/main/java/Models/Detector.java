/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

/**
 *
 * @author victor
 */
public class Detector {
    public float countPixels(String path){
        ImagePlus image = IJ.openImage(path);
        ImageProcessor ip = image.getProcessor();
        
        /**
         * 1 - binariza a imagem
         * 2 - razao de pixels brancos/pixels pretos
         * 3 - caso preto > branco :· copo cheiọ
         *          branco > prete :· copo vazio
         *          branco =~ preto :· na metade
         */
        return 0;
    }
}
