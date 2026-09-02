import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;


public class DummyTest {
    @Test
    void shouldReturnTrue() {
        MockableDummy mockableDummy = mock(MockableDummy.class);
        when(mockableDummy.returnTrue()).thenReturn(true);
        Dummy dummy = new Dummy(mockableDummy);
        boolean result = dummy.returnTrue();
        assertTrue(result);
        verify(mockableDummy).returnTrue();
    }
}
