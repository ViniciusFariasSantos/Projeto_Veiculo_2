package com.br.Veiculo.gft;

public class Veiculo {

	public int Velocidade;

	public int litrosCombustiveis;

	public boolean isLigado;

	String Modelo;

	int Passageiro;

	public Veiculo(int velocidade, int litrosCombustiveis, boolean isLigado, String modelo, int passageiro) {

		super();

		Velocidade = velocidade;

		this.litrosCombustiveis = litrosCombustiveis;

		this.isLigado = isLigado;

		Modelo = modelo;

		Passageiro = passageiro;

	}

	// Métodos

	public int getVelocidade() {

		return Velocidade;

	}

	public void setVelocidade(int velocidade) {

		Velocidade = velocidade;

	}

	public int getLitrosCombustiveis() {

		return litrosCombustiveis;

	}

	public void setLitrosCombustiveis(int litrosCombustiveis) {

		this.litrosCombustiveis = litrosCombustiveis;

	}

	public boolean isLigado() {

		return isLigado;

	}

	public void setLigado(boolean isLigado) {

		this.isLigado = isLigado;

	}

	public String getModelo() {

		return Modelo;

	}

	public void setModelo(String modelo) {

		Modelo = modelo;

	}

	public int getPassageiro() {

		return Passageiro;

	}

	public void setPassageiro(int passageiro) {

		Passageiro = passageiro;

	}

	public Veiculo() {

	}

	public void ligar() {

		isLigado = true;

		System.out.println("O veículo está ligado.");

	}

	public void acelerar(int quantidade) {

	}

	public void abastecer() {

	}

	public void frear(int quantidade) {

		if (isLigado) {

			Velocidade = Velocidade - quantidade;

			System.out.println("O veículo está a " + Velocidade + "km/h");

		} else {

			System.out.println("O veículo está Desligado");

		}

	}

	public void desligar() {

		isLigado = false;

		System.out.println("O veículo está Desligado");

	}
}
