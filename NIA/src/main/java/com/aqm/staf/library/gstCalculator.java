package com.aqm.staf.library;

import java.text.DecimalFormat;
import java.text.ParseException;

import com.aqm.framework.helper.RandomCodeGenerator;

public class gstCalculator {
	
	
	
	public  String serviceTaxCalculation(String grossPremium,String CGST,String SGST,String IGST,String UGST,String Cess) throws ParseException 
	{ 
			double grossPremiumValue = Double.parseDouble(grossPremium);
			double serviveTax,decimal;
			String CALCCGST,CALCSGST,CALCCESS,CALCIGST,CALCUGST;
			String calculatedServiveTax="0.00";
			double TempCALCCGST=grossPremiumValue*(Double.parseDouble(CGST)/100);
			 CALCCGST= new DecimalFormat("0.00").format(TempCALCCGST);
//			String[] convert = CALCCGST.split("\\.");
//			int firstCgst = Integer.parseInt(convert[0]);
//			int lastCgst = Integer.parseInt(convert[1]);
//			if(lastCgst<50){
//				CALCCGST = firstCgst+"";
//			}else if(lastCgst>50){
//				CALCCGST = firstCgst+1+"";
//			}
			double TempCALCSGST=grossPremiumValue*(Double.parseDouble(SGST)/100);
			CALCSGST= new DecimalFormat("0.00").format(TempCALCSGST);
//			String[] convert1 = CALCSGST.split("\\.");
//			int firstSgst = Integer.parseInt(convert1[0]);
//			int lastSgst = Integer.parseInt(convert1[1]);
//			if(lastSgst<50){
//				CALCSGST = firstSgst+"";
//			}else if(lastSgst>50){
//				CALCSGST = firstSgst+1+"";
//			}

			double TempCALCCESS=grossPremiumValue*(Double.parseDouble(Cess)/100);
				CALCCESS= new DecimalFormat("0.00").format(TempCALCCESS);
//				String[] convert2 = CALCCESS.split("\\.");
//				int firstCess = Integer.parseInt(convert2[0]);
//				int lastCess = Integer.parseInt(convert2[1]);
//				if(lastCess<50){
//					CALCCESS = firstCess+"";
//				}else if(lastCess>50){
//					CALCCESS = firstCess+1+"";
//				}
			double TempCALCIGST=grossPremiumValue*(Double.parseDouble(IGST)/100);
				CALCIGST= new DecimalFormat("0.00").format(TempCALCIGST);
//				String[] convert3 = CALCIGST.split("\\.");
//				int firstIgst = Integer.parseInt(convert3[0]);
//				int lastIgst = Integer.parseInt(convert3[1]);
//				if(lastIgst<50){
//					CALCIGST = firstIgst+"";
//				}else if(lastIgst>50){
//					CALCIGST = firstIgst+1+"";
//
//			}
			double TempCALCUGST=grossPremiumValue*(Double.parseDouble(UGST)/100);
				CALCUGST= new DecimalFormat("0.00").format(TempCALCUGST);
//				String[] convert4 = CALCUGST.split("\\.");
//				int firstUgst = Integer.parseInt(convert4[0]);
//				int lastUgst = Integer.parseInt(convert4[1]);
//				if(lastUgst<50){
//					CALCUGST = firstUgst+"";
//				}else if(lastUgst>50){
//					CALCUGST = firstUgst+1+"";
//				}

			//		CALCCGST= Math.abs(CALCCGST);
			//CALCSGST=grossPremiumValue*(Double.parseDouble(SGST)/100);
			/*CALCCESS=grossPremiumValue*(Double.parseDouble(Cess)/100);
			CALCIGST=grossPremiumValue*(Double.parseDouble(IGST)/100);
			CALCUGST=grossPremiumValue*(Double.parseDouble(UGST)/100);*/
			//CALCCHESS=grossPremiumValue*(Double.parseDouble(Chess)/100);
			//serviveTax=grossPremiumValue*0.18;
			//serviveTax=CALCCGST+CALCSGST+CALCIGST+CALCUGST+CALCCHESS;
			//		CALCCGST= Math.abs(CALCCGST);
			//		CALCSGST= Math.abs(CALCSGST);
				
			serviveTax=Double.parseDouble(CALCCGST)+Double.parseDouble(CALCSGST)+Double.parseDouble(CALCCESS)+Double.parseDouble(CALCIGST)+Double.parseDouble(CALCUGST);
			serviveTax= Math.round(serviveTax);
			decimal=serviveTax % 1;
			if((decimal*100)<=49){
				calculatedServiveTax = RandomCodeGenerator.formatNumber(2,Math.floor(serviveTax));
			}
			else{
				calculatedServiveTax = RandomCodeGenerator.formatNumber(2,Math.ceil(serviveTax));
			}
			return calculatedServiveTax;
		}

		
		
		
	}


