package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Aboutus;
@Service
public interface AboutUsService {

	
	boolean addAboutus(Aboutus aa);
	List<Aboutus> retrieveAboutus();
	boolean updateAboutus(Aboutus aa);
	boolean deleteAboutus(int aa);
	Aboutus retrieveAboutus(int aa);

}
