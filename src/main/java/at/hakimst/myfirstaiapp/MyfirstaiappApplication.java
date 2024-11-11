package at.hakimst.myfirstaiapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstaiappApplication implements ApplicationRunner {

	@Autowired //automatisch ein Objekt bekommen
	ProgrammingTeacherAdvanced programmingTeacherAdvanced;

	public static void main(String[] args) {
		SpringApplication.run(MyfirstaiappApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(programmingTeacherAdvanced.chat("Zeige mir wie man ein Hallo Welt Programm in Java programmiert."));
	}
}
