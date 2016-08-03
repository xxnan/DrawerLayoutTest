package JavaReflection;

/**
 * Created by xxnan on 2016/6/13.
 */
public class Main {
    private String name;
    int age;
    public boolean sex;
    public Main(int a,boolean s,String n)
    {
        age=a;
        sex=s;
        name=n;
    }
    public Main()
    {

    }

    /**
     *
     * @param bb
     * @return
     * {@hide}
     */
    public  int getAge(int bb)
    {
        int aa=age+bb;
        return aa;
    }
   /**
    * 
    * @return
    * {@hide}
    */
    public  boolean getSex()
    {
        return sex;
    }
}
