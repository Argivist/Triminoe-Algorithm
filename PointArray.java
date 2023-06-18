public class PointArray {
    public Point UpperLeft;
    public Point LowerRight;
    public Environment e;
    public PointArray(Point _upperLeft, Point _lowerRight,Environment e) {
        this.UpperLeft = _upperLeft;
        this.LowerRight = _lowerRight;
        this.e=e;
    }

    public boolean hasLabel(){
        boolean boolState=false;
        for(int i=UpperLeft.x;i<LowerRight.x+1;i++){
            for(int j=UpperLeft.y;j<LowerRight.y+1;j++){
                if(e.getBoard()[i][j]!=null){
                    boolState=boolState || true;
                }
            }
        }
        return boolState;
    }

    public Point upperPoint(){
        return new Point(UpperLeft.x,UpperLeft.y);
    }

    public Point lowerPoint(){
        return new Point(LowerRight.x,LowerRight.y);
    }

    public int size(){
        return (LowerRight.x-UpperLeft.x+1)*(LowerRight.y-UpperLeft.y+1);
    }
    public String showArray(Environment e){
        String s="";
        for(int i=UpperLeft.x;i<LowerRight.x+1;i++){
            for(int j=UpperLeft.y;j<LowerRight.y+1;j++){
                s+=e.getBoard()[i][j];
            }
            s+="\n";
        }
        return s;
    }
}
