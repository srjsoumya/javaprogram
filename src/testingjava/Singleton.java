package testingjava;

class SingletonClass {
    public String s;
    private static SingletonClass instance = null;

    private SingletonClass() {
        s = "this is a singleton class";
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;

    }

}

public class Singleton {
    public static void main(String[] args) {
        SingletonClass o1 = SingletonClass.getInstance();
        SingletonClass o2 = SingletonClass.getInstance();
        SingletonClass o3 = SingletonClass.getInstance();

        System.out.println(o1.s);
        System.out.println(o1.s);
        System.out.println(o1.s);
    }
}
