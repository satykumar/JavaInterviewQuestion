package ocuurance.word;

public class RevereseWordWithSpecficLength {
public static void main(String[] args) {
    String s="ABCDEFGHI";
    char ch[]=s.toCharArray();
    char c[]=new char[3];
    int ctr=0;

    String res="";
    for(int i=0;i<ch.length;i++){
        c[ctr]=ch[i];
        ctr++;
        String rev="";
        if(ctr==3|| i+1==ch.length){
            ctr=0;
            String sc= String.valueOf(c);
            for (int j=sc.length()-1;j>=0;j--)
            {
                rev=rev+sc.charAt(j);

            }
            res=res+rev;
            System.out.println(res);
        }


    }


}
}
