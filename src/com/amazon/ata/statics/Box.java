package com.amazon.ata.statics;

public class Box {
    private double height;
    private double width;
    private double length;
    private static final double MAX_INCHES = 72;
    /**
     * Constructs a Box object if the dimensions are valid
     * @param length - length of box
     * @param width - width of box
     * @param height - height of box
     * @throws DimensionValueException if the provided dimensions exceed the max Box size
     */
    public Box(double length, double width, double height) throws DimensionValueException {
        this.length = length;
        this.width = width;
        this.height = height;
        if (!validateBoxDimensions(length, width, height)) {
            throw new DimensionValueException("One of the values exceeds 72 inches.");
        }
    }
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public static boolean validateBoxDimensions(double height, double width, double length) {
        if (height > MAX_INCHES || width > MAX_INCHES || length > MAX_INCHES) {
            return false;
        }
        return true;
    }

}
