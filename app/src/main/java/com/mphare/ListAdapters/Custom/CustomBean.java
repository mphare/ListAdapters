package com.mphare.ListAdapters.Custom;

/**
 * Created by mhare on 6/23/15.
 */
public class CustomBean
{
  String name;
  String maker;

  public CustomBean(String name, String maker)
  {
    this.name = name;
    this.maker = maker;
  }

  public String getMaker()
  {
    return maker;
  }

  public void setMaker(String maker)
  {
    this.maker = maker;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}
