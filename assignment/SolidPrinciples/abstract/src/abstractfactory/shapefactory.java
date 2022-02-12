package abstractfactory;

public class shapefactory extends abstractfactory {


    public shape getshape(String shapetype) {
        if(shapetype==null)
        {
            return null;
        }
        if(shapetype.equalsIgnoreCase("CIRCLE"))
        {
            return new circle();
        }
        else if(shapetype.equalsIgnoreCase("RECTANGLE"))
        {
            return new rectangle();
        }
        else if(shapetype.equalsIgnoreCase("SQUARE"))
        {
            return new square();
        }
        return null;


    }


    color getcolor(String colour) {
        return null;
    }
}
