package lazyj.mail.comparators;


import java.io.Serializable;
import java.util.Comparator;

import lazyj.mail.MailHeader;

/**
 * A MailHeader comparator that sorts the mails by the source email address.
 * 
 * @author costing
 * @since 2006-10-13
 */
public class AddressComparator implements Comparator<MailHeader>, Serializable {
	/**
	 * nothing
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Sorting method : by the source email address 
	 * 
	 * @param o1 first mail
	 * @param o2 second mail
	 * @return source emails compared result (as strings in lower case)
	 */
	@Override
	public int compare(final MailHeader o1, final MailHeader o2) {
		final String s1 = o1.sFrom.trim();
		final String s2 = o2.sFrom.trim();

		return (-1) * s1.compareToIgnoreCase(s2);
	}
}
