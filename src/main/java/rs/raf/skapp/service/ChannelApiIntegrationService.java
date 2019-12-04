package rs.raf.skapp.service;

import rs.raf.skapp.domain.dto.ChannelDto;

import java.util.List;

public interface ChannelApiIntegrationService {

    List<ChannelDto> findChannels();

}
