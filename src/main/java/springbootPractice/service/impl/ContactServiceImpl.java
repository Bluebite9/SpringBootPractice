package springbootPractice.service.impl;

import org.springframework.stereotype.Service;
import springbootPractice.model.Contact;
import springbootPractice.repository.ContactRepository;
import springbootPractice.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Contact create(Contact address) {
        return contactRepository.save(address);
    }
}
