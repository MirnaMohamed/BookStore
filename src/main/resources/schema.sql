CREATE TABLE books (
                       id SERIAL NOT NULL,
                       title varchar(100) NOT NULL,
                       author varchar(50) NOT NULL,
                       description varchar(128) DEFAULT NULL,
                       price float NOT NULL ,
                       quantity int NOT NULL,
                       PRIMARY KEY (id),
                       UNIQUE (title)
)