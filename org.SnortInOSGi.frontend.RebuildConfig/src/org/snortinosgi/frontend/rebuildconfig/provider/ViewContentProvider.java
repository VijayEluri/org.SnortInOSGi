/**
 * @author Andrej Frank, Copyright GNU GPL 2.0
 * TAE, Brunel University West London, University of Applied Science Esslingen
 *
 */
package org.snortinosgi.frontend.rebuildconfig.provider;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.snortinosgi.frontend.rebuildconfig.model.TreeObject;
import org.snortinosgi.frontend.rebuildconfig.model.TreeParent;

/**
 *
 */
public class ViewContentProvider implements IStructuredContentProvider,
		ITreeContentProvider {

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
	}

	public void dispose() {
	}

	public Object[] getElements(Object parent) {
		return getChildren(parent);
	}

	public Object getParent(Object child) {
		if (child instanceof TreeObject) {
			return ((TreeObject) child).getParent();
		}
		return null;
	}

	public Object[] getChildren(Object parent) {
		if (parent instanceof TreeParent) {
			return ((TreeParent) parent).getChildren();
		}
		return new Object[0];
	}

	public boolean hasChildren(Object parent) {
		if (parent instanceof TreeParent)
			return ((TreeParent) parent).hasChildren();
		return false;
	}
}
