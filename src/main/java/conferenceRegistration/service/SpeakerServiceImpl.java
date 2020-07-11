package conferenceRegistration.service;


import java.util.List;

import conferenceRegistration.model.Speaker;
import conferenceRegistration.repository.HibernateSpeakerRepositoryImpl;
import conferenceRegistration.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

	public List<Speaker> findAll() {
		return repository.findAll();
	}
}
