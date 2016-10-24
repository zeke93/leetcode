package cn.hackcoder;

/**
 * Created by Thinsky on 16/2/23.
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num<10) return num;
        int sum = 0;
        while (num>=10){
            sum += num%10;
            num/=10;
        }
        sum+=num;
        return addDigits(sum);
    }

    public static void main(String[] args) {
        System.out.println(new AddDigits().addDigits(1234));
    }
}
