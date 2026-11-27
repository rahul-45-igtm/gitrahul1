class Demo{
   int a=10;
   double b=40.90;
  public void display(){
    System.out.println(a);
    System.out.println(b);
   }
 public static void main(String[]args){
     Demo d=new Demo();
     System.out.println(d.a);
    System.out.println(d.b);
     d.display();
  }
}