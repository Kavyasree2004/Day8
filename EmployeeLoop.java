import java.util.*;
class Employee{
private int id;
private String ename;
private String depart;
public void setId(int id){
this.id=id;
}
public void setName(String ename){
this.ename=ename;
}
public void setDepart(String depart){
this.depart=depart;
}
public int getId(){
return this.id;
}

public String getName(){
return this.ename;
}
public String getDepart(){
return this.depart;
}
}
class EmployeeLoop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Employee[] ob=new Employee[5];
for(int i=0;i<5;i++){
ob[i]=new Employee();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
ob[i].setDepart(sc.next());
}
System.out.println("\nDetails are: ");
for(int j=0;j<5;j++){
System.out.println("ID: "+ob[j].getId());
System.out.println("Name: "+ob[j].getName());
System.out.println("Department: "+ob[j].getDepart());
}
}
}