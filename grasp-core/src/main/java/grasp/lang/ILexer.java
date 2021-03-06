/**
 * Interface for the lexer component of the Grasp compiler.
 * 
 * @author		Lakshitha de Silva
 * 
 * @version		1.00, 2011/02/22
 *  	
 * @since		1.00
 * 
 */

package grasp.lang;

import common.error.IErrorReport;


public interface ILexer {
	IErrorReport errors();
	Object readToken();
}
