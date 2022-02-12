package abstractfactory;

public class rectangle implements shape{
    @Override
    public void draw() {
        System.out.println("Drawing rectangle inside shape");
    }
}
