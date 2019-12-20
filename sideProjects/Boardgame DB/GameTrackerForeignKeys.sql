BEGIN TRANSACTION;

ALTER TABLE player
ADD FOREIGN KEY (email)
REFERENCES contact_information;

ALTER TABLE group_session
ADD FOREIGN KEY (group_id)
REFERENCES gaming_group (group_id);

ALTER TABLE group_session
ADD FOREIGN KEY (session_id)
REFERENCES play_session (session_id);

ALTER TABLE player_group
ADD FOREIGN KEY (group_id)
REFERENCES gaming_group(group_id);

ALTER TABLE player_group
ADD FOREIGN KEY (player_id)
REFERENCES player (player_id);

ALTER TABLE player_session
ADD FOREIGN KEY (player_id)
REFERENCES player (player_id);

ALTER TABLE player_session
ADD FOREIGN KEY (session_id)
REFERENCES play_session (session_id);

ALTER TABLE player_inventory
ADD FOREIGN KEY (player_id)
REFERENCES player (player_id);

ALTER TABLE player_inventory
ADD FOREIGN KEY (inv_number)
REFERENCES game (inv_number);

ALTER TABLE game_session
ADD FOREIGN KEY (inv_number)
REFERENCES game (inv_number);

ALTER TABLE game_session
ADD FOREIGN KEY (session_id)
REFERENCES play_session (session_id);

--ROLLBACK;
END TRANSACTION;