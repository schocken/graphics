package edu.cg.models.Car;

import com.jogamp.opengl.*;

import edu.cg.models.IRenderable;

/**
 * A F1 Racing Car.
 *
 */
public class F1Car implements IRenderable {

	@Override
	public void render(GL2 gl) {
		// TODO: Render the whole car. 
		//       Here You should only render the three parts: back, center and front.
	    new Center().render(gl);
	    gl.glPushMatrix();
	    gl.glTranslated(-0.3875D, 0.0D, 0.0D);
	    new Back().render(gl);
	    gl.glPopMatrix();
	    gl.glPushMatrix();
	    gl.glTranslated(0.425D, 0.0D, 0.0D);
	    new Front().render(gl);
	    gl.glPopMatrix();
	}

	@Override
	public String toString() {
		return "F1Car";
	}

	@Override
	public void init(GL2 gl) {

	}
}
