package fcu.iecs.oop.pokemon;
import java.util.Random;

public class GYM {
	public static Player fight(Player player1,Player player2){
		int winner1=0,winner2=0;
		int i;
		for(i=0;i<3;i++){
		if (player1.getPokemons()[i].getType() ==player2.getPokemons()[i].getType()){
				if(player1.getPokemons()[i].getCp()>player2.getPokemons()[i].getCp()){
					winner1++;
				}
				else if(player1.getPokemons()[i].getCp()<player2.getPokemons()[i].getCp()){
					winner2++;
				}
				else{
					Random ran = new Random();
					if(ran.nextInt(2)+1==1){
						winner1++;
			        }
			        else{
			        	winner2++;
			        }
				}
		}
		else if(player1.getPokemons()[i].getType()==PokemonType.WATER&&player2.getPokemons()[i].getType()==PokemonType.FIRE||player1.getPokemons()[i].getType()==PokemonType.FIRE&&player2.getPokemons()[i].getType()==PokemonType.GRASS||player1.getPokemons()[i].getType()==PokemonType.GRASS&&player2.getPokemons()[i].getType()==PokemonType.WATER){
			winner1++;
		}
		else{
			winner2++;
		}
		}
		if(winner1>=2){
			player1.setLevel(player1.getLevel()+1);
			System.out.println("\"Winner is ["+player1.getPlayerName()+"], and his/her level becomes ["+player1.getLevel()+"].\"");
			return player1;	
		}
		else{
			player2.setLevel(player2.getLevel()+1);
			System.out.println("\"Winner is ["+player2.getPlayerName()+"], and his/her level becomes ["+player2.getLevel()+"].\"");
			return player2;
		}
	}
}
