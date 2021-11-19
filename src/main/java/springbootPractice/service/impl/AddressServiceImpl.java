package springbootPractice.service.impl;

import org.springframework.stereotype.Service;
import springbootPractice.model.Address;
import springbootPractice.repository.AddressRepository;
import springbootPractice.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address create(Address address) {
        return addressRepository.save(address);
    }
}
