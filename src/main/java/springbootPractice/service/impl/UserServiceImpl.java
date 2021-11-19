package springbootPractice.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springbootPractice.model.User;
import springbootPractice.repository.UserRepository;
import springbootPractice.service.*;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final AddressService addressService;
    private final ContactService contactService;
    private final GDPRService gdprService;
    private final MeterDetailsService meterDetailsService;

    UserServiceImpl(UserRepository userRepository, AddressService addressService,
                    ContactService contactService,GDPRService gdprService,
                    MeterDetailsService meterDetailsService) {
        this.userRepository = userRepository;
        this.addressService = addressService;
        this.contactService = contactService;
        this.gdprService = gdprService;
        this.meterDetailsService = meterDetailsService;
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User create(User user) {
        user.setAddress(addressService.create(user.getAddress()));
        user.setContact(contactService.create(user.getContact()));
        user.setGdpr(gdprService.create(user.getGdpr()));
        user.setMeterDetails(meterDetailsService.create(user.getMeterDetails()));
        return userRepository.save(user);
    }
}
