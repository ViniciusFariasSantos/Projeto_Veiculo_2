package com.br.Veiculo.gft;

public class Carro extends Veiculo {

	public String marca;

	public int portas;

	public int ano;

//Heran�a dos atributos do veiculos 

	public Carro(int velocidade, int litrosCombustiveis, boolean isLigado, String modelo, int passageiro,

			int combustivel, String marca, int portas, int ano) {

		super(velocidade, litrosCombustiveis, isLigado, modelo, passageiro);

		this.marca = marca;

		this.portas = portas;

		this.ano = ano;

	}

//Getters e Setters 

	public String getMarca() {

		return marca;

	}

	public void setMarca(String marca) {

		this.marca = marca;

	}

	public int getPortas() {

		return portas;

	}

	public void setPortas(int portas) {

		this.portas = portas;

	}

	public int getAno() {

		return ano;

	}

	public void setAno(int ano) {

		this.ano = ano;

	}

	public Carro() {

	}

// M�todos   

	public void acelerar(int quantidade) {

		if (this.isLigado) {

			this.Velocidade = Velocidade + quantidade;

			// litrosCombustiveis = 100;

			this.litrosCombustiveis = litrosCombustiveis - 1;

			System.out.println("O carro est� a " + Velocidade + "km/h");

		} else {

			System.out.println("O carro est� Desligado");

		}

	}

	public void abastecer(int qtdLitros) {

		if (litrosCombustiveis < 100) {

			if (isLigado == false) {

				litrosCombustiveis = litrosCombustiveis + qtdLitros;

				if (litrosCombustiveis > 100) {

					int x = litrosCombustiveis - 100;

					litrosCombustiveis = litrosCombustiveis - x;

					System.out.println("seu limite de abastecer excedeu, limitamos  at� " + litrosCombustiveis
							+ "  litros  para evitar acidente.");

				}

				System.out.println("seu tanque est�  " + litrosCombustiveis + "  litros");

			} else {

				System.out.println("Seu carro esta em movimento, voc� n�o pode abastecer");

			}

		}

	}

}