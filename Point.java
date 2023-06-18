
public class Point {
    public int x;
    public int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

    public boolean equals(Point a){
        if (a == null) {
        return false; // Early return if 'a' is null
    }
    return this.x == a.x && this.y == a.y;
      }

    
}
