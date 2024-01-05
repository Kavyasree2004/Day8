// static method

class Student1{
int rollno;
String name;
static String college="MITS";
static void change(){
college="MTIET";
}
Student1(int r, String n){
rollno=r;name=n;
}
void display(){
System.out.println(rollno+" "+name+" "+college);
}
}
class TestStudent1{
public static void main(String args[]){
Student1 s1=new Student1(11,"Yash");
Student1 s2=new Student1(12,"Ranju");
//s1.display();
//s2.display();
Student1.change();
Student1 s3=new Student1(13,"Kavya");
s1.display();
s2.display();
s3.display();
}
}