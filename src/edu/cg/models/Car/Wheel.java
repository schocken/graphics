package edu.cg.models.Car;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

import edu.cg.models.IRenderable;

public class Wheel implements IRenderable {

	@Override
	public void render(GL2 gl) {
	    GLU glu = new GLU();
	    GLUquadric quad = glu.gluNewQuadric();

	    Materials.setMaterialTire(gl);
	    // Build Cylinder
	    gl.glPushMatrix();
	    gl.glTranslated(0.0D, 0.0D, -0.05D);
	    glu.gluCylinder(quad, Specification.TIRE_OUT_RADIUS, Specification.TIRE_OUT_RADIUS, Specification.TIRE_DEPTH, 50, 1);
	    gl.glRotated(180.0D, 1.0D, 0.0D, 0.0D);

	    // Outer Disk
	    glu.gluDisk(quad, Specification.TIRE_IN_RADIUS, Specification.TIRE_OUT_RADIUS, 50, 1);
	    gl.glRotated(180.0D, 1.0D, 0.0D, 0.0D);
	    gl.glTranslated(0.0D, 0.0D, 0.1D);
	    glu.gluDisk(quad, Specification.TIRE_IN_RADIUS, Specification.TIRE_OUT_RADIUS, 50, 1);

	    // Inner Disk
	    Materials.setMaterialRims(gl);
	    glu.gluDisk(quad, 0.0D, Specification.TIRE_IN_RADIUS, 50, 1);
	    gl.glTranslated(0.0D, 0.0D, -0.1D);
	    gl.glRotated(180.0D, 1.0D, 0.0D, 0.0D);
	    glu.gluDisk(quad, 0.0D, Specification.TIRE_IN_RADIUS, 20, 1);

	    gl.glPopMatrix();
	    glu.gluDeleteQuadric(quad);
	}

	@Override
	public void init(GL2 gl) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return "Wheel";
	}

}
