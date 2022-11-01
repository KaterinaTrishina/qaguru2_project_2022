public class OrderClass {
    //----------------ATTRIBUTES-------------------

   private double totalPrice;
   private double weight;
   private double volume;
   private int itemCount;
   private  double width;
   private double  height;
   private String address;


//---------------------------------GETTERS/SETTERS--------------------------------//


   public double getTotalPrice() {
      return totalPrice;
   }

   public void setTotalPrice(double totalPrice) {
      this.totalPrice = totalPrice;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   public double getVolume() {
      return volume;
   }

   public void setVolume(double volume) {
      this.volume = volume;
   }

   public int getItemCount() {
      return itemCount;
   }

   public void setItemCount(int itemCount) {
      this.itemCount = itemCount;
   }

   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public String getAddress(String s) {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}

