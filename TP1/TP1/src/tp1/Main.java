package tp1;

import tests.Tester;

import java.awt.*;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenue au premier labo de INF2010!");
        LetterPlacer letterPlacer = new LetterPlacer();
        letterPlacer.placeNext('A');
        letterPlacer.placeNext('a');
        letterPlacer.placeNextln('B');
        letterPlacer.placeNext('e');
        letterPlacer.placeNext('C');
        letterPlacer.placeNext('n');
        letterPlacer.placeNext('r');
        letterPlacer.placeNextln('V');
        letterPlacer.placeNext('i');
        letterPlacer.placeNext('e');
        File imgFile = letterPlacer.saveImage("image", false);
        Desktop dt = Desktop.getDesktop();
        dt.open(imgFile);
    }
}