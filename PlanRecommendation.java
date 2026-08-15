package Assignments.A55;

import java.util.Scanner;

public class PlanRecommendation {
    static class Plan {
        String name;
        double basePrice;
        int maxMins;
        int maxGB;
        int maxSMS;
        double extraMinRate;
        double extraGBRate;
        double extraSMSRate;

        Plan(String name, double basePrice, int maxMins, int maxGB, int maxSMS, 
             double extraMinRate, double extraGBRate, double extraSMSRate) {
            this.name = name;
            this.basePrice = basePrice;
            this.maxMins = maxMins;
            this.maxGB = maxGB;
            this.maxSMS = maxSMS;
            this.extraMinRate = extraMinRate;
            this.extraGBRate = extraGBRate;
            this.extraSMSRate = extraSMSRate;
        }

        double calculateTotalCost(int mins, int gb, int sms) {
            double extraMinCost = Math.max(0, mins - maxMins) * extraMinRate;
            double extraGBCost = Math.max(0, gb - maxGB) * extraGBRate;
            double extraSMSCost = Math.max(0, sms - maxSMS) * extraSMSRate;
            return basePrice + extraMinCost + extraGBCost + extraSMSCost;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int mins = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int gb = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int sms = sc.nextInt();

        if (mins < 0 || gb < 0 || sms < 0) {
            System.out.println("invalid input");
            return;
        }

        // 4 Available Plans
        Plan[] plans = {
            new Plan("Basic Plan", 199.0, 100, 2, 50, 1.0, 20.0, 1.0),
            new Plan("Silver Plan", 349.0, 300, 10, 150, 0.8, 15.0, 0.8),
            new Plan("Gold Plan", 599.0, 800, 30, 500, 0.5, 10.0, 0.5),
            new Plan("Platinum Plan", 999.0, 2000, 100, 1000, 0.2, 5.0, 0.2)
        };

        String bestPlan = plans[0].name;
        double minCost = Double.MAX_VALUE;

        for (Plan plan : plans) {
            double totalCost = plan.calculateTotalCost(mins, gb, sms);
            if (totalCost < minCost) {
                minCost = totalCost;
                bestPlan = plan.name;
            }
        }

        System.out.println("Recommended Plan: " + bestPlan);
        System.out.println("Total Cost: ₹" + minCost);

        sc.close();
    }
}