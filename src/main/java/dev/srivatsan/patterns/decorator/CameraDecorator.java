package dev.srivatsan.patterns.decorator;

import java.awt.*;
import java.util.function.Function;

/**
 * Decorator using functional interface
 */

class Camera {
    Function<Color, Color> colorFunction;

    public Camera() {
        colorFunction = Function.identity();
    }

    public final void addFilters(Function<Color, Color>... filters) {
        for (var filter : filters) {
            colorFunction = colorFunction.andThen(filter);
        }
    }

    public Color snap(Color input) {
        return colorFunction.apply(input);
    }

}


public class CameraDecorator {
    public static void main(String[] args) {
        Color color = new Color(124, 124, 124);
        Camera camera = new Camera();

        camera.addFilters(Color::brighter, Color::darker);
        System.out.println(camera.snap(color));

    }

}
