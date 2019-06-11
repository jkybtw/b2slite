/*
 * Copyright (c) 2019, Jacky <liangj97@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.TOB;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("tob")
public interface TobConfig extends Config
{
	@ConfigItem(
		position = 0,
		keyName = "showMaidenPools",
		name = "Maiden Pools",
		description = "Displays maidens pool"
	)
	default boolean showMaidenPools()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "maidenPoolColor",
		name = "Maiden Pool Color",
		description = "Configures the color for Maiden pools"
	)
	default Color maidenColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
		position = 2,
		keyName = "showBloatDrops",
		name = "Bloat Drops",
		description = "Highlights falling objects in bloat"
	)
	default boolean showFallingObjects()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "bloatColor",
		name = "Bloat Feet Color",
		description = "Configures the color for falling feet"
	)
	default Color bloatColor()
	{
		return Color.WHITE;
	}

}