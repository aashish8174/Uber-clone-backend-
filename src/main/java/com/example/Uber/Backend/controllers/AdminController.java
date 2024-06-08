package com.example.Uber.Backend.controllers;

import com.example.Uber.Backend.Model.Admin;
import com.example.Uber.Backend.Model.Customer;
import com.example.Uber.Backend.Model.Driver;
import com.example.Uber.Backend.service.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminServiceImpl adminServiceImpl = new AdminServiceImpl();

    @PostMapping("/register")
    public  ResponseEntity<String> registerAdmin(@RequestBody Admin admin){
        adminServiceImpl.adminRegister(admin);
        return new ResponseEntity<>( "Data received" ,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Admin> updateAdminPassword(@RequestParam Integer adminId,
                                                     @RequestParam String password){

        Admin updatedAdmin = adminServiceImpl.updatePassword(adminId, password);
        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);

    }

    @DeleteMapping("/delete")
    public void deleteAdmin(@RequestParam Integer adminId){

        adminServiceImpl.deleteAdmin(adminId);

    }

    @GetMapping("/listOfCustomers")
    public List<Customer> listOfCustomers() {
        List<Customer> listOfCustomers = adminServiceImpl.getListOfCustomers();
        return listOfCustomers;
    }

    @GetMapping("/listOfDrivers")
    public List<Driver> listOfDrivers() {
        List<Driver> listOfDrivers = adminServiceImpl.getListOfDrivers();
        return listOfDrivers;
    }
}

