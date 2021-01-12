package singleton;

//Prevent singleton from getting created again when we deserialize

//Use read resolve field

import java.io.Serializable;

public class Student implements Serializable {

    private static final Student instance = new Student();

    public static Student getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
