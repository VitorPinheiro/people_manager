package vitor.pinheiro.peoplemanager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import vitor.pinheiro.peoplemanager.model.Person;
import vitor.pinheiro.peoplemanager.repository.PeopleRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootTest
class PeoplemanagerApplicationTests {


	@Test
	void contextLoads() {

	}

}
