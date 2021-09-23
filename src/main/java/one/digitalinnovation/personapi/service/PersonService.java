package one.digitalinnovation.personapi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;
import one.digitalinnovation.personapi.mapper.PersonMapper;
import one.digitalinnovation.personapi.repository.PersonRepository;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

	private PersonRepository repository;

	private final PersonMapper personMapper = PersonMapper.INSTANCE;

	public MessageResponseDTO createPerson(PersonDTO personDto) {
		Person person = personMapper.toModel(personDto);
		return MessageResponseDTO
		.builder()
		.mensage("Created person with ID " + 
				repository
				.save(person)
				.getId())
		.build();
	}

	public List<PersonDTO> listAll() {
		List<Person> list = repository.findAll();
		return list.stream().map(personMapper::toDTO).collect(Collectors.toList());
	}

	public PersonDTO findById(Long id) throws PersonNotFoundException {
		return personMapper.toDTO(verifyIfExistsOrThrowException(id));
	}

	private Person verifyIfExistsOrThrowException(Long id) throws PersonNotFoundException {
		return repository.findById(id).orElseThrow(() -> new PersonNotFoundException("Person not found with ID " + id));
	}
}