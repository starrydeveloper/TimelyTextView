package com.github.adnansm.timelytextview.model.number;

import com.github.adnansm.timelytextview.model.core.Figure;

public class Six extends Figure {
    private static final float[][] POINTS = {
		{ 0.5823856f , 0.38244343f }, 
		{ 0.49026108f , 0.3354245f }, 
		{ 0.48920935f , 0.49810347f }, 
		{ 0.5885869f , 0.449058f }, 
	//	{ 0.58571434f , 0.45238867f }, 
		{ 0.6118624f , 0.4806975f }, 
		{ 0.63680184f , 0.51007974f }, 
		{ 0.6622746f , 0.53898776f }, 
	//	{ 0.6622746f , 0.53898776f }, 
		{ 0.62782735f , 0.69722694f }, 
		{ 0.37953043f , 0.72001946f }, 
		{ 0.33938977f , 0.53565705f }, 
	//	{ 0.33606103f , 0.53565705f }, 
		{ 0.3344252f , 0.41298345f }, 
		{ 0.33944875f , 0.29020557f }, 
		{ 0.33273235f , 0.1676113f }, 
	//	{ 0.33439666f , 0.17094198f }, 
		{ 0.3648434f , 0.01085674f }, 
		{ 0.6287477f , 0.012449023f }, 
		{ 0.6622746f , 0.16927662f }, 
		
		
    };

    private static Six INSTANCE = new Six();

    protected Six() {
        super(POINTS);
    }

    public static Six getInstance() {
        return INSTANCE;
    }
}
