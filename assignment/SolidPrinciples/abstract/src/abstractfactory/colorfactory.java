package abstractfactory;

public class colorfactory extends abstractfactory {
    @Override
    color getcolor(String colour) {
        if(colour==null)
        {
            return null;
        }
        if(colour.equalsIgnoreCase("RED"))
        {
            return new red();
        }
        else if(colour.equalsIgnoreCase("BLUE"))
        {
            return new blue();
        }
        else if(colour.equalsIgnoreCase("GREEN"))
        {
            return new green();
        }
        return null;

    }

    @Override
    public shape getshape(String shapetype) {
        return null;
    }
}
