BEGIN TRANSACTION;

--INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('5 Minute Dungeon', 2, 6, 5, 45, 8, false, true, false, true, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('7 Wonders', 2, 7, 30, 45, 10, false, true, false, true, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Alhambra', 2, 6, 30, 45, 10, false, true, true, true, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Ancestree', 2, 6, 20, 25, 8, false, true, false, true, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Apotheca', 1, 4, 30, 45, 14, false, true, true, true, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Apples to Apples', 4, 10, 45, 90, 6, false, true, false, false, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('BANG: The Dice Game', 3, 8, 15, 20, true, true, false, false, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Batman: Gotham City Chronicles', 2, 4, 60, 120, 12, true, true, true, true, true);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Battlestations', 2, 9, 60, 120, 12, true, false, true, true, true);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Bears vs Babies', 2, 5, 20, 30, 10, false, true, false, false, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Beer Money', 2, 4, 15, 30, 18, false, true, false, false, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Best Treehouse Ever: Forest of Fun', 2, 8, 20, 40, 6, false, true, true, false, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ("Betrayal at Baldur's Gate", 3, 6, 45, 75, 10, true, true, false, true, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Blood Rage', 2, 5, 60, 90, 12, false, true, true, true, true);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Brass: Birmingham', 2, 4, 120, 14, false, true, true, true, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Brass: Lancashire', 2, 4, 120, 14, false, true, true, true, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Candyland', 2, 4, 12, 20, 3, false, true, true, false, true);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Candyland: Minnie Mouse', 2, 3, 15, 20, 3, false, false, true, false, true);
INSERT INTO game (game_name, min_num_players, min_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Cards Against Humanity', 4, 30, 18, false, true, false, false, false);
INSERT INTO game (game_name, min_num_players, max_num_players, min_play_time, max_play_time, recommended_age_min, has_dice, has_cards, has_board, has_tiles, has_figurines)
VALUES ('Crocodile Dentist', 2, 5, 3, false, false, false, false, false);

--INSERT INTO player (first_name, last_name)
INSERT INTO player (first_name, last_name)
VALUES ('Shawn', 'Miller');
INSERT INTO player (first_name, last_name)
VALUES ('Melissa', 'Miller');
INSERT INTO player (first_name, last_name)
VALUES ('Dominic', 'Miller');
INSERT INTO player (first_name, last_name)
VALUES ('Victoria', 'Miller');
INSERT INTO player (first_name, last_name)
VALUES ('Vince', 'Bucchare');
INSERT INTO player (first_name, last_name)
VALUES ('Jen', 'Bucchare');
INSERT INTO player (first_name, last_name)
VALUES ('Johnny', 'Bucchare');
INSERT INTO player (first_name, last_name)
VALUES ('Melanie', 'Bucchare');
INSERT INTO player (first_name, last_name)
VALUES ('Kristin', 'Nichols');
INSERT INTO player (first_name, last_name)
VALUES ('Tom', 'Nichols');
--kelly
INSERT INTO player (first_name, last_name)
VALUES ('Cecelia', 'Nichols');
INSERT INTO player (first_name, last_name)
VALUES ('Zachary', 'Nichols');
INSERT INTO player (first_name, last_name)
VALUES ('Mike', 'Kraft');
INSERT INTO player (first_name, last_name)
VALUES ('Mike', 'Nelson');

--INSERT INTO gaming_group (group_name, is_sanctioned)
INSERT INTO gaming_group (group_name, player_id, is_sanctioned)
VALUES ('Monday Night Gaming', false);
INSERT INTO gaming_group (group_name, player_id, is_sanctioned)
VALUES ('Boardgame Storyline', false);
INSERT INTO gaming_group (group_name, player_id, is_sanctioned)
VALUES ('Houghton Lake', false);
INSERT INTO 

ROLLBACK;
--END TRANSACTION;