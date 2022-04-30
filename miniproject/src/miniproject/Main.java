package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

//import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {

		//MP3Player mp3 = new MP3Player();
		ConnectDB db = new ConnectDB();
		Scanner scan = new Scanner(System.in);

		User man = new User(null, null, null, 0);

		Pokemon poke;

		String nick;
		String type = null;

		String id;
		
	//	mp3.play("C:/Users/smhrd/Desktop/raw/bgm.mp3");

		System.out.print(" ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣶⣶⣶⣶⣶⣶⣶⣶⣶⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n⠀");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠿⠿⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n⠀");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠁⠀⠀⠀⠀⠀⢀⣈⣻⣿⣷⣦⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⢀⡴⠒⠋⠉⠁⠀⠀⠀⠀⠀⠉⠙⠲⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⢀⡴⠉⠀⣴⣾⡟⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⢠⠏⠀⠀⣸⡟⣿⣿⠈⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀⠀⣿⡇⣿⣿⠀⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⢰⣿⣿⣿⣿⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⢰⠃⠀⠀⠀⢸⣿⣿⣿⣿⣀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡏⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢛⠛⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣶⣾⣿⣿⣿⣿⡿⠛⠋⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⣠⣶⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⡿⠃⠀⠀⠀⠀⢰⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣯⢹⣦⣀⣰⠃⠀⠙⢿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠋⠀⠀⠀⠀⠀⠀⢸⣷⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣸⠃⠈⠙⠒⠦⣄⡀⠀⠀⠀⢠⣶⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⢸⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠀⠉⠳⣄⠀⢻⣿⣿⡟⠀⠀⠀⢀⣤⣤⡀⠀⠀⠀⢰⣿⣿⣷⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⡴⢳⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⡄⠈⠉⠀⠀⠀⠀⢾⣿⣿⡿⠀⠀⠀⠈⠻⠿⠋⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠉⠀⣠⠞⠀⠈⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠈⠙⠛⠁⠀⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣾⣿⠏⠀⠀⠀⠘⣦⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠃⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⠏⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡤⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⢿⠿⠿⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⡇⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡇⠀⠀⢀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⡇⠀⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⠀⣾⣿⣿⣿⣿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⠇⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄⢸⣿⣿⣿⣿⣿⣿⡿⠛⠛⠻⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠈⢿⣿⣿⣿⣿⣿⣿⣣⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢾⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠈⠻⣿⣿⣿⣿⡿⡅⠀⠀⠀⠀⠙⢿⣿⣿⣿⡿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⠦⠶⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠈⠛⠓⠒⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");
		System.out.print("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n");

		System.out.print("\t\t\t　■■■■　　 ■■■　　■　 　■　■■■■■　 ■　　 　　■    ■■    ■　　   ■　　⠀\r\n");
		System.out.print("\t\t\t■　　 ■　 ■　　 ■　■　 ■　　■　　  　■ ■  ■　■   ■   ■  ■　■　 　■ \r\n");
		System.out.print("\t\t\t■■■■■　 ■　　 ■　■■■　　 ■■■■■　■  ■ ■  ■ 　■　 　■  ■　 ■　 ■\r\n");
		System.out.print("\t\t\t■　　　 　■　　 ■　■　■　　■　　   ■　　■　   ■　　■ 　■   ■   ■ ■ \r\n");
		System.out.print("\t\t\t■　　　　 　■■■　　■　　■　■■■■■　■　　■■　　 ■　　 ■■    ■     ■      \r\n");

		System.out.println();

		while (true) {

			System.out.println("메뉴를 선택해주세요!");
			System.out.println("1. 가입하기");
			System.out.println("2. 게임 접속하기");
			System.out.println("3. 랭킹 확인하기");
			System.out.println("4. 종료하기");

			int n_1 = scan.nextInt();

			if (n_1 == 1) { // 회원가입

				while (true) {
					System.out.println();
					System.out.print("아이디를 입력하세요 >> ");
					id = scan.next();
					System.out.print("비밀번호를 입력하세요 >> ");
					String password = scan.next();
					System.out.print("이름을 입력하세요 >> ");
					String name = scan.next();

					if (db.findDup(id)) {

						db.setUser(id, password, name); // 회원 정보를 DB에 저장함

						man.setId(id); // 회원 객체에 정보를 입력함
						man.setPassword(password);
						man.setName(name);

						break; // 회원이 만들어지면 p_check = 0 임

					}

				}

			} else if (n_1 == 2) { // 로그인

				while (true) {
					System.out.println();
					System.out.print("아이디를 입력하세요 >> ");
					id = scan.next();
					System.out.print("비밀번호를 입력하세요 >> ");
					String password = scan.next();

					man = db.getUser(id, password);

					if (id.equals(man.getId()) && password.equals(man.getPassword())) {
						System.out.println("로그인에 성공했습니다! " + man.getName() + "님 안녕하세요!");
						System.out.println();
						break;
					} else {
						System.out.println("로그인에 실패했습니다! 다시 입력해주세요!");
					}

				} // 여기까지 로그인 성공

				System.out.println("메뉴를 골라주세요!");
				System.out.println("1. 포켓몬 생성하기");
				System.out.println("2. 게임 시작하기");
				System.out.println("3. 종료하기");
				int n_2 = scan.nextInt();

				switch (n_2) { // 스위치 시작

				case 1: // 포켓몬이 있는지 확인하고 있으면 출력문이랑 메뉴를 다시 보여줌, 없으면 포켓몬 생성 가능

					while (man.getP_check() == 0) {

						System.out.println();
						System.out.print("포켓몬을 생성합니다! ");
						System.out.print("생성할 포켓몬의 이름을 지어주세요! >> ");
						nick = scan.next();

						System.out.print("생성할 포켓몬의 종류를 골라주세요! ");
						System.out.print("리아코, 치코리타, 브케인 중 하나를 생성할 수 있습니다! >> ");

						while (true) {
							type = scan.next();

							if (type.equals("리아코") || type.equals("치코리타") || type.equals("브케인")) {

								db.setPokemon(nick, type); // 포켓몬의 이름과 종류를 pokemon 테이블에 저장함

								db.updatePcheck(man.getId());

								break;

							} else {
								System.out.println();
								System.out.print("생성할 수 없는 포켓몬입니다! ");
								System.out.print("리아코, 치코리타, 브케인 중 하나를 생성할 수 있습니다! >> ");
							}

						}

					} // 포켓몬 없는 놈이 생성하고 디비 저장까지 끝

//					System.out.println("게임을 시작합니다!");
					break; // 케이스 1 브레이크

				case 2: // 포켓몬이 있는지 확인하고 없으면 출력문이랑 메뉴 다시 보여줌, 있으면 게임 시작

					if (man.getP_check() == 0) {

						System.out.println();
						System.out.print("가지고 있는 포켓몬이 없습니다! ");
						System.out.print("생성할 포켓몬의 이름을 지어주세요! >> ");
						nick = scan.next();

						System.out.print("생성할 포켓몬의 종류를 골라주세요! ");
						System.out.print("리아코, 치코리타, 브케인 중 하나를 생성할 수 있습니다! >> ");

						while (true) {
							type = scan.next();

							if (type.equals("리아코") || type.equals("치코리타") || type.equals("브케인")) {

								db.setPokemon(nick, type); // 포켓몬의 이름과 종류를 pokemon 테이블에 저장함
								man.setP_check(1);
								break;

							} else {
								System.out.println();
								System.out.print("생성할 수 없는 포켓몬입니다! ");
								System.out.print("리아코, 치코리타, 브케인 중 하나를 생성할 수 있습니다! >> ");

							}

						}

					} else { // 포켓몬이 있으면

					}
					break; // 케이스 2 브레이크

				case 3: // 프로그램을 종료함

					System.out.println("프로그램을 종료합니다!");
					break; // 케이스 3 브레이크

				} // 스위치 끝
					//////////////////////////////////////////////////

				poke = db.getPokemon(id);

				if (poke.getLv() >= 1) {// 등록된 정보가 있는지 없는지

					System.out.print("등록된 포켓몬 정보가 있습니다! ");

				}

				System.out.println("게임을 시작합니다!");
				System.out.println();
				ChoiceMenu cm = new ChoiceMenu();

				cm.choice(poke);
//			

				db.updatePokemon(poke.getLv(), poke.getExp(), poke.getFull(), poke.getHappy(), poke.getTired(),
						poke.getGrade(), man.getId());

				////////////////////////////////////////////////////////

			} // 로그인하고 게임까지 하는 부분 끝 괄호

			else if (n_1 == 3) { // 랭킹 시작 괄호

				ArrayList<Rank> list = db.showRank();

				if (list.size() == 0) {
					System.out.println();
					System.out.println("등록된 사용자가 없습니다!");

				} else if (list.size() > 0) {
					System.out.println();
					System.out.println("상위 5명의 랭킹을 보여줍니다!");
					System.out.println();
					System.out.println("순위\t닉네임(아이디)\t\t포켓몬 상태 / 마지막으로 접속한 시간");
					System.out.println(
							"=======================================================================================");

					for (int i = 0; i < list.size(); i++) {

						Rank rk = list.get(i);

						System.out
								.println(i + 1 + "위\t" + rk.getNick() + "(" + rk.getId() + ")" + "\t\t" + rk.getGrade()
										+ " Lv." + rk.getLevel() + "(" + rk.getExp() + "%)" + " / " + rk.getDate());
					}

					System.out.println(
							"=======================================================================================");

				}

				System.out.println();

			} // 랭킹 끝 괄호

			else if (n_1 == 4) {
				System.out.println("게임을 종료합니다!");
	//			mp3.stop();

				break;
			} else {
				System.out.print("잘못된 번호를 입력했습니다! ");

			}

		} // 매우 큰 와일

	}

}
