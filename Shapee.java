abstract class Shapeee
{
int length,breadth,radius,side;
scanner input=new Scanner(System.in);
}
class circle extends shape
{
void printArea()
{
System.out.println("\nfinding the area of circle");
System.out print("enter radius:");
radius=input.nextint();
System.out.println("the area of circle:"+3.14f*radius*radius);
}
}
class rectangle extends shape
{
void printArea()
{
System.out.println("finding the area of rectangle");
System.out.println("enter length and breadth:");
length=input.nextint();
breadth=input.nextint();
System.out.println("The area of rectangle is:"+length+breadth);
}
}
