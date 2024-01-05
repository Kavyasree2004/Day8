import java.util.*;
class Trainer{
private int tid;
public void setTid(int tid){
this.tid=tid;
}
public int getTid(){
return this.tid;
}
public Trainer(int tid){
this.tid=tid;
}
public Trainer(){
this.tid=0;
}
class Trainertest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Trainer[] ob=new Trainer[5];
for(int i=0;i<5;i++){
ob[i]=new Trainer();
System.out.println("Enter Teacher ID: ");
int tidin;
ob[i]=setTid(sc.nextInt());
}
for(int j=0;j<5;j++){
System.out.println("tid: "+ob1.getTid());
}
}
}