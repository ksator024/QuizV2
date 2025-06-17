DROP TABLE IF EXISTS Fragen;

CREATE TABLE Fragen (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    frage VARCHAR(255),
    antwort1 VARCHAR(255),
    antwort2 VARCHAR(255),
    antwort3 VARCHAR(255),
    antwort4 VARCHAR(255),
    richtigeAntwort VARCHAR(255),
    kategorie VARCHAR(255)
);

Drop Table if Exists Spieler;
Create Table Spieler (
	id Integer PRIMARY Key AutoIncrement,
	name varchar(255),
	highscore integer
	);
	
Drop Table if Exists RichtigBeantwortet;

Create Table RichtigBeantwortet(
	    id INTEGER PRIMARY KEY AUTOINCREMENT,
		spielerId Integer,
		fragenId Integer,
		Foreign Key (spielerId) References Spieler(id),
		Foreign Key (FragenId) References Fragen(id)
);



INSERT INTO Spieler (name, highscore) Values 
('OPFER',10);

Insert INTO RichtigBeantwortet(spielerId,fragenId) Values
(1,1);

INSERT INTO Fragen (frage, antwort1, antwort2, antwort3, antwort4, richtigeAntwort, kategorie) VALUES
('Was ist eine CPU?', 'Festplatte', 'Speicher', 'Monitor', 'Prozessor', 'Prozessor', 'Technik'),
('Wer malte die Sternennacht?', 'van Gogh', 'Monet', 'Picasso', 'Klimt', 'van Gogh', 'Kunst'),
('Welcher Kontinent ist der größte?', 'Asien', 'Afrika', 'Europa', 'Antarktis', 'Asien', 'Geografie'),
('Wann war die Französische Revolution?', '1750', '1812', '1789', '1800', '1789', 'Geschichte'),
('Wo passiert ein Homerun?', 'Baseball', 'Fußball', 'Tennis', 'Golf', 'Baseball', 'Sport'),
('Was misst ein Thermometer?', 'Temperatur', 'Länge', 'Licht', 'Gewicht', 'Temperatur', 'Wissenschaft'),
('Welches Teilchen hat eine negative Ladung?', 'Proton', 'Elektron', 'Photon', 'Neutron', 'Elektron', 'Wissenschaft'),
('Wer war ein berühmter Bildhauer der Renaissance?', 'Rembrandt', 'Goethe', 'Michelangelo', 'Picasso', 'Michelangelo', 'Kunst'),
('Was bedeutet HTML?', 'HyperText Markup Language', 'Home Tool Markup Language', 'Hyperlink and Text Markup Language', 'HighText Machine Language', 'HyperText Markup Language', 'Technik'),
('Was ist die Hauptstadt von Italien?', 'Venedig', 'Florenz', 'Mailand', 'Rom', 'Rom', 'Geografie'),
('In welcher Sportart gibt es ein kleinen Ball?', 'Tennis', 'Boxen', 'Basketball', 'Fußball', 'Tennis', 'Sport'),
('Wann fiel die Berliner Mauer?', '1988', '1989', '1987', '1990', '1989', 'Geschichte'),
('Wozu dient ein Router?', 'Musik hören', 'Scannen', 'Drucken', 'Netzwerkverbindung', 'Netzwerkverbindung', 'Technik'),
('Wie viele Minuten dauert ein Fußballspiel ohne Verlängerung?', '90', '120', '60', '45', '90', 'Sport'),
('Was ist die chemische Formel von Salz?', 'NaCl', 'O2', 'CO2', 'H2O', 'NaCl', 'Wissenschaft'),	
('Wer war Kaiser von Frankreich?', 'Karl der Große', 'Napoleon', 'Bismarck', 'Hitler', 'Napoleon', 'Geschichte'),
('Was ist die Hauptstadt von Italien?', 'Rom', 'Mailand', 'Florenz', 'Venedig', 'Rom', 'Geografie'),
('Wer war der erste Präsident der USA?', 'John Adams', 'Thomas Jefferson', 'George Washington', 'Abraham Lincoln', 'George Washington', 'Geschichte'),
('Wer malte die Mona Lisa?', 'Leonardo da Vinci', 'Pablo Picasso', 'Claude Monet', 'Vincent van Gogh', 'Leonardo da Vinci', 'Kunst'),
('Welche Farbe dominiert in Picassos Blauer Periode?', 'Grün', 'Rot', 'Gelb', 'Blau', 'Blau', 'Kunst'),
('Wie viele Kontinente gibt es?', '7', '5', '8', '6', '7', 'Geografie'),
('Was misst ein Thermometer?', 'Temperatur', 'Licht', 'Gewicht', 'Länge', 'Temperatur', 'Wissenschaft'),
('Wann begann der Zweite Weltkrieg?', '1939', '1935', '1945', '1941', '1939', 'Geschichte'),
('Welcher Planet ist der Sonne am nächsten?', 'Merkur', 'Venus', 'Mars', 'Erde', 'Merkur', 'Wissenschaft'),
('Was ist die chemische Formel von Wasser?', 'H2O', 'H2', 'CO2', 'O2', 'H2O', 'Wissenschaft'),
('Wie viele Spieler hat eine Fußballmannschaft auf dem Feld?', '11', '10', '12', '9', '11', 'Sport'),
('Welcher Sportler hat die meisten olympischen Goldmedaillen?', 'Michael Phelps', 'Usain Bolt', 'Mark Spitz', 'Carl Lewis', 'Michael Phelps', 'Sport'),
('Welcher Komponist schrieb die 9. Symphonie?', 'Beethoven', 'Schubert', 'Bach', 'Mozart', 'Beethoven', 'Kunst'),
('Was ist eine CPU?', 'Prozessor', 'Speicher', 'Festplatte', 'Monitor', 'Prozessor', 'Technik'),
('Wozu dient ein Router?', 'Netzwerkverbindung', 'Musik hören', 'Drucken', 'Scannen', 'Netzwerkverbindung', 'Technik'),
('Was bedeutet HTML?', 'HyperText Markup Language', 'Hyperlink and Text Markup Language', 'HighText Machine Language', 'Home Tool Markup Language', 'HyperText Markup Language', 'Technik'),
('Wo liegt der Mount Everest?', 'Nepal', 'China', 'Pakistan', 'Indien', 'Nepal', 'Geografie'),
('Wer war Kaiser von Frankreich?', 'Napoleon', 'Hitler', 'Karl der Große', 'Bismarck', 'Napoleon', 'Geschichte'),
('Wer war der erste Präsident der USA?', 'George Washington', 'Abraham Lincoln', 'Thomas Jefferson', 'John Adams', 'George Washington', 'Geschichte'),
('Welcher Planet ist der Sonne am nächsten?', 'Merkur', 'Mars', 'Venus', 'Erde', 'Merkur', 'Wissenschaft'),
('Was misst ein Thermometer?', 'Temperatur', 'Länge', 'Licht', 'Gewicht', 'Temperatur', 'Wissenschaft'),
('Wo gibt es einen ein Homerun?', 'Baseball', 'Tennis', 'Fußball', 'Golf', 'Baseball', 'Sport'),
('In welcher Sportart gibt es ein Ass?', 'Tennis', 'Basketball', 'Boxen', 'Fußball', 'Tennis', 'Sport'),
('Wie viele Minuten dauert ein Fußballspiel?', '90', '45', '60', '120', '90', 'Sport'),
('Wann fiel die Berliner Mauer?', '1989', '1990', '1988', '1987', '1989', 'Geschichte'),
('Was ist die chemische Formel von Salz?', 'NaCl', 'O2', 'H2O', 'CO2', 'NaCl', 'Wissenschaft');
Select count(*) as c from Fragen;
SELECT frage from Fragen
where id = 0;


Select f.id, f.frage from RichtigBeantwortet r
inner join Spieler s on r.spielerId = s.Id
inner join Fragen f on r.fragenId = f.id
where s.id = 1;
