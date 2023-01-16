package kr.co.auction.lmoextradcconsumer;

import com.ebaykorea.saturn.datasource.EnableSaturnDataSource;
import com.ebaykorea.saturn.moa.EnableMoA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMoA
@EnableSaturnDataSource
public class LmoExtraDcConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmoExtraDcConsumerApplication.class, args);
	}

}
