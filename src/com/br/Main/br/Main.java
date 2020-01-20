package com.br.Main.br;
import  com.br.Veiculo.gft.*;
public class Main {

	public static void main(String[] args) {
		
		Carro Car = new Carro(20,100,false,null,0,0,null,0,0);

		Caminhao Cam = new Caminhao(20,150,false,null,0,null,0,0);

		Aviao Avi = new Aviao(20,300,false,null,0,0,null,null);



	



		Car.ligar();

		Car.acelerar(20);

		Car.acelerar(20);

		Car.abastecer(1);

		Car.abastecer(10);

		Car.desligar();

		Car.abastecer(1);

		Car.abastecer(10);

		



		System.out.println("------------------------------------------------------");

		

		

		Cam.ligar();

		Cam.acelerar(20);

		Cam.acelerar(20);

		Cam.abastecer(1);

		Cam.abastecer(10);

		Cam.desligar();

		Cam.abastecer(1);

		Cam.abastecer(10);

		

		

		System.out.println("------------------------------------------------------");

		

		

		

		

		Avi.ligar();

		Avi.acelerar(100);

		Avi.acelerar(100);

		Avi.abastecer("1");

		Avi.abastecer("10");

		Avi.desligar();

		Avi.abastecer("1");

		Avi.abastecer("10");

		System.out.println("------------------------------------------------------");

		
	}

}
