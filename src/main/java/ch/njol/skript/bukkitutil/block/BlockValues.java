/**
 *   This file is part of Skript.
 *
 *  Skript is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Skript is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Skript.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * Copyright 2011-2017 Peter Güttinger and contributors
 */
package ch.njol.skript.bukkitutil.block;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Contains all data block has that is needed for comparisions.
 */
public abstract class BlockValues {
	
	public abstract boolean isDefault();
	
	@Override
	public abstract boolean equals(@Nullable Object other);
	
	@Override
	public abstract int hashCode();
	
}
