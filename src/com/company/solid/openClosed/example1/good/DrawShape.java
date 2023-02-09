package com.company.solid.openClosed.example1.good;

import java.util.List;

public class DrawShape {
    public void startDrawing(List<Shape> shapes) {

        for (Shape shape : shapes) {
            shape.draw();
        }
//I created Triangle if I send triangle this little // I didnt modify

    }
}
