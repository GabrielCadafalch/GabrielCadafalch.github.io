package playwave.logic;

import java.sql.SQLException;
import playwave.HomeController;
import playwave.dao.database.TrackDao;
import playwave.entities.Track;

public class PlaylistLogic {

    private HomeController homeController;
    private Track track;

    private static PlaylistLogic instance;

    private PlaylistLogic() {
    }

    public static PlaylistLogic getInstance() {
        if (instance == null) {
            instance = new PlaylistLogic();
        }
        return instance;
    }

    public void setHomeController(HomeController homeController) {
        this.homeController = homeController;
    }

    public void setTrackData() throws SQLException {
        homeController.setTrackData();
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) throws SQLException {
        this.track = TrackDao.getInstance().findById(track);;
    }
}
