package com.mygdx.MagnetFighters;

import com.badlogic.gdx.Game;

public class MagnetFighters extends Game
{

	GameController g;
	UI_MVP ui;
	SoundEngine sounds;
	
	@Override
	public void create() 
	{
		ui=new UI_MVP(this);
		g=new GameController(this);
		this.setScreen(ui);
		sounds=new SoundEngine();
		sounds.playMusic(6);
		sounds.setSoundVolume(1f);
	}
	
}