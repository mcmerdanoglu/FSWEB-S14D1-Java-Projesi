package ClassFolder;

public class Rectangle {
    private double width;

    private double length;

    public Rectangle(double width, double length) {
        if(length<0) this.length=0;
        else this.length = length;
        if(width<0) this.width=0;
        else this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Length ");
        sb.append(getLength()).append(" ");
        sb.append("Width ").append(getWidth());
        return String.valueOf(sb);
        //return "Length " + " " + getLength() + " " + "Width " + getWidth() ;
    }
}
