package com.github.adnansm.timelytextview.model.number;

import com.github.adnansm.timelytextview.model.core.Figure;

public class Two extends Figure {
    private static final float[][] POINTS = {
		
		{ 0.33772537f , 0.8354228f }, 
		{ 0.33825776f , 0.9233273f }, 
		{ 0.4253304f , 0.98285943f }, 
		{ 0.5058253f , 0.9836404f }, 
	//	{ 0.49750343f , 0.9836404f }, 
		{ 0.5849844f , 0.98933786f }, 
		{ 0.66620237f , 0.91598666f }, 
		{ 0.66560334f , 0.82876134f }, 
		
	//	{ 0.6622746f , 0.8304268f }, 
		{ 0.66560334f , 0.749129f }, 
		{ 0.66560334f , 0.6672524f }, 
		{ 0.66560334f , 0.58561796f }, 
	//	{ 0.6472955f , 0.5623028f }, 
		{ 0.66560334f , 0.49499166f }, 
		{ 0.66560334f , 0.4056622f }, 
		{ 0.66560334f , 0.33081707f }, 
		
		{ 0.66560334f , 0.33081707f }, 
		{ 0.66560334f , 0.33081707f }, 
		{ 0.66560334f , 0.33081707f }, 
		
	};

    private static Two INSTANCE = new Two();

    protected Two() {
        super(POINTS);
    }

    public static Two getInstance() {
        return INSTANCE;
    }
}
