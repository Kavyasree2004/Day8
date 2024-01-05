class Student{
private int id;
private String name;
public void setId(int id){
this.id=id;
}
public void setName(String name){
this.name=name;
}
public int getId(){
return this.id;
}
public String getName(){
return this.name;
}
}
class Private{
public static void main(String args[]){
Student ob=new Student();
ob.setId(11);
ob.setName("Priyanka");
System.out.println("Id: "+ob.getId());
System.out.println("Name: "+ob.getName());
Student ob1=new Student();
ob1.setId(22);
ob1.setName("Jay");
System.out.println("Id: "+ob1.getId());
System.out.println("Name: "+ob1.getName());
Student ob2=new Student();
ob2.setId(33);
ob2.setName("Ammu");
System.out.println("Id: "+ob2.getId());
System.out.println("Name: "+ob2.getName());
Student ob3=new Student();
ob3.setId(44);
ob3.setName("Arthi");
System.out.println("Id: "+ob3.getId());
System.out.println("Name: "+ob3.getName());
Student ob4=new Student();
ob4.setId(55);
ob4.setName("Nithya");
System.out.println("Id: "+ob4.getId());
System.out.println("Name: "+ob4.getName());
}
}
