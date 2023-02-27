package com.exercicio.target.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class Exercicio_2 {

    public void Comparacao(int x){
        int number1 = 1, number2 = 0;

        for(int i = 0; i < 8; i++){
            if(number1 == x || number2 == x){
                System.out.println("Este numero pertence a sequência");
                break;
            }
            number1 = number1 + number2;
            number2 = number1 - number2;
        }

        System.out.println("Este numero nao pertence a sequência\n");

    }
}
