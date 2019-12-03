BEGIN TRANSACTION;

CREATE TABLE player (
player_id SERIAL NOT NULL,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NULL,
CONSTRAINT pk_player_player_id PRIMARY KEY (player_id)
);

CREATE TABLE gaming_group (
group_id SERIAL NOT NULL,
group_name VARCHAR(75) NOT NULL,
is_sanctioned BOOLEAN NOT NULL,
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
has_dice BOOLEAN NOT NULL,
has_cards BOOLEAN NOT NULL,
has_board BOOLEAN NOT NULL,
has_tiles BOOLEAN NOT NULL,
has_figurines BOOLEAN NOT NULL,
CONSTRAINT pk_game_inv_number PRIMARY KEY (inv_number)
);

CREATE TABLE played (
played_id SERIAL NOT NULL,
inv_number INT NOT NULL,
player_id INT NOT NULL,
group_id INT NOT NULL,
date_time DATE NOT NULL,
location VARCHAR(80) NOT NULL,
has_prize BOOLEAN NULL,
prize VARCHAR(80),
CONSTRAINT pk_played_played_id PRIMARY KEY (played_id)
);

CREATE TABLE player_played (
player_id INT NOT NULL,
played_id INT NOT NULL,
standing INT NOT NULL,
points INT NULL,
score INT NULL,
on_team BOOLEAN NULL,
chose_game BOOLEAN NULL,
CONSTRAINT pk_player_played_player_id_played_id PRIMARY KEY (player_id, played_id)
);

CREATE TABLE player_group (
group_id INT NOT NULL,
player_id INT NOT NULL,
CONSTRAINT pk_player_group_group_id_player_id PRIMARY KEY (group_id, player_id)
);

CREATE TABLE player_inventory (
player_id INT NOT NULL,
inv_number INT NOT NULL,
owns_game BOOLEAN NOT NULL,
CONSTRAINT pk_player_inventory_player_id_inv_number PRIMARY KEY (player_id, inv_number)
);

--ROLLBACK;
END TRANSACTION;