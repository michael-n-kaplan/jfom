package org.earthsystemmodeling.model;

import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.cdt.core.model.ISourceRange;
import org.eclipse.cdt.core.model.ISourceReference;
import org.eclipse.cdt.core.model.ITranslationUnit;

public class SourceReference implements ISourceReference {

	private ISourceRange sourceRange;
	
	public int getIndex() {
		return 0;
	}

	public String getSource() throws CModelException {
		return null;
	}

	public ISourceRange getSourceRange() throws CModelException {
		return sourceRange;
	}
	
	public void setSourceRange(ISourceRange sr) {
		this.sourceRange = sr;
	}

	public ITranslationUnit getTranslationUnit() {
		return null;
	}

	public boolean isActive() {
		return false;
	}

}
