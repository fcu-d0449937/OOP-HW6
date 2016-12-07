package fcu.iecs.oop.pokemon;

public class Player {
	private String playerName;
	private int level;
	private Pokemon[] pokemons;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Pokemon[] getPokemons() {
		return pokemons;
	}
	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}
	public Player(String playerName){
		this.playerName = playerName;
		level = 1;
	}
	
}
