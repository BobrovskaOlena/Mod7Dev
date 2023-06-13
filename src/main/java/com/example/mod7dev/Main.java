package com.example.mod7dev;

public class Main {
    public static void main(String[] args){
        HttpStatusChecker statusChecker = new HttpStatusChecker();
        try {
            String imageUrl = statusChecker.getStatusImage(200);
            System.out.println("Image URL: " + imageUrl);
        } catch (Exception e) {
            System.out.println("Error retrieving status image: " + e.getMessage());
        }


        HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
        try {
            httpStatusImageDownloader.downloadStatusImage(300);
        } catch (Exception e) {
            System.out.println("Error with downloading of image: " + e.getMessage());
        }


        HttpImageStatusCli cli = new HttpImageStatusCli();
        cli.askStatus();
    }
}
