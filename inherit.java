package java_program;

class ParentClass
{
    public void add(int a)
    {
        System.out.println(a+a);
    }
}

class ChildClass extends ParentClass
{
    public void product(int a)
    {
        System.out.println(a*a);
    }
}

public class inherit {
    public static void main(String[] args) {
        
        ParentClass parent = new ParentClass();
        parent.add(6);

       
        ChildClass child = new ChildClass();
        
        child.product(6);
        child.add(6);
    } 
}
