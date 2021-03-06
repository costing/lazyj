/**
 * 
 */
package lazyj.viewers;

import java.util.Locale;

/**
 * Use this factory to get the appropriate viewer for a file name. 
 * 
 * @author costing
 * @since 15.12.2006
 */
public class Factory {
	/**
	 * Factory to build a viewer for the given file name. It will look at the file extension and select an appropriate viewer for
	 * this file and if 
	 * 
	 * @param sFileName File name including extension
	 * @param o where to read this file from. This object can be either String (a path to the file on the disk) or an InputStream with the contents.
	 * @return an instance of the specialized viewer for this file, or null if there's no viewer that can handle this file
	 */
	public static Viewer getViewer(final String sFileName, final Object o) {
		final String sLowerFileName = sFileName.toLowerCase(Locale.getDefault());

		if (sLowerFileName.endsWith(".doc")) { //$NON-NLS-1$
			return new WordViewer(o);
		}

		if (sLowerFileName.endsWith(".pdf")) { //$NON-NLS-1$
			return new PDFViewer(o);
		}

		if (sLowerFileName.endsWith(".txt")) { //$NON-NLS-1$
			return new TXTViewer(o);
		}

		if (sLowerFileName.endsWith(".rtf")) { //$NON-NLS-1$
			return new RTFViewer(o);
		}

		if (sLowerFileName.endsWith(".html") || sLowerFileName.endsWith(".htm")) { //$NON-NLS-1$ //$NON-NLS-2$
			return new HTMLViewer(o);
		}

		return null;
	}
}
