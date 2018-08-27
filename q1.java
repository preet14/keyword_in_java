class Parent
{
  public void show()
  {
    System.out.println("In parent ");
  }
}
class Child extends Parent
{
  public void dis()
  {
    System.out.println("In Child ");
  }
}
class q1
{
  public static void main(String args[])
  {
    Child c = new Child();
    c.show();
  }
}