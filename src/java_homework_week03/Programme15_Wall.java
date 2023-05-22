package java_homework_week03;

public class Programme15_Wall {
    double width, height;

    public Programme15_Wall() {

    }

    public Programme15_Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        }else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        return width;
    }

    public double setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
        return height;
    }

    public double getArea() {
        return (getHeight() * getWidth());
    }

    public static void main(String[] args) {
        Programme15_Wall wall = new Programme15_Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }


}