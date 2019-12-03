BEGIN TRANSACTION;

--ALTER TABLE gaming_group
--ADD FOREIGN KEY (group_id)
--REFERENCES player_group (group_id);

ALTER TABLE player_group
ADD FOREIGN KEY (group_id)
REFERENCES gaming_group(group_id);

ALTER TABLE player_group
ADD FOREIGN KEY (player_id)
REFERENCES player (player_id);

--ALTER TABLE player
--ADD FOREIGN KEY (player_id)
--REFERENCES player_group (player_id);

ALTER TABLE player_played
ADD FOREIGN KEY (player_id)
REFERENCES player (player_id);

ALTER TABLE player_inventory
ADD FOREIGN KEY (player_id)
REFERENCES player (player_id);

ALTER TABLE player_played
ADD FOREIGN KEY (played_id)
REFERENCES played (played_id);

--ALTER TABLE played
--ADD FOREIGN KEY (played_id)
--REFERENCES player_played (played_id);

--ALTER TABLE game
--ADD FOREIGN KEY (inv_number)
--REFERENCES game_played (inv_number);

ALTER TABLE game
ADD FOREIGN KEY (inv_number)
REFERENCES player_inv (inv_number);

ALTER TABLE player_inv
ADD FOREIGN KEY (inv_number)
REFERENCES game (inv_number);



--ROLLBACK;
END TRANSACTION;