package edu.cg.models.Car;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

import edu.cg.models.IRenderable;

public class PairOfWheels implements IRenderable {
	// TODO: Use the wheel field to render the two wheels.
	private final Wheel wheel = new Wheel();
	
	@Override
	public void render(GL2 gl) {
	    gl.glPushMatrix();
	    gl.glTranslated(0.0D, 0.0D, -0.1D);
	    GLU glu = new GLU();
	    Materials.SetDarkGreyMetalMaterial(gl);
	    GLUquadric quad = glu.gluNewQuadric();
	    glu.gluCylinder(quad, Specification.PAIR_OF_WHEELS_ROD_RADIUS, Specification.PAIR_OF_WHEELS_ROD_RADIUS, Specification.PAIR_OF_WHEELS_ROD_DEPTH, 20, 1);
	    gl.glTranslated(0.0D, 0.0D, 0.24);
	    this.wheel.render(gl);
	    gl.glTranslated(0.0D, 0.0D, -0.28D);
	    gl.glRotated(180.0D, 0.0D, 1.0D, 0.0D);
	    this.wheel.render(gl);
	    gl.glPopMatrix();
	    glu.gluDeleteQuadric(quad);
	}

	@Override
	public void init(GL2 gl) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "PairOfWheels";
	}

}
