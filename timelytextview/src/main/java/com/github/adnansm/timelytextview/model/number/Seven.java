package com.github.adnansm.timelytextview.model.number;

import com.github.adnansm.timelytextview.model.core.Figure;

public class Seven extends Figure {
    private static final float[][] POINTS = {
		
		{ 0.62399447f , 0.94533706f }, 
		{ 0.5943455f , 0.9841127f }, 
		{ 0.4958639f , 0.9731432f }, 
		{ 0.49249654f , 0.9136951f }, 
	//	{ 0.48113877f , 0.91022485f }, 
		{ 0.48839193f , 0.8388285f }, 
		{ 0.55002975f , 0.7971911f }, 
		{ 0.5857351f , 0.73409444f }, 
	//	{ 0.56407773f , 0.72051257f }, 
		{ 0.6288827f , 0.66653216f }, 
		{ 0.66811794f , 0.5844907f }, 
		{ 0.66560334f , 0.5006844f }, 
	//	{ 0.668932f , 0.48403063f }, 
		{ 0.6250636f , 0.2363474f }, 
		{ 0.29555553f , 0.32232907f }, 
		{ 0.33227998f , 0.5423185f }, 
		//
		{ 0.33227998f , 0.5423185f },
		{ 0.33227998f , 0.5423185f },
		{ 0.33227998f , 0.5423185f },
		
	};

    private static Seven INSTANCE = new Seven();

    protected Seven() {
        super(POINTS);
    }

    public static Seven getInstance() {
        return INSTANCE;
    }
}
