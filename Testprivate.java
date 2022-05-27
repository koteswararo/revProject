class Testprivate{
private Testprivate(){}
private void add(int a){

a++;
System.out.println(a);
}
}
class UserTestprivate extends Testprivate{
Testprivate t=new Testprivate();
}
