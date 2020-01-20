package com.br.Veiculo.gft;

public class Aviao extends Veiculo {

	public String tipo;

	public String uso;

	public Aviao(int velocidade, int litrosCombustiveis, boolean isLigado, String modelo, int passageiro,

			int combustivel, String tipo, String uso) {

		super(velocidade, litrosCombustiveis, isLigado, modelo, passageiro);

		this.tipo = tipo;

		this.uso = uso;

	}

	// Getters e Setters

	public String getTipo() {

		return tipo;

	}

	public void setTipo(String tipo) {

		this.tipo = tipo;

	}

	public String getUso() {

		return uso;

	}

	public void setUso(String uso) {

		this.uso = uso;

	}

	public Aviao() {

	}

//Métodos 

	public void acelerar(int quantidade) {

		if (isLigado) {

			Velocidade = Velocidade + quantidade;

//			litrosCombustiveis = 300;

			this.litrosCombustiveis = litrosCombustiveis - 1;

			System.out.println("A aeronave está a " + Velocidade + "km/h");

		} else {

			System.out.println("A aeronave  está Desligado");

		}

	}

	public void abastecer(String qtdLitros) {

		int Litros = Integer.parseInt(qtdLitros);

		if (litrosCombustiveis < 300) {

			if (isLigado == false) {

				litrosCombustiveis = litrosCombustiveis + Litros;

				if (litrosCombustiveis > 300) {

					int x = litrosCombustiveis - 300;

					litrosCombustiveis = litrosCombustiveis - x;

					System.out.println("seu limite de abastecer excedeu, limitamos  até " + litrosCombustiveis
							+ "  litros  para evitar acidente.");

				}

				System.out.println("seu tanque está  " + litrosCombustiveis + "  litros");

			} else {

				System.out.println("Seu carro esta em movimento, você não pode abastecer");

			}

		}

	}

}





