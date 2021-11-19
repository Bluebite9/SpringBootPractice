package springbootPractice.service.impl;

import org.springframework.stereotype.Service;
import springbootPractice.model.MeterDetails;
import springbootPractice.repository.MeterDetailsRepository;
import springbootPractice.service.MeterDetailsService;

@Service
public class MeterDetailsServiceImpl implements MeterDetailsService {

    private final MeterDetailsRepository meterDetailsRepository;

    MeterDetailsServiceImpl(MeterDetailsRepository meterDetailsRepository) {
        this.meterDetailsRepository = meterDetailsRepository;
    }

    @Override
    public MeterDetails create(MeterDetails address) {
        return meterDetailsRepository.save(address);
    }
}
