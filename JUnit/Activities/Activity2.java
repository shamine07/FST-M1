import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class Activity2 {

	/**public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(100);
		bankAccount.withdraw(105);
	**/
	
	@Test
	public void testNotEnoughFunds() {
		BankAccount bankAccount = new BankAccount(10);
		assertThrows(NotEnoughFundsException.class, ()-> bankAccount.withdraw(11));
	
	}
	
	@Test
	public void testEnoughFunds() {
		BankAccount bankAccount = new BankAccount(10);
		assertDoesNotThrow(()-> bankAccount.withdraw(5));
	}

}
