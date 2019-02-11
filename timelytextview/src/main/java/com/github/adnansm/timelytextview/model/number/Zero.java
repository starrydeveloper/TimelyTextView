package com.github.adnansm.timelytextview.model.number;

import com.github.adnansm.timelytextview.model.core.Figure;

public class Zero extends Figure {
    private static final float[][] POINTS = {
		{ 0.33106795f , 0.50234973f }, 
		{ 0.3361484f , 0.5922523f }, 
		{ 0.41664863f , 0.6791091f }, 
		{ 0.5108183f , 0.6655555f }, 
		
		//	{ 0.51581144f , 0.66888636f }, 
		{ 0.5689723f , 0.65913975f }, 
		{ 0.61452353f , 0.6235435f }, 
		{ 0.63396673f , 0.58895654f }, 
		//	{ 0.6273232f , 0.5872833f }, 
		{ 0.665857f , 0.54991496f }, 
		{ 0.67527895f , 0.46903569f }, 
		{ 0.6452955f , 0.41741607f }, 
		//	{ 0.65062416f , 0.40409315f }, 
		{ 0.6201327f , 0.37092074f }, 
		{ 0.56569165f , 0.32018787f }, 
		{ 0.49916783f , 0.32581707f }, 
	//	{ 0.5108183f , 0.33248237f }, 
		{ 0.41902828f , 0.32393566f }, 
		{ 0.32565054f , 0.40011752f }, 
		{ 0.33106795f , 0.50234973f }, 
		
		
		
		
    };

    private static Zero INSTANCE = new Zero();

    protected Zero() {
        super(POINTS);
    }

    public static Zero getInstance() {
        return INSTANCE;
    }
}
