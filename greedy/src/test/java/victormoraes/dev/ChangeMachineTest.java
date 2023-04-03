package victormoraes.dev;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ChangeMachineTest {

    @Test
    public void given50AmountShouldReturnTwoCoinsOf25() {
        ArrayList<Integer> minCoins = ChangeMachine.getMinCoins(50);

        assertEquals(2, minCoins.size());
        assertAll(
                () -> assertEquals(25, minCoins.get(0)),
                () -> assertEquals(25, minCoins.get(1))
        );
    }

    @Test
    public void givenAnAmountGreaterThan25AndLessThan50ShouldReturnOneCoinOf25() {
        ArrayList<Integer> minCoins = ChangeMachine.getMinCoins(26);

        assertEquals(2, minCoins.size());
        assertAll(
                () -> assertEquals(25, minCoins.get(0)),
                () -> assertEquals(1, minCoins.get(1))
        );
    }

    @Test
    public void given30AmountShouldReturnOneCoinOf25AndOtherOf5() {
        ArrayList<Integer> minCoins = ChangeMachine.getMinCoins(30);

        assertEquals(2, minCoins.size());
        assertAll(
                () -> assertEquals(25, minCoins.get(0)),
                () -> assertEquals(5, minCoins.get(1))
        );
    }
}