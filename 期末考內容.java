1.排序(不能使用api)
public class test1{
	public static void main(String[] args){
        int num[]={5,3,4,1,2};
        int sw;
        for(int i=0;i<num.length;i++){
            for(int j=1;j<num.length-i;j++){
                if(num[j-1]>num[j]){
                    sw=num[j-1];
                    num[j-1]=num[j];
                    num[j]=sw;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.printf("%d",num[i]);
        }
    }
}
2.給陣列 一個迴圈找max min avg
import java.util.Arrays;
public class test1{
	public static void main(String[] args){
        int num[]={5,3,4,1,2,6,7};
        int max=0,min=100,avg=0;
        Arrays.sort(num);
        for(int i=1;i<num.length+1;i++){    
            if(num[i-1]>max){
                max=num[i-1];
            }
            if(num[i-1]<min){
                min=num[i-1];
            }
            avg=num.length/2;
        }
        for(int i=0;i<num.length;i++){
            System.out.printf("%d",num[i]);  
        }
        System.out.println("");
        System.out.println(max);
        System.out.println(min);
        System.out.println(num[avg]);
    }
}
3.用涵式(副程式)產生一個亂數，介於某個範圍
import java.security.SecureRandom;
import java.util.Scanner;
public class test1{
	public static void main(String[] args){
        int num=0,te=0;
        Scanner input= new Scanner(System.in);
        num= input.nextInt();
        num=ran(num);
        System.out.println(num);
    }
    public static int ran(int num){
        int r = 0;
        r =(int)(Math.random()*num+1);
        
        return r;
    }
}
4.保留題(?)
5.期中考 考過的 ~~幹題~~
