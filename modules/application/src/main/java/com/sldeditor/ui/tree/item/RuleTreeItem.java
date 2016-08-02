/*
 * SLD Editor - The Open Source Java SLD Editor
 *
 * Copyright (C) 2016, SCISYS UK Limited
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.sldeditor.ui.tree.item;

import javax.swing.tree.DefaultMutableTreeNode;

import org.geotools.styling.Rule;

import com.sldeditor.common.data.SelectedSymbol;
import com.sldeditor.common.localisation.Localisation;
import com.sldeditor.ui.tree.SLDTreeTools;

/**
 * Class that display Rule data within the sld tree structure.
 * 
 * @author Robert Ward (SCISYS)
 */
public class RuleTreeItem implements SLDTreeItemInterface {

    /** The Constant TITLE. */
    private static final String TITLE = Localisation.getString(SLDTreeTools.class, "TreeItem.rule");

    /* (non-Javadoc)
     * @see com.sldeditor.ui.tree.item.SLDTreeItemInterface#getTreeString(java.lang.Object)
     */
    @Override
    public String getTreeString(Object nodeObject) {
        Rule rule = (Rule)nodeObject;

        String name = "";
        if(rule != null)
        {
            if(rule.getName() != null)
            {
                name = rule.getName();
            }
        }

        return String.format("%s : %s", TITLE, name);
    }

    /* (non-Javadoc)
     * @see com.sldeditor.ui.tree.item.SLDTreeItemInterface#itemSelected(javax.swing.tree.DefaultMutableTreeNode, java.lang.Object)
     */
    @Override
    public void itemSelected(DefaultMutableTreeNode node, Object userObject) {
        SelectedSymbol.getInstance().setRule((Rule) userObject);
    }

}
