package dev.palakkalsi.contactapi.repo;

import dev.palakkalsi.contactapi.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepo extends JpaRepository<Contact,String> {
    Optional<Contact>  findbyid(String id);
}
