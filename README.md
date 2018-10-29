# lczero-test-server

This is the server program of the Lczero test project.

It is the brains of the operation and is more complex then the worker program that users run.

Will maintain a list of active tests submitted by project administrators.
Will have a table of games that have to be played out for each test. 
As available workers request game task will hand out work and keep track completed or incompleted games.

Will have scheduled jobs to summarize test results and save them to database.
Will provide a GUI to project administrators and public displaying results and progress of various tests.
(The GUI may be in it's own repo but for simplicity keeping it in this one for now.)

SSL termination will be provided by nginx reverse proxy.

Postgres will be the database backend and communication with workers over REST.


##Dev plans:
###Get to a simplest possible working implementation (MVP)

(These three controller methods should read/write to DB)
 - getTestConfig returns info how to download correct binary for the test (read it from DB)
 - newGame can return games to play to client based on TestConfig (From DB)
 - submitGame can accept info about played game and store it in DB.

(Start on UI using SpringMVC)
 - Input screen for entering a Test configuration.
 - Input screen for entering a User
 - Build a few html views that show list of Tests and list of all games. View game page for game detail.
