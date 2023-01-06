package oopEx1;


import oopEx1.TerranSteamPack.SteamPack;

/*
 * 인터페이스의 강의 파일입니다.
 */
public class Starcraft2 {
	
	Object obj;
	public static void main(String[] args) {
		
		Object obj = new Starcraft();
		
		new Starcraft2().obj = new Object();
		Terran marine = new Marine ("Jason", "이병", 60, 60);
		Terran firebat = new Firebat ("불쏘시개", "상병", 40, 70);
		Terran medic = new Medic ("줄리아", "하사", 50, 0);
		
		//모든 공격 유닛에게 공격명령을 내립니다.
		
		((Attackable)marine).attack("드론");
		((Attackable)firebat).attack("저글링");
		
		((Moveable) marine).move(100,100);
		
		TerranSteamPack.SteamPack steamPackM = new SteamPack(marine);
		TerranSteamPack.SteamPack steamPackF = new SteamPack(firebat);
		
		steamPackM.steamPack();
		steamPackF.steamPack();
		
		//Ghost 유닛을 만든 후, 좌표 550, 350 지점에 핵폭탄을 유도해보세요.
		Terran ghost = new Ghost ("유령", "특수요원", 30, 20);
		((GhostAbility)ghost).nuclearLaunch(550, 350);
		
//		Ghost ghost = new Ghost ("유령","특수요원", 30, 20);
//		ghost.nuclearLaunch(550, 350);
		
	}

}
