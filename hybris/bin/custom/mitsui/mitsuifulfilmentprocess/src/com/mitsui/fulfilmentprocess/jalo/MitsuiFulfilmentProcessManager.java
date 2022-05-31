/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.mitsui.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.mitsui.fulfilmentprocess.constants.MitsuiFulfilmentProcessConstants;

public class MitsuiFulfilmentProcessManager extends GeneratedMitsuiFulfilmentProcessManager
{
	public static final MitsuiFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MitsuiFulfilmentProcessManager) em.getExtension(MitsuiFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
