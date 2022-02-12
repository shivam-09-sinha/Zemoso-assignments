package abstractfactory;

public class square implements shape {

    @Override
    public void draw() {
        System.out.println("Drawing sqaure inside shape");
    }
}
