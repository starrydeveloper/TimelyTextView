package com.github.adnansm.timelytextview.model.number;

import com.github.adnansm.timelytextview.model.core.Figure;

public class Eight extends Figure {
    private static final float[][] POINTS = {
		
		{ 0.33938977f , 0.50401515f }, 
		{ 0.41476956f , 0.4957169f }, 
		{ 0.46053895f , 0.59459585f }, 
		{ 0.4236848f , 0.65223265f }, 
	//	{ 0.42593625f , 0.6455711f }, 
		{ 0.37090772f , 0.6219902f }, 
		{ 0.3275205f , 0.5638874f }, 
		{ 0.3302537f , 0.5006844f }, 
	//	{ 0.33487958f , 0.4940229f }, 
		{ 0.32820928f , 0.29599762f }, 
		{ 0.66350836f , 0.2723933f }, 
		{ 0.670939f , 0.49735364f }, 
	//	{ 0.668932f , 0.49735364f }, 
		{ 0.67619723f , 0.56404656f }, 
		{ 0.6307099f , 0.6278895f }, 
		{ 0.5523994f , 0.65223265f }, 
		//
		{ 0.5523994f , 0.65223265f },
		{ 0.5523994f , 0.65223265f }, 
		{ 0.5523994f , 0.65223265f }, 
		
    };

    private static Eight INSTANCE = new Eight();

    protected Eight() {
        super(POINTS);
    }

    public static Eight getInstance() {
        return INSTANCE;
    }
}
