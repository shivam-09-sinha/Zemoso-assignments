package abstractfactory;

public class factoryproducer {
    public static abstractfactory getfactory(String choice)
    {
        if(choice.equalsIgnoreCase("SHAPE"))
        {
            return new shapefactory();
        }
        else if(choice.equalsIgnoreCase("COLOR"))
        {
            return new colorfactory();
        }
        return null;
    }

}
