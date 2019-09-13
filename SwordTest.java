package blacksmith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwordTest {
	Sword a,b,c ;
	// TODO Create Sword for each test case for more convenient
	@BeforeEach
	void setUp() throws Exception {
		a = new Sword(5,1);
		b = new Sword(-1,-2);
		c = new Sword(10, 3);
	}

	// TODO Test Sword constructor
	@Test
	void testSword() {
		assertEquals(5, a.getAttack());
		assertEquals(1, a.getDurability());
	}

	// TODO Test Sword constructor with negative attack
	@Test
	void testSwordNegativeAttack() {
		assertEquals(0, b.getAttack());		
	}
	
	// TODO Test Sword constructor with negative durability
	@Test
	void testSwordNegativeDurability() {
		assertEquals(1, b.getDurability());
	}

	// TODO Test upgrade()
	@Test
	void testUpgrade() {
		a.upgrade(3);
		assertEquals(8, a.getAttack());
		assertEquals(2, a.getDurability());
	}

	// TODO Test upgrade() with negative value
	@Test
	void testUpgradeNegative() {
		a.upgrade(-1);
		assertEquals(5, a.getAttack());
		assertEquals(2, a.getDurability());
	}

	// TODO Test doParry()
	@Test
	void testDoParry() {
		assertEquals(5 , a.doParry(10));
		assertEquals(0, a.getDurability());
	}

	// TODO Test doParry() with non positive attack
	@Test
	void testDoParryNonPositiveAttack() {
		assertEquals(0 , a.doParry(-10));
		assertEquals(0, a.getDurability());
		
	}

	// TODO Test doParry() with attack <= Sword's attack ( fully parried )
	@Test
	void testDoParryFullyParried() {
		assertEquals(0 , a.doParry(1));
		assertEquals(0, a.getDurability());
	}

	// TODO Test isBroken()
	@Test
	void testIsBroken() {
		a.doParry(10);
		c.doParry(3);
		b.doParry(1);
		assertTrue(a.isBroken());
		assertFalse(c.isBroken());
		assertTrue(b.isBroken());
	}

}
