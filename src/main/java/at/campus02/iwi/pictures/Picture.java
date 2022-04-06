package at.campus02.iwi.pictures;

public class Picture {
    int length;
    int width;

    public  int totalPixels (){

        return length*width;
    }

    public int totalSize ( int bytePerPixel){
          return   bytePerPixel*   totalPixels() ;
    }

    public void scale ( double factor){
        length *= factor;
        width *= factor;
    }




}
