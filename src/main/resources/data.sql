--delete * from movie;
--delete * from seat;
--delete * from screen;
--DELETE * FROM THEATRE;
--DELETE * FROM PLACE;

INSERT INTO PLACE (PLACE_ID, CITY, STATE, COUNTRY) VALUES (1, 'Munirika', 'New Delhi', 'INDIA'),
(2, 'Gaya', 'BIHAR', 'INDIA'),
(3, 'Bangalore', 'KARNATAKA', 'INDIA');

INSERT INTO THEATRE (THEATRE_ID,THEATRE_NAME, FK_PLACE_ID)
VALUES (1, 'Sangam',1),
(2, 'Anand',2),
(3,'Ravi Theatre',3),
(4,'Priya',1),
(5,'Prem Talkies',2),
(6,'PVR Bellandur',3);

insert into screen (screen_id, screen_name, fk_theatre_id)
values (1, 'Sangam Screen', 1),
(2, 'Anand Screen', 2),
(3, 'Ravi Theatre Screen', 3),
(4, 'Maratha Screen', 4),
(5, 'Prem Screen', 5),
(6, 'Audi 1', 6),
(7, 'Audi 2', 6),
(8, 'Audi 3', 6);

insert into seat (row_no,seat_no, fk_screen_id)
values
('A', 1, 1),('A', 2, 1),('A', 3, 1),('A', 4, 1),('A', 5, 1),('A', 6, 1),('A', 7, 1),('A', 8, 1),('A', 9, 1),('A', 10, 1),
('B', 1, 1),('B', 2, 1),('B', 3, 1),('B', 4, 1),('B', 5, 1),('B', 6, 1),('B', 7, 1),('B', 8, 1),('B', 9, 1),('B', 10, 1),
('C', 1, 1),('C', 2, 1),('C', 3, 1),('C', 4, 1),('C', 5, 1),('C', 6, 1),('C', 7, 1),('C', 8, 1),('C', 9, 1),('C', 10, 1),
('D', 1, 1),('D', 2, 1),('D', 3, 1),('D', 4, 1),('D', 5, 1),('D', 6, 1),('D', 7, 1),('D', 8, 1),('D', 9, 1),('D', 10, 1),
('E', 1, 1),('E', 2, 1),('E', 3, 1),('E', 4, 1),('E', 5, 1),('E', 6, 1),('E', 7, 1),('E', 8, 1),('E', 9, 1),('E', 10, 1),
('F', 1, 1),('F', 2, 1),('F', 3, 1),('F', 4, 1),('F', 5, 1),('C', 6, 1),('C', 7, 1),('F', 8, 1),('F', 9, 1),('F', 10, 1),
('A', 1, 2),('A', 2, 2),('A', 3, 2),('A', 4, 2),('A', 5, 2),('A', 6, 2),('A', 7, 2),('A', 8, 2),('A', 9, 2),('A', 10, 2),
('B', 1, 2),('B', 2, 2),('B', 3, 2),('B', 4, 2),('B', 5, 2),('B', 6, 2),('B', 7, 2),('B', 8, 2),('B', 9, 2),('B', 10, 2),
('C', 1, 2),('C', 2, 2),('C', 3, 2),('C', 4, 2),('C', 5, 2),('C', 6, 2),('C', 7, 2),('C', 8, 2),('C', 9, 2),('C', 10, 2),
('D', 1, 2),('D', 2, 2),('D', 3, 2),('D', 4, 2),('D', 5, 2),('D', 6, 2),('D', 7, 2),('D', 8, 2),('D', 9, 2),('D', 10, 2),
('E', 1, 2),('E', 2, 2),('E', 3, 2),('E', 4, 2),('E', 5, 2),('E', 6, 2),('E', 7, 2),('E', 8, 2),('E', 9, 2),('E', 10, 2),
('F', 1, 2),('F', 2, 2),('F', 3, 2),('F', 4, 2),('F', 5, 2),('C', 6, 2),('F', 7, 2),('F', 8, 2),('F', 9, 2),('F', 10, 2),
('A', 1, 3),('A', 2, 3),('A', 3, 3),('A', 4, 3),('A', 5, 3),('A', 6, 3),('A', 7, 3),('A', 8, 3),('A', 9, 3),('A', 10, 3),
('B', 1, 3),('B', 2, 3),('B', 3, 3),('B', 4, 3),('B', 5, 3),('B', 6, 3),('B', 7, 3),('B', 8, 3),('B', 9, 3),('B', 10, 3),
('C', 1, 3),('C', 2, 3),('C', 3, 3),('C', 4, 3),('C', 5, 3),('C', 6, 3),('C', 7, 3),('C', 8, 3),('C', 9, 3),('C', 10, 3),
('D', 1, 3),('D', 2, 3),('D', 3, 3),('D', 4, 3),('D', 5, 3),('D', 6, 3),('D', 7, 3),('D', 8, 3),('D', 9, 3),('D', 10, 3),
('E', 1, 3),('E', 2, 3),('E', 3, 3),('E', 4, 3),('E', 5, 3),('E', 6, 3),('E', 7, 3),('E', 8, 3),('E', 9, 3),('E', 10, 3),
('F', 1, 3),('F', 2, 3),('F', 3, 3),('F', 4, 3),('F', 5, 3),('C', 6, 3),('F', 7, 3),('F', 8, 3),('F', 9, 3),('F', 10, 3),
('A', 1, 4),('A', 2, 4),('A', 3, 4),('A', 4, 4),('A', 5, 4),('A', 6, 4),('A', 7, 4),('A', 8, 4),('A', 9, 4),('A', 10, 4),
('B', 1, 4),('B', 2, 4),('B', 3, 4),('B', 4, 4),('B', 5, 4),('B', 6, 4),('B', 7, 4),('B', 8, 4),('B', 9, 4),('B', 10, 4),
('C', 1, 4),('C', 2, 4),('C', 3, 4),('C', 4, 4),('C', 5, 4),('C', 6, 4),('C', 7, 4),('C', 8, 4),('C', 9, 4),('C', 10, 4),
('D', 1, 4),('D', 2, 4),('D', 3, 4),('D', 4, 4),('D', 5, 4),('D', 6, 4),('D', 7, 4),('D', 8, 4),('D', 9, 4),('D', 10, 4),
('E', 1, 4),('E', 2, 4),('E', 3, 4),('E', 4, 4),('E', 5, 4),('E', 6, 4),('E', 7, 4),('E', 8, 4),('E', 9, 4),('E', 10, 4),
('F', 1, 4),('F', 2, 4),('F', 3, 4),('F', 4, 4),('F', 5, 4),('C', 6, 4),('F', 7, 4),('F', 8, 4),('F', 9, 4),('F', 10, 4),
('A', 1, 5),('A', 2, 5),('A', 3, 5),('A', 4, 5),('A', 5, 5),('A', 6, 5),('A', 7, 5),('A', 8, 5),('A', 9, 5),('A', 10, 5),
('B', 1, 5),('B', 2, 5),('B', 3, 5),('B', 4, 5),('B', 5, 5),('B', 6, 5),('B', 7, 5),('B', 8, 5),('B', 9, 5),('B', 10, 5),
('C', 1, 5),('C', 2, 5),('C', 3, 5),('C', 4, 5),('C', 5, 5),('C', 6, 5),('C', 7, 5),('C', 8, 5),('C', 9, 5),('C', 10, 5),
('D', 1, 5),('D', 2, 5),('D', 3, 5),('D', 4, 5),('D', 5, 5),('D', 6, 5),('D', 7, 5),('D', 8, 5),('D', 9, 5),('D', 10, 5),
('E', 1, 5),('E', 2, 5),('E', 3, 5),('E', 4, 5),('E', 5, 5),('E', 6, 5),('E', 7, 5),('E', 8, 5),('E', 9, 5),('E', 10, 5),
('F', 1, 5),('F', 2, 5),('F', 3, 5),('F', 4, 5),('F', 5, 5),('C', 6, 5),('F', 7, 5),('F', 8, 5),('F', 9, 5),('F', 10, 5),
('A', 1, 6),('A', 2, 6),('A', 3, 6),('A', 4, 6),('A', 5, 6),('A', 6, 6),('A', 7, 6),('A', 8, 6),('A', 9, 6),('A', 10, 6),
('B', 1, 6),('B', 2, 6),('B', 3, 6),('B', 4, 6),('B', 5, 6),('B', 6, 6),('B', 7, 6),('B', 8, 6),('B', 9, 6),('B', 10, 6),
('C', 1, 6),('C', 2, 6),('C', 3, 6),('C', 4, 6),('C', 5, 6),('C', 6, 6),('C', 7, 6),('C', 8, 6),('C', 9, 6),('C', 10, 6),
('D', 1, 6),('D', 2, 6),('D', 3, 6),('D', 4, 6),('D', 5, 6),('D', 6, 6),('D', 7, 6),('D', 8, 6),('D', 9, 6),('D', 10, 6),
('E', 1, 6),('E', 2, 6),('E', 3, 6),('E', 4, 6),('E', 5, 6),('E', 6, 6),('E', 7, 6),('E', 8, 6),('E', 9, 6),('E', 10, 6),
('F', 1, 6),('F', 2, 6),('F', 3, 6),('F', 4, 6),('F', 5, 6),('C', 6, 6),('F', 7, 6),('F', 8, 6),('F', 9, 6),('F', 10, 6),
('A', 1, 7),('A', 2, 7),('A', 3, 7),('A', 4, 7),('A', 5, 7),('A', 6, 7),('A', 7, 7),('A', 8, 7),('A', 9, 7),('A', 10, 7),
('B', 1, 7),('B', 2, 7),('B', 3, 7),('B', 4, 7),('B', 5, 7),('B', 6, 7),('B', 7, 7),('B', 8, 7),('B', 9, 7),('B', 10, 7),
('C', 1, 7),('C', 2, 7),('C', 3, 7),('C', 4, 7),('C', 5, 7),('C', 6, 7),('C', 7, 7),('C', 8, 7),('C', 9, 7),('C', 10, 7),
('D', 1, 7),('D', 2, 7),('D', 3, 7),('D', 4, 7),('D', 5, 7),('D', 6, 7),('D', 7, 7),('D', 8, 7),('D', 9, 7),('D', 10, 7),
('E', 1, 7),('E', 2, 7),('E', 3, 7),('E', 4, 7),('E', 5, 7),('E', 6, 7),('E', 7, 7),('E', 8, 7),('E', 9, 7),('E', 10, 7),
('F', 1, 7),('F', 2, 7),('F', 3, 7),('F', 4, 7),('F', 5, 7),('C', 6, 7),('F', 7, 7),('F', 8, 7),('F', 9, 7),('F', 10, 7),
('A', 1, 8),('A', 2, 8),('A', 3, 8),('A', 4, 8),('A', 5, 8),('A', 6, 8),('A', 7, 8),('A', 8, 8),('A', 9, 8),('A', 10, 8),
('B', 1, 8),('B', 2, 8),('B', 3, 8),('B', 4, 8),('B', 5, 8),('B', 6, 8),('B', 7, 8),('B', 8, 8),('B', 9, 8),('B', 10, 8),
('C', 1, 8),('C', 2, 8),('C', 3, 8),('C', 4, 8),('C', 5, 8),('C', 6, 8),('C', 7, 8),('C', 8, 8),('C', 9, 8),('C', 10, 8),
('D', 1, 8),('D', 2, 8),('D', 3, 8),('D', 4, 8),('D', 5, 8),('D', 6, 8),('D', 7, 8),('D', 8, 8),('D', 9, 8),('D', 10, 8),
('E', 1, 8),('E', 2, 8),('E', 3, 8),('E', 4, 8),('E', 5, 8),('E', 6, 8),('E', 7, 8),('E', 8, 8),('E', 9, 8),('E', 10, 8),
('F', 1, 8),('F', 2, 8),('F', 3, 8),('F', 4, 8),('F', 5, 8),('C', 6, 8),('F', 7, 8),('F', 8, 8),('F', 9, 8),('F', 10, 8);

insert into movie (movie_name)
values
('Bell Bottom')