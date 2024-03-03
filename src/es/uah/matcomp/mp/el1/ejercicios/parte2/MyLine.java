package es.uah.matcomp.mp.e1.ejerciciosclases.src.es.uah.matcomp.mp.el1.ejercicios.parte2;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(int x1, int y1, int x2, int y2){
        begin = new MyPoint(x1,y1);
        end = new MyPoint(x2,y2);
    }
    public MyLine(MyPoint b, MyPoint e){
        begin = b;
        end = e;
    }
    public MyPoint getBegin(){return this.begin;}
    public MyPoint getEnd(){return this.end;}
    public void setEnd(MyPoint newEnd){end = newEnd;}
    public void setBegin(MyPoint newBegin){begin = newBegin;}
    public int getBeginX(){return begin.getX();}
    public int getBeginY(){return begin.getY();}
    public int getEndX(){return end.getX();}
    public int getEndY(){return end.getY();}
    public  void setBeginX(int newX){
        begin.setX(newX);
    }
    public  void setEndX(int newX){
        end.setX(newX);
    }
    public  void setBeginY(int newY){
        begin.setY(newY);
    }
    public  void setEndY(int newY){
        end.setY(newY);
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public int[] getEndXY(){
        return end.getXY();
    }
    public void setEndXY(int newX, int newY){
        end.setXY(newX,newY);
    }
    public void setBeginXY(int newX, int newY){
        begin.setXY(newX,newY);
    }
    public double getLength(){
        return begin.distance(end);
    }
    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(),end.getX()-begin.getX());
    }
    public String toString(){
        return "MyLine[begin = "+this.begin+", end = "+this.end+"]";
    }


}
