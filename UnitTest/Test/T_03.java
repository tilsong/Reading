import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T_03 {

	@Test
	@DisplayName("test1111")
	void t1() {
		assertTrue(true);
	}

	// 예외 기대 시 테스트 방식

	// JUnit4
	// @Test(expected=NullPointerException.class)
	// public void DetailWithNotExisted(){
	// 	String hi = null;
	// 	hi.length(); //NullPointerException 발생
	// }

	//JUnit5
	@Test
	public void DetailWithNotExisted(){
		String hi = null;
		assertThrows(NullPointerException.class, () -> {
			hi.length(); //NullPointerException 발생
		});
	}
}
