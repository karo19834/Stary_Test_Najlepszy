package at.campus02.iwi.pictures;

public class PictureApp {
    public static void main(String[] args) {
        Picture foto = new Picture();
        foto.width=10;
        foto.length =8;


        System.out.println(foto.totalPixels());
        System.out.println(foto.totalSize(3));
        foto.scale(0.4);
        System.out.println(foto.width+" "+ foto.length);



    }
}
