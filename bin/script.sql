use apiteste;
CREATE TABLE Crawler (
    id int NOT NULL AUTO_INCREMENT,
    data varchar(255),
    cidade varchar(255),
    confirmado varchar(255),
    confirmado100k varchar(255),
    obito varchar(255),
    obito100k varchar(255),
    estado varchar(255),
    PRIMARY KEY (id)
);