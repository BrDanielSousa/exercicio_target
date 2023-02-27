package com.exercicio.target.controller;

public class Exercicio_5 {
    public void teste(){
        String str = "Daniel";
        System.out.println(str);
        char[] ch = str.toCharArray();
        int begin = 0;
        int end = ch.length-1;
        char temp;
        while(end>begin){
            temp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = temp;
            end--;
            begin++;
        }
        str = new String(ch);
        System.out.println(str);
    }
}
