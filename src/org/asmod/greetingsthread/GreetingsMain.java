package org.asmod.greetingsthread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreetingsMain {

	public static void main(String[] args) {
			boolean done = false;
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			try {
				while(!done) {
				    	
					System.out.println("May I know your name?:");
					System.out.println("You can type [quit] anytime.");
					String commandInput = bufferedReader.readLine();
					if (commandInput.equals(null)||commandInput.equalsIgnoreCase("quit")) {
					    done = true;
					}else {
					    Greetings greetings = new Greetings();
					    GreetingsTask greetingsTask = new GreetingsTask(greetings, commandInput);
					    Thread greetingThread = new Thread(greetingsTask);
					    greetingThread.start();
					}					
				}
			} catch (IOException e) {
				System.out.println("Ooops something happened!, getting out of here!");
			}
	}

}
