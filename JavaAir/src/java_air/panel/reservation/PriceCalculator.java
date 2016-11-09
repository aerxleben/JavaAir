/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.panel.reservation;

import java.text.DecimalFormat;
import java_air.main.Global;

/**
 *
 * @author Rui Zhang
 */
public class PriceCalculator {
    private double fare;
    private double taxFee;
    private double totalFee;
    private int rewardPointUse = 0;
    private int rewardRate2Cash = 1000;
    private DecimalFormat decimalFormat = new DecimalFormat(".##");
    
    public PriceCalculator(){
        fare = (Global.currentReservation.getOriginFlight().getFlightCost()
               * Global.currentReservation.getNumberOfPassenger());
        taxFee =  (fare*0.1432);
        totalFee = fare + taxFee;
    }
    public String getFare(){
        return ("$" + decimalFormat.format(fare));
    }
    
    public double getFareValue(){
        return this.fare;
    }
    
    public String getTaxFee(){
        return ("$" + decimalFormat.format(taxFee));
    }
    
    public String getTotalFee(){
        return ("$" + decimalFormat.format(totalFee));
    }
    
    public String getRewardRedeem(){
        return ("$" + this.rewardPointUse/rewardRate2Cash);
    }
    
    public int getRate(){
        return rewardRate2Cash;
    }
    
    public void setRewardPointUse(int rewardPointUse){
        this.rewardPointUse = rewardPointUse;
        totalFee -= this.rewardPointUse/rewardRate2Cash;
    }

}
