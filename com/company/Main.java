package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int vvod=1;
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        while(vvod!=0) {
            System.out.print("Введите номер задачи или ноль для выхода = ");
            vvod=scanner.nextInt();
            switch (vvod) {
                case 1:
                    prost_chisla();
                    break;
                case 2:
                    fibonachi();
                    break;
                case 3:
                    peresechenie();
                    break;
                case 4:
                    NOK_NOD();
                    break;
                case 5:
                    polidrom();
                    break;
                case 6:
                    delete_chisla();
                    break;
            }
        }
    }
    private static void prost_chisla(){
        int h=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N = ");
        int n= scanner.nextInt();
        boolean t=true;
        System.out.print("Простые числа = ");
        for(int i = 2; i<=n; i++){
            t=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    t=false;
                    break;
                }
            }
            if(t){
                System.out.print(i+"\t");
            }
        }
        System.out.println();
    }
    private static void fibonachi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N = ");
        int n= scanner.nextInt();
        int a=1,b=0;
        System.out.print("Числа Фибоначи = ");
        for(int i=1;i<n;i++){
            a+=b;
            b=a-b;
            System.out.print(a+"\t");
        }
        System.out.println();
    }
    private static void peresechenie(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первой точки ");
        System.out.print(" X1 = ");
        float x1= scanner.nextFloat();
        System.out.print(" Y1 = ");
        float y1=scanner.nextFloat();
        System.out.println("Введите координаты второй точки ");
        System.out.print(" X2 = ");
        float x2=scanner.nextFloat();
        System.out.print(" Y2 = ");
        float y2 = scanner.nextFloat();
        System.out.println("Введите координаты третьей точки ");
        System.out.print(" X3 = ");
        float x3 = scanner.nextFloat();
        System.out.print(" Y3 = ");
        float y3 = scanner.nextFloat();
        System.out.println("Введите координаты третьей точки ");
        System.out.print(" X4 = ");
        float x4 = scanner.nextFloat();
        System.out.print(" Y4 = ");
        float y4 = scanner.nextFloat();
        float x,y;
        x=((x1*y2-x2*y1)*(x4-x3)-(x3*y4-x4*y3)*(x2-x1))/((y1-y2)*(x4-x3)-(y3-y4)*(x2-x1));
        y=((y3-y4)*x-(x3*y4-x4*y3))/(x4-x3);
        if(((x1<=x)&(x2>=x)&(x3<=x)&(x4>=x))||((y1<=y)&(y2>=y)&(y3<=y)&(y4>=y)))System.out.println("Отрезки пересикаются");
        else System.out.println("Отрезки не пересикаются");
    }
    private static void polidrom(){
        int a=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку = ");
        String st=scanner.next();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==st.charAt(st.length()-1-i))a++;
        }
        if (st.length()==a)System.out.println("Слово '"+st+"' полидром");
        else System.out.println("Слово '"+st+"' не полидром");
    }
    private static void delete_chisla(){
        String s="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку ");
        String st=scanner.next();
        for(int i=0;i<st.length();i++) {
            if (st.charAt(i) >= '0' && st.charAt(i) >= '9') s = s.concat(String.valueOf(st.charAt(i)));
        }
        System.out.println("Итог = "+s);
    }
    private static void NOK_NOD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("НОК = "+nok(a,b)+" НОД = "+nod(a,b));
    }
    private static int nod(int a, int b){
        if(b==0){
            return a;
        }else{
            return nod(b,a%b);
        }
    }
    private static int nok(int a, int b){
        return Math.round(a/nod(a,b))*b;
    }
}