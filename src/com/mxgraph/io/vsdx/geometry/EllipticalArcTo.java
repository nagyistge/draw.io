package com.mxgraph.io.vsdx.geometry;

public class EllipticalArcTo extends Row 
{
	public EllipticalArcTo(int index, Double x, Double y, Double a, Double b, Double c, Double d) 
	{
		super(index, x, y);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public void handle() 
	{
		
	}

}
