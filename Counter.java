/*use of instance variable & static variable :
 if we use static int count - the output will be 1 2 3 (i.e. incremented)
 if we don't use static - the output will be 1 1 1(i.e. start from the beginning)
*/

class Counter{
static int count=0;
Counter(){
count++;
System.out.println(count);
}
public static void main(String args[]){
Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();
}
}