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
		Back back = new Back();
		Center center = new Center();
		Front front = new Front();

		// render center
		gl.glPushMatrix();
		center.render(gl);

		// render back
		gl.glTranslated((-1) * (Specification.B_LENGTH + Specification.C_BASE_LENGTH) / 2, 0, 0);
		back.render(gl);

		// render front
		gl.glTranslated((Specification.F_FRONT_LENGTH + Specification.B_LENGTH) / 2 + Specification.C_BASE_LENGTH, 0, 0);
		front.render(gl);

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
