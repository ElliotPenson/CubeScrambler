/**
 * Cube.java
 * 
 * @author Elliot Penson
 */

package cube;

import java.awt.Color;

public class Cube {

	private Side uFace;
	private Side dFace;
	private Side lFace;
	private Side rFace;
	private Side fFace;
	private Side bFace;

	/**
	 * Constructor. Sets up the cube using generic color scheme with white
	 * on the F face, and blue on the U face.
	 */
	public Cube() {
		uFace = new Side(Color.blue);
		dFace = new Side(Color.green);
		lFace = new Side(Color.orange);
		rFace = new Side(Color.red);
		fFace = new Side(Color.white);
		bFace = new Side(Color.yellow);
	}

	/**
	 * Performs a clockwise turn of the front face
	 */
	public void fTurn() {
		fFace.rotateStickers();
		Color[] uBuffer = uFace.getRow(2);
		uFace.setRow(2, lFace.getColumn(2));
		lFace.setColumn(2, dFace.getRow(0));
		dFace.setRow(0, rFace.getColumn(0));
		rFace.setColumn(0, uBuffer);
	}

	/**
	 * Performs a clockwise turn of the back face
	 */
	public void bTurn() {
		bFace.rotateStickers();
		Color[] uBuffer = uFace.getRow(0);
		uFace.setRow(0, rFace.getColumn(2));
		rFace.setColumn(2, dFace.getRow(2));
		dFace.setRow(2, lFace.getColumn(2));
		lFace.setColumn(2, uBuffer);
	}

	/**
	 * Performs a clockwise turn of the up face
	 */
	public void uTurn() {
		uFace.rotateStickers();
		Color[] bBuffer = bFace.getRow(0);
		bFace.setRow(0, lFace.getRow(0));
		lFace.setRow(0, fFace.getRow(0));
		fFace.setRow(0, rFace.getRow(0));
		rFace.setRow(0, bBuffer);
	}

	/**
	 * Performs a clockwise turn of the down face
	 */
	public void dTurn() {
		dFace.rotateStickers();
		Color[] fBuffer = fFace.getRow(2);
		fFace.setRow(2, lFace.getRow(2));
		lFace.setRow(2, fFace.getRow(2));
		bFace.setRow(2, rFace.getRow(2));
		rFace.setRow(2, fBuffer);
	}

	/**
	 * Performs a clockwise turn of the left face
	 */
	public void lTurn() {
		lFace.rotateStickers();
		Color[] uBuffer = uFace.getColumn(0);
		uFace.setColumn(0, bFace.getColumn(2));
		bFace.setColumn(2, dFace.getColumn(0));
		dFace.setColumn(0, fFace.getColumn(0));
		fFace.setColumn(0, uBuffer);
	}

	/**
	 * Performs a clockwise turn of the right face
	 */
	public void rTurn() {
		rFace.rotateStickers();
		Color[] uBuffer = uFace.getColumn(2);
		uFace.setColumn(2, fFace.getColumn(2));
		fFace.setColumn(2, dFace.getColumn(2));
		dFace.setColumn(2, bFace.getColumn(0));
		bFace.setColumn(0, uBuffer);
	}
}
