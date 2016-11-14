package controler;

import data.Guild;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.GuildLeaveEvent;

/**
 * Created by steve on 14/07/2016.
 */
public class GuildLeaveListener {

    private final static Logger LOG = LoggerFactory.getLogger(GuildLeaveListener.class);

    public GuildLeaveListener(){
        super();
    }

        @EventSubscriber
        public void onReady(GuildLeaveEvent event) {
            Guild.getGuilds().get(event.getGuild().getID()).removeToDatabase();
        }
}
