package edu.panchoshna;/*
    @author User
    @project lab2
    @class Parallelepiped
    @version 1.0.0
    @since 09.03.2025 - 14.45 
*/

import java.util.Objects;

public class Parallelepiped {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelepiped that = (Parallelepiped) o;
        return Double.compare(getLength(), that.getLength()) == 0 && Double.compare(getWidth(), that.getWidth()) == 0 && Double.compare(getHeight(), that.getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth(), getHeight());
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public boolean isCube() {
        return length == width && width == height;
    }

    public double getDiagonalLength() {
        return Math.sqrt(length * length + width * width + height * height);
    }

    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Коефіцієнт масштабування має бути додатнім");
        }
        length *= factor;
        width *= factor;
        height *= factor;
    }

    public double getLateralSurfaceArea() {
        return 2 * (length * height + width * height);
    }

    public double getBasePerimeter() {
        return 2 * (length + width);
    }
}
