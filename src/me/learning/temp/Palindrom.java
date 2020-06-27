package me.learning.temp;

public class Palindrom {

	public static void main(String[] args) {
		int x =121;
        int rev = 0;
        int num = x;
        while(x > 0){
            int tail = x%10;
            rev = rev * 10 + tail; 
            x /= 10;
        }
        System.out.println(num);
        System.out.println(rev);
        System.out.println((num == rev));

	}

}
