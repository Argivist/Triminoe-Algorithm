import java.lang.Math;
public class Environment{
    //instance variables
    private String[][] checkBoard;
    public int n;
    public Point EmptyCell;

    //constructor
    public Environment(int size){
        checkBoard = new String[size][size];
        n=(int) (Math.log(size)/Math.log(2));
        EmptyCell = new Point((int)(Math.random()*size),(int)(Math.random()*size));
        checkBoard[EmptyCell.x][EmptyCell.y]="0";
    }

    public void printBoard(){
        for(int i=0;i<checkBoard.length;i++){
            for(int j=0;j<checkBoard.length;j++){
                System.out.print(checkBoard[i][j]+"\t ");
            }
            System.out.println();
        }
    }
    public String[][] getBoard(){
        return checkBoard;
    }
    public void setCell(Point p, String s){
        checkBoard[p.y][p.x]=s;
    }
    public String toString(){
        String ReturnEnv="";
        for(int i=0;i<checkBoard.length;i++){
            for(int j=0;j<checkBoard.length;j++){
                ReturnEnv+= checkBoard[i][j];
            }
            ReturnEnv+="\n";
        }
        return ReturnEnv;
    }
    public void printEmptycell(){
        System.out.println(EmptyCell);
    }
    public static void main(String[] args) {
        Environment e = new Environment(4);
        e.printBoard();
    }


}