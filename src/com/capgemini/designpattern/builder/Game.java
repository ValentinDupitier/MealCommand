package com.capgemini.designpattern.builder;

public class Game extends Item {

	private GameType gameType;

	public Game(GameType gameType) {
		super(); // to get attributes of mother class Item
		this.gameType = gameType;
		this.setPrice(0); // a game is always free (offered with meal)
		this.packing = new CardBoard();
		// define other attributes following game type
		if (gameType == GameType.Figurine) {
			this.setName("Figurine");
		}
		else if (gameType == GameType.SetGame) {
			this.setName("Jeu de plateau");
		}
	}

}