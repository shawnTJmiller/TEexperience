BEGIN TRANSACTION;

CREATE TABLE boardgame(
inv_number SERIAL NOT NULL,
name VARCHAR(60) NOT NULL,
min_number_players INT NOT NULL,
max_number_players INT NULL,
min_play_time INT NOT NULL,
max_play_time INT NULL,
recommended_age_min INT NOT NULL,
has_dice VARCHAR(3) NULL,
has_board VARCHAR (3) NULL,
has_cards VARCHAR (3) NULL,
has_tiles VARCHAR (3) NULL,
has_figurines VARCHAR (3) NULL,
CONSTRAINT pk_inv_number PRIMARY KEY (inv_number)
);

CREATE TABLE player(
player_id SERIAL NOT NULL,
first_name VARCHAR (20) NOT NULL,
last_name VARCHAR (20) NULL,
CONSTRAINT pk_player_id PRIMARY KEY (player_id)
);

CREATE TABLE game_played(
played_id SERIAL NOT NULL,
inv_number INT NOT NULL,
date_time DATE NOT NULL,
location VARCHAR (60) NULL,
group VARCHAR (60) NULL
CONSTRAINT pk_game_played_played_id PRIMARY KEY (inv_number, played_id)
);

CREATE TABLE game_played_player(
played_id INT NOT NULL,
inv_number INT NOT NULL,
player_id INT NOT NULL,
place INT NOT NULL,
points INT NULL,
team BOOLEAN NOT NULL,
chose_game BOOLEAN NULL,
CONSTRAINT pk_losses_inv_number_player_id PRIMARY KEY (inv_number, player_id)
);

CREATE TABLE owns_game(
has_game BOOLEAN NOT NULL,
inv_number INT NOT NULL,
player_id INT NOT NULL,
CONSTRAINT pk_owns_game_inv_number_player_id PRIMARY KEY (inv_number, player_id)
);

ALTER TABLE wins ADD FOREIGN KEY(inv_number) REFERENCES boardgames(inv_number);
ALTER TABLE wins ADD FOREIGN KEY(player_id) REFERENCES players(player_id);

ALTER TABLE losses ADD FOREIGN KEY(inv_number) REFERENCES boardgames(inv_number);
ALTER TABLE losses ADD FOREIGN KEY(player_id) REFERENCES players(player_id);

ROLLBACK;
--COMMIT TRANSACTION

INSERT INTO players (first_name, last_name) VALUES ('Shawn', 'Miller');
INSERT INTO players (first_name, last_name) VALUES ('Melissa', 'Miller');
INSERT INTO players (first_name, last_name) VALUES ('Dominic', 'Miller');
INSERT INTO players (first_name, last_name) VALUES ('Victoria', 'Miller');
INSERT INTO players (first_name, last_name) VALUES ('Vince', 'Bucchare');
INSERT INTO players (first_name, last_name) VALUES ('Jen', 'Bucchare');
INSERT INTO players (first_name, last_name) VALUES ('Mike', 'Nelson');
INSERT INTO players (first_name, last_name) VALUES ('Chris', 'Zimmerman');
INSERT INTO players (first_name, last_name) VALUES ('Mike', 'Kraft');
INSERT INTO players (first_name, last_name) VALUES ('Tom', 'Nichols');
INSERT INTO players (first_name, last_name) VALUES ('Kristin', 'Nichols');
INSERT INTO players (first_name, last_name) VALUES ('Kelly', 'Flood');
INSERT INTO players (first_name) VALUES ('Jake');
INSERT INTO players (first_name, last_name) VALUES ('Joe', 'Brandt');
INSERT INTO players (first_name, last_name) VALUES ('Jenn', 'Brandt');
--[default] INSERT INTO players (first_name, last_name) VALUES ('', '');

--[default] INSERT INTO boardgames (name, min_number_players, max_number_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_board, has_cards, has_tiles, has_figurines)
--[default] VALUES ('', 0, 0, 0, 0, 0, 'yes', 'yes', 'yes', 'yes', 'yes');
INSERT INTO boardgames (name, min_number_players, max_number_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_board, has_cards, has_tiles, has_figurines)
VALUES ('', 0, 0, 0, 0, 0, 'yes', 'yes', 'yes', 'yes', 'yes');