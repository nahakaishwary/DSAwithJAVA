package DSAwithJAVA.Recursion;

public class SOD {
    static int SumOfDigit(int n){
        if(n>=0 && n<=9)
            return n; // base case

        return SumOfDigit(n/10) + n%10;


    }

    // p^q
    static int Power(int p,int q){
        if(q==0 || p==1) return 1;   //method 1
//        return Power(p,q-1)*p;
        int smallPow=Power(p,q/2);//method 2
        if(q%2==0){
            return smallPow*smallPow;
        }
        return p*smallPow*smallPow;
    }
    public static void main(String[] args) {
        System.out.println(Power(2,8));
    }
}
