package com.spring.mvc.test;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    @NotNull()
    @Size(min=1, message = "* required.")
    private String lastName;
    private String date;
    private String month;
    private String year;
    private LinkedHashMap<String, String> countriesList;
    private String birthCountry;
    private String residenceCountry;
    private String favoriteProgrammingLanguage;
    private String[] operatingSystems;
    private String[] enrolledCourses;

    public Student() {
        countriesList = new LinkedHashMap<>();
        countriesList.put("IN","India");
        countriesList.put("AU","Australia");
        countriesList.put("CA","Canada");
        countriesList.put("US","United States Of America");
    }
    public String[] getEnrolledCourses() {
        return enrolledCourses;
    }
    public void setEnrolledCourses(String[] enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
    public String[] getOperatingSystems() {
        return operatingSystems;
    }
    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }
    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }
    public LinkedHashMap<String, String> getCountriesList() {
        return countriesList;
    }
    public String getBirthCountry() {
        return birthCountry;
    }
    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }
    public String getResidenceCountry() {
        return residenceCountry;
    }
    public void setResidenceCountry(String residenceCountry) {
        this.residenceCountry = residenceCountry;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
