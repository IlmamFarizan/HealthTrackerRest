package ie.setu.config

import org.jetbrains.exposed.sql.Database
import mu.KotlinLogging

class DbConfig{

    fun getDbConnection() :Database{

        val logger = KotlinLogging.logger {}
        logger.info{"Starting DB Connection..."}

        //Change Credentials To My Own From ElephantSQL
        val PGUSER = "irzbefvo"
        val PGPASSWORD = "v9IBw2xzIrhS4G8TodX3OkaEE272XBNR"
        val PGHOST = "mel.db.elephantsql.com"
        val PGPORT = "5432"
        val PGDATABASE = "irzbefvo"

        //url format should be jdbc:postgresql://host:port/database
        val url = "jdbc:postgresql://$PGHOST:$PGPORT/$PGDATABASE"

        val dbConfig = Database.connect(url,
            driver="org.postgresql.Driver",
            user = PGUSER,
            password = PGPASSWORD
        )

        logger.info{"db url - connection: " + dbConfig.url}

        return dbConfig
    }

}