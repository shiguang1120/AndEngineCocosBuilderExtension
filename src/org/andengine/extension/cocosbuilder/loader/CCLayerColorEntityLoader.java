package org.andengine.extension.cocosbuilder.loader;

import java.io.IOException;

import org.andengine.entity.IEntity;
import org.andengine.extension.cocosbuilder.CCBEntityLoaderDataSource;
import org.andengine.extension.cocosbuilder.entity.CCLayerColor;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.xml.sax.Attributes;


/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 18:53:12 - 23.04.2012
 */
public class CCLayerColorEntityLoader extends CCNodeEntityLoader {
	// ===========================================================
	// Constants
	// ===========================================================

	private static final String ENTITY_NAMES = "CCLayerColor";

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public CCLayerColorEntityLoader() {
		super(CCLayerColorEntityLoader.ENTITY_NAMES);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected IEntity createEntity(String pEntityName, float pX, float pY, float pWidth, float pHeight, Attributes pAttributes, CCBEntityLoaderDataSource pCCBEntityLoaderDataSource) throws IOException {
		final VertexBufferObjectManager vertexBufferObjectManager = pCCBEntityLoaderDataSource.getVertexBufferObjectManager();

		return new CCLayerColor(pX, pY, pWidth, pHeight, vertexBufferObjectManager);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
