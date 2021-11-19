package springbootPractice.service.impl;

import org.springframework.stereotype.Service;
import springbootPractice.model.GDPR;
import springbootPractice.repository.GDPRRepository;
import springbootPractice.service.GDPRService;

@Service
public class GDPRServiceImpl implements GDPRService {

    private final GDPRRepository gdprRepository;

    GDPRServiceImpl(GDPRRepository gdprRepository) {
        this.gdprRepository = gdprRepository;
    }

    @Override
    public GDPR create(GDPR address) {
        return gdprRepository.save(address);
    }
}
