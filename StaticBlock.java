/* static block :
it is used to initialize the static data member or variable
it is executed before the main method at the time of classloading*/


class StaticBlock{
static{
System.out.println("Static block is invoked");
}
public static void main(String args[]){
System.out.println("Hello main");
}
}