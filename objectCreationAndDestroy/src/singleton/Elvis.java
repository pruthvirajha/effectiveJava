package singleton;

/*Approach 1:

 Creating static public field

Advantages are
Simple to use.
Explicit that object is singleTon*/

public class Elvis {
    private Elvis(){}

    public static final Elvis INSTANCE = new Elvis();

}
