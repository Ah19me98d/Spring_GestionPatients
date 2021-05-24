package ma.ahmed.TP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.ahmed.TP.repositories.PatientRepository;

@SpringBootApplication
public class GestionPatientsApplication implements CommandLineRunner{

	@Autowired
	private PatientRepository patientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionPatientsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.findAll().forEach(p->{
			System.out.println(p.getNom());
		});
		
	}

}
