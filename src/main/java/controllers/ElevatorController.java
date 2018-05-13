package controllers;

import services.ElevatorServices;

import static spark.Spark.after;
import static spark.Spark.get;
import static spark.Spark.post;
import static util.JsonUtil.json;


public class ElevatorController {
    public ElevatorController(final ElevatorServices elevatorServices) {
        get("/elevators", (req, res) ->
            elevatorServices.getElevators(), json());

        after((req, res) -> {
            res.type("application/json");
        });

        get("/elevators/:id", (req,res) ->  {
            String id = req.params(":id");
            return elevatorServices.getElevatorById(Integer.parseInt(id));
        }, json());

        post("/elevators/:id/move", (req, res) -> {
            String id = req.params(":id");
            return elevatorServices.move(elevatorServices.getElevatorById(Integer.parseInt(id)));
                }, json());

//                elevatorServices.getElevatorById(Integer.parseInt(req.params(":id"))));

    }


}
