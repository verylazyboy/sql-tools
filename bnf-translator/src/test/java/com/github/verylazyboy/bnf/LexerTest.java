package com.github.verylazyboy.bnf;


import com.github.verylazyboy.bnf.lexer.Lexer;
import com.github.verylazyboy.bnf.lexer.LexerException;
import com.github.verylazyboy.bnf.node.TBlank;
import com.github.verylazyboy.bnf.node.TIdentifier;
import com.github.verylazyboy.bnf.node.TMultilineComment;
import com.github.verylazyboy.bnf.node.TOnelineComment;
import com.github.verylazyboy.bnf.node.Token;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import org.junit.Test;

/**
 *
 * @author hbui
 */
public class LexerTest extends TestCase{

	@Test
	public void testOnlineComment() throws LexerException, IOException
	{
		Lexer l = new Lexer(
				new PushbackReader(new StringReader("--xxxxxx\n -- yyyyyyy\n")));
		
		Token next = l.next();
		assertTrue(next instanceof TOnelineComment);
		
		next = l.next();
		System.out.println(">>>>" + next.getClass().getName() + "<<<<");
		assertTrue(next instanceof TBlank);

		next = l.next();
		System.out.println(">>>>" + next.getClass().getName() + "<<<<");
		assertTrue(next instanceof TOnelineComment);
	}

	@Test
	public void testMultilineComment() throws LexerException, IOException{
		String testString = "--p\n" // begin
			+ "xxxxxxxxxxxx\n"
			+ "--ppxxxxyyyyyyyyyyyyy\\x"	
			+ "\n--/p\n" // end
		;
		System.out.println(">>>>>>>>>" + testString + "<<<<<<<<<");
		Lexer l = new Lexer(new PushbackReader(new StringReader(testString)));
		Token next = l.next();
		System.out.println(next.getClass().getName()+ ">>>>>" + next.getText() + "<<<<<");
		assertTrue(next instanceof TMultilineComment);
	}

	@Test
	public void testMultilineComment2() throws LexerException, IOException{
		String testString = "--p\n" // begin
			+ "\n\n\n\n\n"
			+ "\n--/p\n" // end
		;
		System.out.println(">>>>>>>>>" + testString + "<<<<<<<<<");
		Lexer l = new Lexer(new PushbackReader(new StringReader(testString)));
		Token next = l.next();
		System.out.println(next.getClass().getName()+ ">>>>>" + next.getText() + "<<<<<");
		assertTrue(next instanceof TMultilineComment);
	}
	
@Test
	public void testMultilineComment3() throws LexerException, IOException{
		String testString = "--p     \n--i\n" // begin
			+ "--\\i\n--/p\n" // end
		;
		System.out.println(">>>>>>>>>" + testString + "<<<<<<<<<");
		Lexer l = new Lexer(new PushbackReader(new StringReader(testString)));
		Token next = l.next();
		System.out.println(next.getClass().getName()+ ">>>>>" + next.getText() + "<<<<<");
		assertTrue(next instanceof TMultilineComment);
	}

	
	@Test
	public void testIdentifier() throws LexerException, IOException
	{
		String testString = "-- comment\n <aaaa> <aa bb><aaa bb >";
		Lexer l = new Lexer(
				new PushbackReader(new StringReader(testString)));
		Token next = l.next();
		assertTrue(next instanceof TOnelineComment);
		
		next = l.next();
		System.out.println(">>>>" + next.getClass().getName() + "<<<<");
		assertTrue(next instanceof TBlank);

		next = l.next();
		System.out.println(">>>>" + next.getClass().getName() + "<<<<");
		assertTrue(next instanceof TIdentifier);
		
		next = l.next();
		System.out.println(">>>>" + next.getClass().getName() + "<<<<");
		assertTrue(next instanceof TBlank);
		
		next = l.next();
		System.out.println(">>>>" + next.getClass().getName() + "<<<<");
		assertTrue(next instanceof TIdentifier);

		try{
			l.next();
			l.next();
			fail("expected here a LexerException");
		}catch (LexerException ex){
			System.out.println(ex);
		}
	}

	@Test
	public void testTransition() throws LexerException, IOException
	{
		String testString = "<y>";
		PrintStateLexer l = 
				new PrintStateLexer(new PushbackReader(new StringReader(testString)));
		Token next;
		next = l.next();
		System.out.println(next.getClass().getName());
		System.out.println(l.getState().id());
		System.out.println();
		/*
		next = l.next();
		System.out.println(next.getClass().getName());
		System.out.println(l.getState().id());
		System.out.println();
		
		next = l.next();
		System.out.println(next.getClass().getName());
		System.out.println(l.getState().id());
		System.out.println();
		
		next = l.next();
		System.out.println(next.getClass().getName());
		System.out.println(l.getState().id());
		System.out.println();
		*/
	}
}