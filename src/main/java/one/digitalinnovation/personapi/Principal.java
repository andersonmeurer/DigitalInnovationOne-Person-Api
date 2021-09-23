package one.digitalinnovation.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Principal {

	public static void main(String[] args) {
		SpringApplication.run(Principal.class, args);
	}
}

/*
URL: http://localhost:8080/api/v1/people

Post
FindAll
FindByID
Update
Delete

Cadastrar 
{
    "firstName": "Anderson",
    "lastName": "Meurer",
    "cpf": "404.254.760-57",
    "phones": [
        {
        "type":"MOBILE",
        "number": "(48)999081423"
        }
    ]   
}
{
    "firstName": "Anderson 2",
    "lastName": "Meurer 2",
    "cpf": "816.399.070-84",
    "phones": [
        {
        "type":"MOBILE",
        "number": "(48)999081423"
        }
    ]   
}
*/