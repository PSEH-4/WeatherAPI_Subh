package com.example.wt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import static org.junit.Assert.assertEquals;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class DemoApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;



    @Test
    public void testWeather_serviceAvailability() throws Exception {

        ResponseEntity<String> entity = restTemplate

                .getForEntity("http://api.openweathermap.org/data/2.5/forecast?q=London,us&mode=xml&appid=d2929e9483efc82c82c32ee7e02d563e", String.class);

        assertEquals(HttpStatus.OK, entity.getStatusCode());

    }


	
	
}
