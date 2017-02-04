package com.galvanize;

import java.util.*;


public class Business implements Addressable{
  private String name;
  private ArrayList<Address> addresses = new ArrayList<Address>();

  public Business(String name){
    this.name = name;
  }


  public String getName(){
    return name;
  }

  @Override
  public List<Address> getAddresses(){
    return addresses;
  }

  @Override
  public void addAddress(Address newAddress){
    addresses.add(newAddress);
  }



}
