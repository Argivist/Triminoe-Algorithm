import java.util.ArrayList;
public class Triminoe{
    Environment checkEnvironment=new Environment(4);
    int triminoeNum=1;
    //Midpoint of giving range
   

    public PointArray[] TriminoeLabel(Point i, Point j,Environment e){
        //getting the mid cells
        PointArray[] arrays={
            new PointArray(i,new Point((i.x+j.x)/2, (i.y+j.y)/2),e),
            new PointArray(new Point(((i.x+j.x)/2)+1,i.y),new Point(j.x,(i.y+j.y)/2), e),
            new PointArray(new Point(i.x,((i.y+j.y)/2)+1),new Point((i.x+j.x)/2,j.y),e),
            new PointArray(new Point(((i.x+j.x)/2)+1,((i.y+j.y)/2)+1), j,e)
        };
        Point[] midCells={
            new Point((i.x+j.x)/2, (i.y+j.y)/2),
            new Point((i.x+j.x)/2, ((i.y+j.y)/2)+1),
            new Point(((i.x+j.x)/2)+1, (i.y+j.y)/2),
             new Point(((i.x+j.x)/2)+1, ((i.y+j.y)/2)+1)
            };
        
        //find missing cell[filled cell]
        Point missingCell=null;
        for(int a=0;a<4;a++){//repeats 4 times
            if(arrays[a].hasLabel()){
                missingCell=midCells[a];
            }
        }
        //if no missing cell found label
        for(int b=0; b<4;b++){
            if(!midCells[b].equals(missingCell)){
                e.setCell(midCells[b],triminoeNum+"");

            }
        }
        triminoeNum++;
        return arrays;
    }

    public void Triminoes(Environment e){
        ArrayList<PointArray> pointArrays = new ArrayList<>();
        pointArrays.add(new PointArray(new Point(0,0),new Point(e.getBoard().length-1,e.getBoard().length-1),e));
        while(pointArrays.size()>0){
            PointArray[] t = TriminoeLabel(pointArrays.get(0).upperPoint(),pointArrays.get(0).lowerPoint(),e);

            for(int i=0;i<4;i++){
            if(t[i].size()>1){
                pointArrays.add(t[i]);
            }
            }
            pointArrays.remove(0);
            

        }
    }
    //triminoe
        //get four midle cells
        //find missing cell[filled cell]
            //search from first cell to first middle, last upper cell to second cell,etc
        //if no missing cell found label
        //break array into 4 add array to array search

    public static void main(String[] args) {
        Triminoe t = new Triminoe();
        t.checkEnvironment.printEmptycell();
        t.checkEnvironment.printBoard();
        t.Triminoes(t.checkEnvironment);
        //print points
      
        t.checkEnvironment.printBoard();
        
    }

}