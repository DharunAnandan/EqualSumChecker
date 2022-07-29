public class EqualSumChecker {
    public static void main(String[]args){
        hasEqualSum(1,1,2);

    }


    public static boolean hasEqualSum(int num1,int num2, int num3){
            int check1=(int)(num1+num2);
            int check2=(int)(num3);
            if(check1==check2){
                System.out.println("it's equal");
                return true;

            }
            else{
                System.out.println("it's not equal");
                return false;
            }

        }



}
