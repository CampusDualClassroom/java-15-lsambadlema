package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    // Fecha de caducidad
    protected Date expirationDate;

    // Constructor
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Location: ").append(getLocation()).append("\n");
        builder.append("Expiration Date: ").append(getFormattedDate(expirationDate));
        return builder.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}

