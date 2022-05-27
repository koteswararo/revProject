class TestThread1{
static{
System.out.println("static"+Thread.currentThread().getName());
}
public static void main(String[] args){

System.out.println(Thread.currentThread().getName());

System.out.println(Thread.currentThread().getPriority());
}
}