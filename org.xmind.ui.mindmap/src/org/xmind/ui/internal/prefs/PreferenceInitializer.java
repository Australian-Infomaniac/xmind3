/* ******************************************************************************
 * Copyright (c) 2006-2012 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package org.xmind.ui.internal.prefs;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.xmind.ui.internal.MindMapUIPlugin;
import org.xmind.ui.internal.mindmap.UndoRedoTipsService;
import org.xmind.ui.prefs.PrefConstants;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

    private static final String DEFAULT_DND_CLIENT_ID_ORDER = "org.xmind.ui.dnd.workbookComponent org.xmind.ui.dnd.image org.xmind.ui.dnd.file org.xmind.ui.dnd.url org.xmind.ui.dnd.text"; //$NON-NLS-1$

    public void initializeDefaultPreferences() {
        IScopeContext context = DefaultScope.INSTANCE;
        IEclipsePreferences node = context.getNode(MindMapUIPlugin.getDefault()
                .getBundle().getSymbolicName());
        node.putBoolean(PrefConstants.ANIMATION_ENABLED, false);
        node.putBoolean(PrefConstants.SHADOW_ENABLED, false);
        node.putBoolean(PrefConstants.OVERLAPS_ALLOWED, false);
        node.putBoolean(PrefConstants.FREE_POSITION_ALLOWED, true);
        node.put(PrefConstants.DND_CLIENT_ID_ORDER, DEFAULT_DND_CLIENT_ID_ORDER);
        node.putInt(PrefConstants.UNDO_LIMIT, 100);

        node.putBoolean(PrefConstants.GRADIENT_COLOR, true);

        node.putBoolean(PrefConstants.UNDO_REDO_TIPS_ENABLED, true);

        node.putInt(PrefConstants.UNDO_REDO_TIPS_FADE_DELAY,
                UndoRedoTipsService.DEFAULT_DURATION);

        node.putInt(PrefConstants.MAX_REVISION_NUMBER, 30);
        node.putInt(PrefConstants.MAX_REVISION_NUMBER_PER_DAY, 5);
    }

}