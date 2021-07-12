package Spring.Cloud.Server.ITSS.Cloud.Config.Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@RibbonClient(name = "server", configuration = RibbonConfiguration.class)
public class CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication.class, args);
	}

}
