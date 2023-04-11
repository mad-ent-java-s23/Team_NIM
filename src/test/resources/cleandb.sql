# Drop/Create Table
DROP TABLE IF EXISTS wordle_test.words;
CREATE TABLE wordle_test.words (id int auto_increment primary key, solution  varchar(5) not null, printDate date null, editor varchar(150) null, daysSinceLaunch int null );
INSERT INTO wordle_test.words (solution, printDate, editor) VALUES ('smash', '2023-04-05', 'Tracy Bennett'), ('leafy', '2023-04-06', 'Tracy Bennett'), ('locus', '2023-04-07', 'Tracy Bennett');