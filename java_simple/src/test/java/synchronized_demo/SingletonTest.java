package synchronized_demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void getUniqueInstance() {
        assertSame(Singleton.getUniqueInstance(), Singleton.getUniqueInstance());
    }

}