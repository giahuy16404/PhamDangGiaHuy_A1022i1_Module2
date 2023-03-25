package furama_final.controllers.facility_controller;

import furama_final.models.Facility;
import furama_final.services.impl.FacilityServiceImpl;

import java.io.IOException;

public class FacilityController {
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public void add (Facility o) throws IOException {
        facilityService.add(o);
    }

    public void displayListFacility() {
        facilityService.display();
    }

    public void displayListMaintenance(){
        facilityService.displayListMaintenance();
    }


}
