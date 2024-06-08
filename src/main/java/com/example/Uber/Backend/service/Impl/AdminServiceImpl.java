package com.example.Uber.Backend.service.Impl;

import com.example.Uber.Backend.Model.Admin;
import com.example.Uber.Backend.Model.Customer;
import com.example.Uber.Backend.Model.Driver;
import com.example.Uber.Backend.Reposetory.AdminReposetory;
import com.example.Uber.Backend.Reposetory.CustomerReposetory;
import com.example.Uber.Backend.Reposetory.DriverReposetory;
import com.example.Uber.Backend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminReposetory adminRepository1;

    @Autowired
    DriverReposetory driverRepository1;

    @Autowired
    CustomerReposetory customerRepository1;

    @Override
    public void adminRegister(Admin admin) {
        //Save the admin in the database
        adminRepository1.save(admin);
    }

    @Override
    public Admin updatePassword(Integer adminId, String password) {
        //Update the password of admin with given id
        Admin admin = adminRepository1.findById(adminId).get();
        admin.setPassword(password);

        admin = adminRepository1.save(admin);
        return admin;
    }

    @Override
    public void deleteAdmin(int adminId){
        // Delete admin without using deleteById function
        Admin admin =  adminRepository1.findById(adminId).get();
        adminRepository1.delete(admin);
    }

    @Override
    public List<Driver> getListOfDrivers() {
        //Find the list of all drivers
        List<Driver> driverlist = driverRepository1.findAll();
        return driverlist;
    }

    @Override
    public List<Customer> getListOfCustomers() {
        //Find the list of all customers
        List<Customer>customer = customerRepository1.findAll();
        return customer;
    }
}
