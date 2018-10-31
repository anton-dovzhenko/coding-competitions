import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anton on 9/7/18.
 */
public class _726NumberofAtomsTest {

    @Test
    public void countOfAtoms() throws Exception {
        System.out.println(new _726NumberofAtoms().countOfAtoms("H2O"));
        System.out.println(new _726NumberofAtoms().countOfAtoms("H2MgO2"));
        System.out.println(new _726NumberofAtoms().countOfAtoms("Mg(OH)2"));
        System.out.println(new _726NumberofAtoms().countOfAtoms("K4(ON(SO3)2)2"));
        System.out.println(new _726NumberofAtoms().countOfAtoms("((N42)24(OB40Li30CHe3O48LiNN26)33(C12Li48N30H13HBe31)21(BHN30Li26BCBe47N40)15(H5)16)14"));
    }

}