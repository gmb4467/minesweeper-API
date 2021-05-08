CREATE TABLE gamer
(
    id bigint GENERATED ALWAYS AS IDENTITY,
    name varchar(100) NOT NULL,
    PRIMARY KEY (id)
);
