import controllers.ElevatorController;
import services.ElevatorServices;

import static spark.Spark.port;

public class ElevatorManager_api {

        public static void main(String[] args) {
            port(8080);
            new ElevatorController(new ElevatorServices());
    }

}
