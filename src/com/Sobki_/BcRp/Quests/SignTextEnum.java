package com.Sobki_.BcRp.Quests;

public enum SignTextEnum {
	EARTH("§aIf you wish", "§ato become a", "§aEarth bender", "§eClick me"), WATER("§3If you wish", "§3to become a", "§3Water bender", "§eClick me"),
	FIRE("§cIf you wish", "§cto become a", "§cFire bender", "§eClick me"), AIR("§fIf you wish", "§fto become a", "§fAir bender", "§eClick me");
	
	
	private String[] text;
	private SignTextEnum(String... args){
		this.text = args;
	}
	
	
	public String[] getSignText() {
		return text;
	}
	
}
