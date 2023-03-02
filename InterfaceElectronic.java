interface Electronic
{
    public abstract void turnon();
    public abstract void turnoff();
}

class TV implements Electronic
{
public void turnon()
{
	System.out.println("hello");
}
public void turnoff()
{
	System.out.println("kush");
}
}

class hulk
{
    public static void main(String arr[])
    {
        TV t=new TV();
		t.turnon();
		t.turnoff();
    }
}