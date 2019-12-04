package rs.raf.skapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rs.raf.skapp.domain.dto.ChannelDto;
import rs.raf.skapp.service.ChannelApiIntegrationService;

import java.util.List;

@SpringBootTest
class SkappApplicationTests {

	@Autowired
	private ChannelApiIntegrationService channelApiIntegrationService;

	@Test
	void contextLoads() {

		List<ChannelDto> channels = channelApiIntegrationService.findChannels();
		for(ChannelDto channelDto: channels) {
			System.out.println(channelDto.toString());
		}


	}

}
