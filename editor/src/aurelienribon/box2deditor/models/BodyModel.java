package aurelienribon.box2deditor.models;

import aurelienribon.box2deditor.utils.VectorUtils;
import com.badlogic.gdx.math.Vector2;

public class BodyModel {
	public static final BodyModel EMPTY = new BodyModel() {
		@Override public void set(Vector2[][] shapes, Vector2[][] polygons) {}
	};

	// -------------------------------------------------------------------------

	private Vector2[][] shapes;
	private Vector2[][] polygons;

	public void clearAll() {
		shapes = null;
		polygons = null;
	}

	public void set(Vector2[][] shapes, Vector2[][] polygons) {
		clearAll();
		this.shapes = VectorUtils.getCopy(shapes);
		this.polygons = VectorUtils.getCopy(polygons);
	}

	public Vector2[][] getShapes() {
		return VectorUtils.getCopy(shapes);
	}

	public Vector2[][] getPolygons() {
		return VectorUtils.getCopy(polygons);
	}
}
