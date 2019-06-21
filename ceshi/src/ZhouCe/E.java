package ZhouCe;

public class E {
    public static void main(String[] args){
        int sum=0;
        for (int i =1;i<=10;i++){
            sum=i+sum;
            if (sum>20){
                System.out.println("当前的累加值为："+sum);
                break;
            }
        }

    }
}
