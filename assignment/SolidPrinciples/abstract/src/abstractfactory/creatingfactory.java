package abstractfactory;

public class creatingfactory {

    public static void main(String[] args)
    {
        abstractfactory shapefact=factoryproducer.getfactory("SHAPE");
        shape shape1= shapefact.getshape("CIRCLE");
        shape1.draw();

        abstractfactory colorfact=factoryproducer.getfactory("COLOR");

        color color1= colorfact.getcolor("RED");
        color1.fill();
    }
}
