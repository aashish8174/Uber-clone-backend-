package com.example.Uber.Backend.service;
import com.example.Uber.Backend.Model.Admin;
import com.example.Uber.Backend.Model.Customer;
import com.example.Uber.Backend.Model.Driver;

import java.util.List;

public interface AdminService {

    public void adminRegister(Admin admin);

    public Admin updatePassword(Integer adminId, String password);

    public void deleteAdmin(int adminId);

    public List<Driver> getListOfDrivers();

    public List<Customer> getListOfCustomers();
}

