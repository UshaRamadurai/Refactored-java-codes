package JavaDay2Assignments;

public class Smallest {

    public static void main(String[] args) {

        int n1=20; int n2=8;
        int n3=22; int n4=3;

        if((n1<n2) && (n1<n3) && (n1<n4) )
            System.out.println(n1 + " is the smallest");
            else if((n2<n3) && (n2<n4))
            System.out.println(n2 + " is the smallest");
            else if(n3<n4)
            System.out.println(n3 + " is the smallest");
            else
            System.out.println(n4 + " is the smallest");

    }

}
