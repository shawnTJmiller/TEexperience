BEGIN TRANSACTION;

CREATE TABLE player (
player_id SERIAL NOT NULL,
first_name VARCHAR(20) NOT NULL,
last_name VARCHAR(20) NULL,
nickname VARCHAR(50) NULL,
residence VARCHAR(50) DEFAULT 'Somewhere on Earth',
tag_line VARCHAR (80) DEFAULT 'Game on!',
email VARCHAR(80) NOT NULL,
CONSTRAINT pk_player_player_id PRIMARY KEY (player_id)
);

CREATE TABLE gaming_group (
group_id SERIAL NOT NULL,
group_name VARCHAR(80) NOT NULL,
is_sanctioned BOOLEAN DEFAULT false NOT NULL,
CONSTRAINT pk_gaming_group_group_id PRIMARY KEY (group_id)
);

CREATE TABLE game (
inv_number SERIAL NOT NULL,
game_name VARCHAR(80) NOT NULL,
min_num_players INT NOT NULL,
max_num_players INT NULL,
min_play_time INT NOT NULL,
max_play_time INT NULL,
recommended_age_min INT NOT NULL,
has_dice BOOLEAN DEFAULT false NOT NULL,
has_cards BOOLEAN DEFAULT false NOT NULL,
has_board BOOLEAN DEFAULT false NOT NULL,
has_tiles BOOLEAN DEFAULT false NOT NULL,
has_figurines BOOLEAN DEFAULT false NOT NULL,
CONSTRAINT pk_game_inv_number PRIMARY KEY (inv_number)
);

CREATE TABLE play_session (
session_id SERIAL NOT NULL,
date_time TIMESTAMP NOT NULL,
location VARCHAR(80) NOT NULL,
has_prize BOOLEAN DEFAULT false NOT NULL,
prize VARCHAR(80),
money_prize INT,
CONSTRAINT pk_played_session_id PRIMARY KEY (session_id)
);

CREATE TABLE player_session (
player_id INT NOT NULL,
session_id INT NOT NULL,
standings INT NOT NULL,
points INT,
score INT,
on_team BOOLEAN DEFAULT false NOT NULL,
chose_game BOOLEAN DEFAULT false NOT NULL,
CONSTRAINT pk_player_session_player_id_session_id PRIMARY KEY (player_id, session_id)
);

CREATE TABLE player_group (
group_id INT NOT NULL,
player_id INT NOT NULL,
CONSTRAINT pk_player_group_group_id_player_id PRIMARY KEY (group_id, player_id)
);

CREATE TABLE player_inventory (
player_id INT NOT NULL,
inv_number INT NOT NULL,
CONSTRAINT pk_player_inventory_player_id_inv_number PRIMARY KEY (player_id, inv_number)
);

CREATE TABLE game_session (
inv_number INT NOT NULL,
session_id INT NOT NULL,
CONSTRAINT pk_game_play_inv_number_session_id PRIMARY KEY (inv_number, session_id)
);

CREATE TABLE group_session (
group_id INT NOT NULL,
session_id INT NOT NULL,
group_standings INT,
group_points INT,
group_score INT,
CONSTRAINT pk_group_session_group_id_session_id PRIMARY KEY (group_id, session_id)
);

CREATE TABLE contact_information (
first_name VARCHAR(20) NOT NULL,
middle_name VARCHAR(20),
last_name VARCHAR (20) NOT NULL,
email VARCHAR(80) NOT NULL,
password VARCHAR(40) NOT NULL,
phone_number INT,
receive_updates BOOLEAN DEFAULT true NOT NULL,
CONSTRAINT pk_contact_information_email PRIMARY KEY (email)
);

--ROLLBACK;
END TRANSACTION;