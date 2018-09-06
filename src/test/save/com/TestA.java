package test.save.com;

public class TestA {

    int c;
  /*  public static void main(String args[]) {*/

    /*    List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        System.out.println("-------Using Lambda Functions--------");
        
        //Using Lambda function to call system.out.println()
        myList.stream().map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        System.out.println("-------Using Method Reference--------");


         //Using Method reference to call system.out.println()
        myList.stream().map(String::toUpperCase).sorted()
                .forEach(System.out::println);

    }*/
        
        /*Map<String, String> map = new HashMap<>();
        map.put("1", "test1");
        map.put("2", "test2");
        map.put("3", "test3");
        map.put("4", "test4");
        map.put("5", "test5");
        map.put("6", "test6");
        
        for(Map.Entry<String, String> entry :map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            
        map.forEach((key,value)->{ 
            System.out.println(key);
            System.out.println(value);
            
            });
    }*/
       /* List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Stream<Integer> intStream = list.stream();
        Integer[] evenArr = intStream.filter(i -> i % 2 == 0).toArray(
                Integer[]::new);
        System.out.print(evenArr);
    */
        
     
   /*

*/
        
     // Create List of square of all distinct numbers 
       /* List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map( i -> i).distinct().collect(Collectors.toList()); 
        System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct); 

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics(); 
        System.out.println("Highest prime number in List : " + stats.getMax()); System.out.println("Lowest prime number in List : " + stats.getMin()); System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
        
        // map
        
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
*/
               

      //input number to check if its Armstrong number 
        /*System.out.println("Please enter a 3 digit number to find if its an Armstrong number:"); 
        int number = new Scanner(System.in).nextInt(); //printing result 
        if(isArmStrong(number)){ 
            System.out.println("Number : " + number + " is an Armstrong number"); 
            }else{
                System.out.println("Number : " + number + " is not an Armstrong number"); } }  * @return true if number is Armstrong number or return false  
    private static boolean isArmStrong(int number) {
        int result = 0; int orig = number; 
        while(number != 0){ 
            
            int remainder = number%10; 
            result = result + remainder*remainder*remainder; 
            number = number/10; 
            } //number is Armstrong return true 
        if(orig == result){ 
            return true; 
            } 
        return false;
        } 
*/
              
   /* int n=12345;
    int r=0;
    int a[]= new int [10];
    int i=0;*/
    
  /*  while(n!=0){
       r= n%10;
       a[i]=r; 
       n=n/10;
       System.out.println("number"+a[i]);
        i++;
    }*/
   /*int reverse = 0;
    while( n != 0 )
    {
        reverse = reverse * 10;
        reverse = reverse + n%10;
        n = n/10;
        
    }
    
    if()
    }*/
  /*  public int reverseNumber(int number){
        
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        } 
        return reverse;
    }*/
  /*   
    public static void main(String a[]){
        TestA nr = new TestA();
        System.out.println("Result: "+nr.reverseNumber(17868));
        System.out.println();
    }
*/
  /**/
  /*  void m(){  
       // throw new java.io.IOException("device error");//checked exception  
      }  
      void n(){  
        m();  
      }  
      void p(){  
       try{  
        n();  
       }catch(Exception e){System.out.println("exception handeled");}  
      }  */
  
    
      
    
    public static void main(String[] args) {
      //  String a="ram";
        /*String str= new String("ram");
        String str1="hari";
        String str2="abc";
        String str3= new String("hello");
        String str4=null;
        String str5=str2;
        String str6="hello";
        String test=null;
     //  System.out.println(a.equals(test));
       System.out.println(test==str4);
       // System.err.println(test.equals(a));
//        System.out.println("compare"+a==str);
//        System.out.println("compare1"+a.equals(str));
//        System.out.println("compare2"+str1==str);
//        System.out.println("compare3"+str1==str);
//        System.out.println("compare4"+str2==str);
//        System.out.println("compare5"+str3==str4);
//        System.out.println("compare6"+str4==str5);
//        System.out.println("compare7"+str6==str5);
//       // System.out.println("compare8"+str4.equals(str));
//        System.out.println("compare9"+str.equals(str4));
//        System.out.println("compare10"+str5==str2);
//        System.out.println("compare11"+str3.intern()==str);
        StringBuilder sb= new StringBuilder();
        byte a = 127; 
        byte b = 127;
       // b = a + b; // error : cannot convert from int to byte b += a; // ok

        b += a;
        
        List list= new ArrayList<>();
        list.add("abc");
        Integer i=128;
        Integer i1=128;
        Integer i2= new Integer(127);
        Integer i3= Integer.valueOf(128);
        Integer i4= Integer.valueOf(128);
        
        System.out.println(i2+" " +i3);
        System.out.println(i4==i3);
        System.out.println(i2.equals(i3));
        Map hash= new HashMap<>();
        hash.put(1, 1);*/
        
        String s="abc";
      //  String s1="a";
        String s2= s.concat("T");
        String s1="abcT";
        
        System.out.println(s1==s2);
        
    }
  
}

