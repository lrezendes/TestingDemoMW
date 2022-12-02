import org.junit.Test;

import java.awt.*;

public class GeomTest {
    @Test
    public void testDist(){
        var p1 = new Point(0,3);
        var p2 = new Point(4,0);
        assert BasicGeom.calcDistance(p1, p2)==5;
    }
}
