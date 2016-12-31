/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.greenhouse;

import forestry.api.climate.IClimateInfo;

public interface IOvergrowth {
	
	IClimateInfo getMinClimate();
	
	IClimateInfo getMaxClimate();
	
	float getChance();

}