package com.example.fotij.userapplication.model.entities;

/**
 * Created by fotij on 27/12/2017.
 */

public class Car {
    private int branchNum;
    private int carModel;
    private double mileage;
    private int carNum;
    private double rating;
    private int numOfRatings;
    private double oneDayCost;
    private double oneKilometerCost;
    private String imgURL;
    private int year;
    private boolean inUse;


    public Car() {
    }

    public Car(int branchNum, int carModel, double mileage, int carNum, double rating, int numOfRatings, double oneDayCost, double oneKilometerCost, String imgURL, int year, boolean inUse) {
        this.branchNum = branchNum;
        this.carModel = carModel;
        this.mileage = mileage;
        this.carNum = carNum;
        this.rating = rating;
        this.oneDayCost = oneDayCost;
        this.oneKilometerCost = oneKilometerCost;
        this.imgURL=imgURL;
        this.year=year;
        this.inUse=inUse;
        this.numOfRatings=numOfRatings;
    }

    public Car(Car other) {
        this.branchNum = other.branchNum;
        this.carModel = other.carModel;
        this.mileage = other.mileage;
        this.carNum = other.carNum;
        this.rating = other.rating;
        this.oneDayCost = other.oneDayCost;
        this.oneKilometerCost = other.oneKilometerCost;
        this.imgURL=other.imgURL;
        this.year=other.year;
        this.numOfRatings=other.numOfRatings;
        this.inUse=other.inUse;

    }


    public int getBranchNum() {
        return branchNum;
    }

    public void setBranchNum(int branchNum) {
        this.branchNum = branchNum;
    }

    public int getCarModel() {
        return carModel;
    }

    public void setCarModel(int carModel) {
        this.carModel =carModel;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getOneDayCost() {
        return oneDayCost;
    }

    public void setOneDayCost(double oneDayCost) {
        this.oneDayCost = oneDayCost;
    }

    public double getOneKilometerCost() {
        return oneKilometerCost;
    }

    public void setOneKilometerCost(double oneKilometerCost) {
        this.oneKilometerCost = oneKilometerCost;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumOfRatings() {
        return numOfRatings;
    }

    public void setNumOfRatings(int numOfRatings) {
        this.numOfRatings = numOfRatings;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public static boolean compareTwoCars(Car c1,Car c2){
        if(c1.getCarNum()!=c2.getCarNum() ||
                c1.getCarModel()!=c2.getCarModel()||
                c1.getOneKilometerCost()!=c2.getOneKilometerCost()||
                c1.getBranchNum()!=c2.getBranchNum()||
                c1.getImgURL()!=c2.getImgURL()||
                c1.getMileage()!=c2.getMileage()||
                c1.getOneDayCost()!=c2.getOneDayCost()||
                c1.getRating()!=c2.getRating()||
                c1.getNumOfRatings()!=c2.getNumOfRatings()||
                c1.getYear()!=c2.getYear())return false;
        return true;
    }
}

