package abstrac.classss.swetha;

class A{  
A(){  
this(5);  
System.out.println("hello a");  
}  
A(int x){  
this(10,20);

System.out.println(x);  
} 
A(int x, int y){  
this(10,20,30);

System.out.println("vlaue of X: "+x +  "  value of Y: "+y);  
}   

A(int x, int y,int z){  
System.out.println("vlaue of X: "+x +  "  value of Y: "+y + " value of Z :"+z);  
}  
}  
class TestThis6{  
public static void main(String args[]){  
A a=new A();  
}}  
