package org.example;

public class Crop extends Entity{
    public String cropType;
    public int quantity;
    static int nextid = 1;
    @Override
    public String getDescription() {
        return "Id: " + id + " Name: " + name + " Crop Type: " + cropType + " Quantity: " + quantity;
    }

    public Crop(int id, String name, String cropType, int quantity) {
            this.id = id;
            if (id >= nextid){
                nextid = id + 1;
            }
            this.name = name;
            this.cropType = cropType;
            this.quantity = quantity;

        }
    public Crop(String name, String cropType, int quantity) {
            id = nextid;
            nextid++;
            this.name = name;
            this.cropType = cropType;
            this.quantity = quantity;
        }
        public String getCSV() {
            return id + "," + name + "," + cropType + "," + quantity;
        }
    public String getList() {
        return id + " " + name + " " + cropType + " " + quantity;
    }
}
