import java.util.*;
class Trainer{
private int tid;
private String tname;
private String tcourse;
private double tfee;
public void setTid(int tid){
this.tid=tid;
}
public void setTname(String tname){
this.tname=tname;
}
public void setTcourse(String tcourse){
this.tcourse=tcourse;
}
public void setTfee(double tfee){
this.tfee=tfee;
}
public int getTid(){
return this.tid;
}
public String getTname(){
return this.tname;
}
public String getTcourse(){
return this.tcourse;
}
public double getTfee(){
return this.tfee;
}
public Trainer(int tid,String tname,String tcourse,double tfee){
this.tid=tid;
this.tname=tname;
this.tcourse=tcourse;
this.tfee=tfee;
}
public Trainer(){
this.tid=0;
this.tname=null;
this.tcourse=null;
this.tfee=0;
}
}
class TrainerArray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Trainer[] ob=new Trainer[3];
for(int i=0;i<3;i++){
ob[i]=new Trainer();
System.out.println("enter id");
ob[i].setTid(sc.nextInt());
System.out.println("enter name");
ob[i].setTname(sc.next());
System.out.println("enter course");
ob[i].setTcourse(sc.next());
System.out.println("enter fee");
ob[i].setTfee(sc.nextDouble());
}
for(int j=0;j<3;j++){
System.out.println("Id: "+ob[j].getTid());
System.out.println("Name: "+ob[j].getTname());
System.out.println("Course: "+ob[j].getTcourse());
System.out.println("Fee: "+ob[j].getTfee());
}
}
}