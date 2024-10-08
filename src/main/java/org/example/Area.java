package org.example;

public class Area {
    public int rectArea(int length , int height){
        return length*height;
    }

    public int rectPerim(int length , int height){
        return (length*2)+(height*2);
    }

    public int isTriangle ( int a , int b, int c ){
        if(a <= b+c && b <= a +c && c <= a +b){
            return 1;
        }else{
            return 0;
        }
    }
}
