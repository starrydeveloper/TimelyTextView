package com.github.adnansm.timelytextview.model.number;

import com.github.adnansm.timelytextview.model.core.Figure;

public class One extends Figure {
    private static final float[][] POINTS = {
		
		{ 0.34105408f , 0.5556414f }, 
		{ 0.36433932f , 0.62164116f }, 
		{ 0.43303588f , 0.65991366f }, 
		{ 0.49916783f , 0.660221f }, 
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
	//	{ 0.48585305f , 0.31915954f }, 
		{ 0.42510728f , 0.32550562f }, 
		{ 0.36111876f , 0.370362f }, 
		{ 0.34271848f , 0.43906584f }, 
		
		
		
    };

    private static One INSTANCE = new One();

    protected One() {
        super(POINTS);
    }

    public static One getInstance() {
        return INSTANCE;
    }
}
