package com.github.adnansm.timelytextview.model.number;

import com.github.adnansm.timelytextview.model.core.Figure;

public class Three extends Figure {
    private static final float[][] POINTS = {
		{ 0.34105408f , 0.45072338f }, 
		{ 0.36574176f , 0.38366115f }, 
		{ 0.43010014f , 0.33304837f }, 
		{ 0.50249654f , 0.33248237f }, 
	//	{ 0.50249654f , 0.33248237f }, 
		{ 0.5920012f , 0.33724904f }, 
		{ 0.67038417f , 0.4177285f }, 
		{ 0.6672677f , 0.5073458f }, 
	//	{ 0.66440547f , 0.50568044f }, 
		{ 0.6717175f , 0.6659907f }, 
		{ 0.41919538f , 0.7365601f }, 
		{ 0.35436893f , 0.5706297f }, 
	//	{ 0.36102638f , 0.5872833f }, 
		{ 0.45175126f , 0.7171385f }, 
		{ 0.53644704f , 0.85503286f }, 
		{ 0.6406311f , 0.9786442f }, 
		
	// Not used / only to disappear
		{ 0.6406311f , 0.9786442f }, 
		{ 0.6406311f , 0.9786442f }, 
		{ 0.6406311f , 0.9786442f }, 
	};

    private static Three INSTANCE = new Three();

    protected Three() {
        super(POINTS);
    }

    public static Three getInstance() {
        return INSTANCE;
    }
}
