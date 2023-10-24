package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCharacter {

	@Test
	void testCreateHuman() {
		Character human = new Human();
		assertTrue(human.getHitPoints() == 10);
	}
	
	@Test
	void testCreateOrc() {
		Character orc = new Orc();
		assertTrue(orc.getHitPoints() == 50);
		
	}
	
	@Test
	void testCreateCharacter() {
		Character character = new Character();
		assertTrue(character.getHitPoints() == 0);
		assertFalse(character.getHitPoints() == 1);
	}
	
	@Test
	void testAttack() {
		// Expected damage 5
		int expected = 95;
		Character human = new Human();
		Character orc = new Orc();
		
		human.attack(orc);
		assertTrue(orc.getHealth() == expected);
	}

}
