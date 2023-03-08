import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iloveyouboss.ScoreCollection;

class Test001 {

	@Test
	void hello() {
		Main m = new Main();
		assertEquals("hello", m.hello());
	}

	@Test
	void Hi() {
		Main m = new Main();

		assertEquals(m.hi(), "hello");

		IllegalStateException e = assertThrows(IllegalStateException.class, () -> m.hi());

		assertEquals(e.getMessage(), "MORE CALLED");
	}

	@Test
	void for001() {
		// 준비
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 7);

		// 실행
		int actualResult = collection.arithmeticMean();

		// 단언
		assertEquals(actualResult, 6);
	}
}