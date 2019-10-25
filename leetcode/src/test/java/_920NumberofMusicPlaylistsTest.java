import org.junit.Test;

import static org.junit.Assert.*;

public class _920NumberofMusicPlaylistsTest {

    @Test
    public void numMusicPlaylists() {
        assertEquals(6, new _920NumberofMusicPlaylists().numMusicPlaylists(3, 3, 1));
        assertEquals(6, new _920NumberofMusicPlaylists().numMusicPlaylists(2, 3, 0));
        assertEquals(2, new _920NumberofMusicPlaylists().numMusicPlaylists(2, 3, 1));
        assertEquals(6, new _920NumberofMusicPlaylists().numMusicPlaylists(3, 3, 0));
        assertEquals(36, new _920NumberofMusicPlaylists().numMusicPlaylists(3, 4, 0));
        assertEquals(24, new _920NumberofMusicPlaylists().numMusicPlaylists(4, 4, 0));
        assertEquals(789741546, new _920NumberofMusicPlaylists().numMusicPlaylists(16, 16, 4));
        assertEquals(64612811, new _920NumberofMusicPlaylists().numMusicPlaylists(16, 19, 5));
        assertEquals(76738643, new _920NumberofMusicPlaylists().numMusicPlaylists(16, 19, 13));
        assertEquals(768235597, new _920NumberofMusicPlaylists().numMusicPlaylists(15, 20, 11));
        assertEquals(906368459, new _920NumberofMusicPlaylists().numMusicPlaylists(25, 28, 5));
    }

}