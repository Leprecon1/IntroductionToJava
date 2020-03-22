package com.company;

public class Packaging {
   private String category;
   private String color;

   public Packaging(String category, String color) {
      this.category = category;
      this.color = color;
   }

   public String getCategory() {
      return category;
   }

   public String getColor() {
      return color;
   }

   @Override
   public String toString() {
      return "Packaging{" +
              "category='" + category + '\'' +
              ", color='" + color + '\'' +
              '}';
   }
}
