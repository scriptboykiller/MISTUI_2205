/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.mitsui.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.mitsui.core.constants.MitsuiCoreConstants;
import com.mitsui.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class MitsuiCoreManager extends GeneratedMitsuiCoreManager
{
	public static final MitsuiCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MitsuiCoreManager) em.getExtension(MitsuiCoreConstants.EXTENSIONNAME);
	}
}
