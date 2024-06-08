package com.example.Uber.Backend.service.Impl;



import com.example.Uber.Backend.Model.Cab;
import com.example.Uber.Backend.Model.Driver;
import com.example.Uber.Backend.Reposetory.CabReposetory;
import com.example.Uber.Backend.Reposetory.DriverReposetory;
import com.example.Uber.Backend.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    DriverReposetory driverRepository3;

    @Autowired
    CabReposetory cabRepository3;

    @Override
    public void register(String mobile, String password){
        //Save a driver in the database having given details and a cab with ratePerKm as 10 and availability as True by default.
        Driver driver = new Driver();
        driver.setMobile(mobile);
        driver.setPassword(password);
        Cab cab = new Cab();
        cab.setPerKmRate(10);
        cab.setAvailable(true);
        cab.setDriver(driver);
        driver.setCab(cab);
        driverRepository3.save(driver);
    }

    @Override
    public void removeDriver(int driverId){
        // Delete driver without using deleteById function
        Driver drvr = driverRepository3.findById(driverId).get();
        driverRepository3.delete(drvr);
    }

    @Override
    public void updateStatus(int driverId){
        //Set the status of respective car to unavailable
        Driver driver = driverRepository3.findById(driverId).get();
        Cab cab =driver.getCab();
        cab.setAvailable(false);
        cabRepository3.save(cab);
    }
}

