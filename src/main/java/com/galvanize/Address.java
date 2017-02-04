package com.galvanize;

public class Address {
  private String street;
  private String city;
  private String state;
  private String zip;

  public Address(String street, String city, String state, String zip){
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  public String getStreet(){
    return street;
  };

  public String getCity(){
    return city;
  };

  public String getState(){
    return state;
  };

  public String getZip(){
    return zip;
  };

  public void setStreet(String newStreet){
    street = newStreet;
  };

  public void setCity(String newCity){
    city = newCity;
  };

  public void setState(String newState){
    state = newState;
  };

  public void setZip(String newZip){
    zip = newZip;
  };

  @Override public String toString(){
    return street + ", " + city + ", " + state + " "+ zip;
  }


}
