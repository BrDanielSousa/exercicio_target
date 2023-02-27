package com.exercicio.target;

import com.exercicio.target.controller.Exercicio_2;
import com.exercicio.target.controller.Exercicio_4;
import com.exercicio.target.controller.Exercicio_5;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TargetApplication {

	public static void main(String[] args) {
		Exercicio_2 exer2 = new Exercicio_2();
		exer2.Comparacao(6);
		Exercicio_4 exer4 = new Exercicio_4();
		exer4.calculoPercentual();
		Exercicio_5 exer5 = new Exercicio_5();
		exer5.teste();

	}

}
