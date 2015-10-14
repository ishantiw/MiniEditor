/**
 * @author Ishan Tiwari and Ricardo Ernesto Martinez Ramirez
 *
 * @see MINI TEXT EDITOR
 * @see DSS - M1
 * @see EIT ICT Labs
 * 
 */
package fr.istic.aco.editor.test;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import fr.istic.aco.editor.core.*;
import fr.istic.aco.editor.commands.*;



public class InsertTest {
	
	private Insert insert;
	private MiniEditorEngine minieditor;
	
	private final String insertString = "Bonjour ACO Lab!";
	
	@Before
	public void SetUp() throws Exception {
		minieditor = mock(MiniEditorEngine.class);
		insert =  new Insert(minieditor,insertString);
		
	}

	@Test
	public void test() {
		insert.execute();
		verify(minieditor).editorInsert(insertString);
	}

}