package ma.ahmed.TP.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import ma.ahmed.TP.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

	public Page<Patient> findByNomContains(String mc,Pageable pageable);

}
