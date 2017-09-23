package ua.artcode.week6.day1.inner_nested;

import java.util.List;

public class Building {

    private int square;
    private List<Room> rooms;

    public Building() {
    }

    public Building(int square) {
        this.square = square;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }



    // nested class:
    public static class  Window {
        // Can use only static info about Building class.

        private int height;
        private int width;

        public Window(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }


    // inner class:
    private class Room {
        // Can use info about this Building class instance and
        // static info about Building class.

        private int square;

        private Room(int square) {
            this.square = square;
        }

        public Room build(int square) {
            if (Building.this.square < square) {
                return null;
            }
            return new Room(this.square = square);
        }

        public int getSquare() {
            return square;
        }

        public boolean setSquare(int square) {
            if (Building.this.square < square) {
                return false;
            }
            this.square = square;
            return true;
        }
    }

}
