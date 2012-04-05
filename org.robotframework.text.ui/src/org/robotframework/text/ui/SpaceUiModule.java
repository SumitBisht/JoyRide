/*
 * generated by Xtext
 */
package org.robotframework.text.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.robotframework.text.ui.syntaxcoloring.AntlrTokenToAttributeIdMapper;
import org.robotframework.text.ui.syntaxcoloring.SpaceTextHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SpaceUiModule extends org.robotframework.text.ui.AbstractSpaceUiModule {
	public SpaceUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return SpaceTextHighlightingConfiguration.class;
	}

	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return AntlrTokenToAttributeIdMapper.class;
	}
}
