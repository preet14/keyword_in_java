class Parent
{
  Parent()
  {
    System.out.println("Default constructor");
  }
  Parent(int i)
  {
   this();
  }
}
class q2
{
  public static void main(String args[])
  {
    Parent p = new Parent(10);
  } 
}