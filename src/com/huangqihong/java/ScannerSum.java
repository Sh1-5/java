package com.huangqihong.java;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int num = 0;

        while(scanner.hasNextDouble()) {
            sum = sum + scanner.nextDouble();
            num++;
            System.out.println("你输入了第" + num + "个数据，当前和为：" + sum);
        }

        System.out.println("和：" + sum);
        System.out.println("平均数：" + sum / num);

        scanner.close();
    }
}
