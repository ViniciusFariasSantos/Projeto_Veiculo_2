package com.br.Veiculo.gft;

public class Caminhao extends Veiculo {

	private String cacamba;

	private int ano;

	private int porta;

	public Caminhao(int velocidade, int litrosCombustiveis, boolean isLigado, String modelo, int passageiro,

			String cacamba, int ano, int porta) {

		super(velocidade, litrosCombustiveis, isLigado, modelo, passageiro);

		this.cacamba = cacamba;

		this.ano = ano;

		this.porta = porta;

	}

//M�todos 

	public String getCacamba() {

		return cacamba;

	}

	public void setCacamba(String cacamba) {

		this.cacamba = cacamba;

	}

	public int getAno() {

		return ano;

	}

	public void setAno(int ano) {

		this.ano = ano;

	}

	public int getPorta() {

		return porta;

	}

	public void setPorta(int porta) {

		this.porta = porta;

	}

	public Caminhao() {

	}

	public void acelerar(int quantidade) {

		if (isLigado) {

			Velocidade = Velocidade + quantidade;

//			litrosCombustiveis = 200;

			litrosCombustiveis = litrosCombustiveis - 1;

			System.out.println("O Caminh�o est� a " + Velocidade + "km/h");

		} else {

			System.out.println("O caminhao est� Desligado");

		}

	}

	public void abastecer(float qtdLitros) {

		if (litrosCombustiveis < 150) {

			if (isLigado == false) {

				litrosCombustiveis = litrosCombustiveis + (int) qtdLitros;

				if (litrosCombustiveis > 150) {

					int x = litrosCombustiveis - 150;

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