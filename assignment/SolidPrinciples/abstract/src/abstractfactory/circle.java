package abstractfactory;

public class circle implements shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle inside shape");
    }
}
