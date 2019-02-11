package com.github.adnansm.timelytextview.model.number;

import com.github.adnansm.timelytextview.model.core.Figure;

public class Four extends Figure {
    private static final float[][] POINTS = {
		{ 0.65395284f , 0.4407312f }, 
		{ 0.63485956f , 0.374725f }, 
		{ 0.56737816f , 0.32706016f }, 
		{ 0.49879205f , 0.33081707f }, 
	//	{ 0.49084607f , 0.32915172f }, 
		{ 0.26861203f , 0.3481917f }, 
		{ 0.3040639f , 0.691418f }, 
		{ 0.5128514f , 0.6738901f }, 
	//	{ 0.50915396f , 0.6638901f }, 
		{ 0.5745431f , 0.6657202f }, 
		{ 0.63905543f , 0.6209641f }, 
		{ 0.66061724f , 0.5573068f }, 
	//	{ 0.6622746f , 0.5573068f }, 
		{ 0.5858563f , 0.6972188f }, 
		{ 0.49424866f , 0.8423982f }, 
		{ 0.4013412f , 0.9819751f }, 
	//  Not used/ disappear
		{ 0.4013412f , 0.9819751f }, 
		{ 0.4013412f , 0.9819751f }, 
		{ 0.4013412f , 0.9819751f }, 
		
    };

    private static Four INSTANCE = new Four();

    protected Four() {
        super(POINTS);
    }

    public static Four getInstance() {
        return INSTANCE;
    }
}
