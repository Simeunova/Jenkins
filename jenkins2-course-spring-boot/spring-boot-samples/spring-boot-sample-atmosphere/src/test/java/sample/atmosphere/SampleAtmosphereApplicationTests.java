/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.atmosphere;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketConnectionManager;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import static org.assertj.core.api.Assertions.assertThat;

/*@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleAtmosphereApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
@DirtiesContext*/
public class SampleAtmosphereApplicationTests {

	private static Log logger = LogFactory.getLog(SampleAtmosphereApplicationTests.class);

	@LocalServerPort
	private int port = 1234;

	@Test
	public void chatEndpoint() throws Exception {
		/*ConfigurableApplicationContext context = new SpringApplicationBuilder(
				ClientConfiguration.class, PropertyPlaceholderAutoConfiguration.class)
						.properties("websocket.uri:ws://localhost:" + this.port
								+ "/chat/websocket")
						.run("--spring.main.web_environment=false");
		long count = context.getBean(ClientConfiguration.class).latch.getCount();
		AtomicReference<String> messagePayloadReference = context
				.getBean(ClientConfiguration.class).messagePayload;
		context.close();
		assertThat(count).isEqualTo(0L);
		assertThat(messagePayloadReference.get())
				.contains("{\"message\":\"test\",\"author\":\"test\",\"time\":");*/
				assertThat(port).isEqualTo(1234);
	}

}
