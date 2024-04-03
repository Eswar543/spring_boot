package com.java.vege.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.vege.Model.User;
import com.java.vege.Service.CustService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class CustController {
    @Autowired
    private CustService custService;

    @PostMapping("/adddata")
    public User postDetails(@RequestBody User user) {
        
        
        return custService.saveDetails(user);
    }
    @GetMapping("/getdata")
    
    
    public java.util.List<User> getDetails(){
        return custService.getAllDetails();
    }
    @PutMapping("/updatedata")
    public User updateuserDetails(@RequestBody User user) {
        
        
        return custService.updateDetail(user);
    }
    @DeleteMapping("/deletedata/{id}")
    public String deleteuserDetails(@PathVariable int id){
        return custService.deleteDetail(id);
    }
    
    
}