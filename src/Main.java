import de.umass.lastfm.Authenticator;
import de.umass.lastfm.Session;
import de.umass.lastfm.Track;
import de.umass.lastfm.scrobble.ScrobbleResult;

public class Main
{
    public static void main  (String args[])
    {
        System.out.print("Teste");

        String user = "fuckpresidents";
        String password = "lalalathing";
        String key = "a";
        String secret = "a";

        Session session = Authenticator.getMobileSession(user, password, key, secret);

        int now = (int) (System.currentTimeMillis() / 1000);
        ScrobbleResult result = Track.scrobble("Pixies", "Allison", now, session);
        System.out.println("ok: " + (result.isSuccessful() && !result.isIgnored()));
    }
}