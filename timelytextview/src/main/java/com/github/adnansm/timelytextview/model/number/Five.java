package com.github.adnansm.timelytextview.model.number;

import com.github.adnansm.timelytextview.model.core.Figure;

public class Five extends Figure {
    private static final float[][] POINTS = {
		{ 0.35270455f , 0.45405418f }, 
		{ 0.41760287f , 0.47670817f }, 
		{ 0.44299388f , 0.5789612f }, 
		{ 0.3893204f , 0.62225604f }, 
	//	{ 0.39098477f , 0.6272521f }, 
		{ 0.21685386f , 0.4507715f }, 
		{ 0.5339568f , 0.16597477f }, 
		{ 0.6589459f , 0.45405418f }, 
	//	{ 0.663939f , 0.49901894f }, 
		{ 0.66818243f , 0.6210769f }, 
		{ 0.6718548f , 0.7433212f }, 
		{ 0.66560334f , 0.8653995f }, 
	//	{ 0.6573846f , 0.8652964f }, 
		{ 0.6219305f , 1.0001894f }, 
		{ 0.39892605f , 1.0027657f }, 
		{ 0.35101998f , 0.8703955f }, 
		// to disappear
		{ 0.35101998f , 0.8703955f }, 
		{ 0.35101998f , 0.8703955f }, 
		{ 0.35101998f , 0.8703955f }, 
		
	};

    private static Five INSTANCE = new Five();

    protected Five() {
        super(POINTS);
    }

    public static Five getInstance() {
        return INSTANCE;
    }
}
