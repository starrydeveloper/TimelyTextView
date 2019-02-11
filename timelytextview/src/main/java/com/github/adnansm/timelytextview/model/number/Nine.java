package com.github.adnansm.timelytextview.model.number;

import com.github.adnansm.timelytextview.model.core.Figure;

public class Nine extends Figure {
    private static final float[][] POINTS = {
		
		{ 0.6672677f , 0.8304268f }, 
		{ 0.63773316f , 1.0009207f }, 
		{ 0.36507845f , 1.0049644f }, 
		{ 0.33273235f , 0.8337576f }, 
	//	{ 0.33273235f , 0.82543063f }, 
		{ 0.3367385f , 0.716668f }, 
		{ 0.333267f , 0.607816f }, 
		{ 0.33439666f , 0.49901894f }, 
	//	{ 0.33606103f , 0.4956883f }, 
		{ 0.32664356f , 0.3087004f }, 
		{ 0.62214327f , 0.27476716f }, 
		{ 0.66061026f , 0.45905018f }, 
	//	{ 0.663939f , 0.47403848f }, 
		{ 0.6225208f , 0.4917578f }, 
		{ 0.5845708f , 0.5163864f }, 
		{ 0.54576975f , 0.53898776f }, 
	//	{ 0.54244107f , 0.54564923f }, 
		{ 0.45556217f , 0.5056967f }, 
		{ 0.48307782f , 0.640119f }, 
		{ 0.54576975f , 0.5889487f }, 
		
		
	};

    private static Nine INSTANCE = new Nine();

    protected Nine() {
        super(POINTS);
    }

    public static Nine getInstance() {
        return INSTANCE;
    }
}
