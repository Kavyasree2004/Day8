class Student{
int rollno;
String name;
static String college="MTIE";
Student(int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStudent{
public static void main(String args[]){
Student s1=new Student(11,"Tom");
Student s2=new Student(22,"Jerry");
Student.college="A.M.REDDY";
s1.display();
s2.display();
}
}
