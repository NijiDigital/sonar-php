/*
 * SonarQube PHP Plugin
 * Copyright (C) 2010-2018 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.sonar.php.cfg;

import com.google.common.collect.ImmutableSet;
import java.util.Map;
import org.sonar.plugins.php.api.tree.Tree;


/**
 * The end node of a {@link ControlFlowGraph}.
 */
class PhpCfgEndBlock extends PhpCfgBlock {

  @Override
  public ImmutableSet<CfgBlock> successors() {
    return ImmutableSet.of();
  }

  @Override
  public void addElement(Tree element) {
    throw new UnsupportedOperationException("Cannot add element to end block");
  }

  @Override
  public void replaceSuccessors(Map<PhpCfgBlock, PhpCfgBlock> replacements) {
    throw new UnsupportedOperationException("Cannot replace successors of end block");
  }
}