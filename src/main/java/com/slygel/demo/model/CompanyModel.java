package com.slygel.demo.model;

import com.slygel.demo.entity.Company;
import com.slygel.demo.entity.Tour;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyModel {

    private String companyId;
    private String companyName;
    private String description;
    private String address;
    private String phoneNumber;
    private String email;
    private String imagePath;

    private List<TourModel> tours;

    public CompanyModel(Company company){
        this.companyId = company.getCompanyId();
        this.companyName = company.getCompanyName();
        this.description = company.getDescription();
        this.address = company.getAddress();
        this.phoneNumber = company.getPhoneNumber();
        this.email = company.getEmail();
        this.imagePath = company.getImagePath();

        List<TourModel> tourModels = new ArrayList<>();
        for(Tour tour : company.getTours()){
            tourModels.add(new TourModel(tour));
        }
        this.tours = tourModels;
    }

}
