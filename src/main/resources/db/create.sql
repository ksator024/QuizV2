
DROP TABLE IF EXISTS Fragen;

CREATE TABLE Fragen (
    id INTEGER PRIMARY KEY,
    frage VARCHAR(255),
    antwort1 VARCHAR(255),
    antwort2 VARCHAR(255),
    antwort3 VARCHAR(255),
    antwort4 VARCHAR(255),
    richtigeAntwort varchar(255),
    kategorie VARCHAR(255)
);


INSERT INTO Fragen(id,frage,antwort1,antwort2,antwort3,antwort4,richtigeAntwort,kategorie) Values(0,'Test','antwort1','antwort2','antwort3','antwort4',1,'testing');
INSERT INTO Fragen (id, frage, antwort1, antwort2, antwort3, antwort4, richtigeAntwort, kategorie) VALUES
(1, 'Wann begann der Zweite Weltkrieg?', '1935', '1939', '1941', '1945', '1939', 'Geschichte'),
(2, 'Wer war der erste Präsident der USA?', 'George Washington', 'Abraham Lincoln', 'John Adams', 'Thomas Jefferson', 'George Washington', 'Geschichte'),
(3, 'Welcher Planet ist der Sonne am nächsten?', 'Erde', 'Mars', 'Merkur', 'Venus', 'Merkur', 'Wissenschaft'),
(4, 'Was ist die chemische Formel von Wasser?', 'H2O', 'CO2', 'O2', 'H2', 'H2O', 'Wissenschaft'),
(5, 'Wie viele Spieler hat eine Fußballmannschaft auf dem Feld?', '9', '10', '11', '12', '11', 'Sport'),
(6, 'Welcher Sportler hat die meisten olympischen Goldmedaillen?', 'Usain Bolt', 'Michael Phelps', 'Carl Lewis', 'Mark Spitz', 'Michael Phelps', 'Sport'),
(7, 'Wer malte die Mona Lisa?', 'Pablo Picasso', 'Leonardo da Vinci', 'Vincent van Gogh', 'Claude Monet', 'Leonardo da Vinci', 'Kunst'),
(8, 'Welcher Komponist schrieb die 9. Symphonie?', 'Mozart', 'Bach', 'Beethoven', 'Schubert', 'Beethoven', 'Kunst');

Select count(*) as c from Fragen;