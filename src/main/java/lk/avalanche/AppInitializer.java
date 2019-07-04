package lk.avalanche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/23/2019
 * Time: 10:59 PM}
 */

@SpringBootApplication(scanBasePackages={"lk.avalanche.battlebuddy"})
public class AppInitializer {
    public static void main(String[] args) {
        SpringApplication.run(AppInitializer.class, args);
    }
}

