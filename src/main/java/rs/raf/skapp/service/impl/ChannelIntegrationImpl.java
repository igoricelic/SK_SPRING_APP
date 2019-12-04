package rs.raf.skapp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rs.raf.skapp.domain.dto.ChannelDto;
import rs.raf.skapp.service.ChannelApiIntegrationService;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChannelIntegrationImpl implements ChannelApiIntegrationService {

    private static final String URL = "http://localhost:2227/channel/local/findAll";

    private final RestTemplate restTemplate;

    @Override
    public List<ChannelDto> findChannels() {
        ResponseEntity<ChannelDto[]> response = restTemplate.getForEntity(URL, ChannelDto[].class);
        return Arrays.asList(response.getBody());
    }

}
