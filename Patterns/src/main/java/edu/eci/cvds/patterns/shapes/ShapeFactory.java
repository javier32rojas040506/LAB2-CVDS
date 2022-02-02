package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.Shape;
import edu.eci.cvds.patterns.shapes.RegularShapeType;
import edu.eci.cvds.patterns.shapes.concrete.*;

//Clase fabrica para figuras
public class ShapeFactory {
        public static Shape create(RegularShapeType type){
            Shape finalShape = null;
            switch (type) {
                case Triangle:
                    finalShape = new Triangle();
                    break;
                case Quadrilateral:
                    finalShape = new Quadrilateral();
                    break;
                case Pentagon:
                    finalShape = new Pentagon();
                    break;
                case Hexagon:
                    finalShape = new Hexagon();
                    break;
            }
            return finalShape;
        }
}