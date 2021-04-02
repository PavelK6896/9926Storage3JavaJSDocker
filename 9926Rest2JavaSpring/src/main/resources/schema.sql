CREATE SCHEMA IF NOT EXISTS client;


create table IF NOT EXISTS client.users
(
    id       bigserial not null,
    created  timestamp,
    email    varchar(255),
    enabled  boolean,
    password varchar(255),
    username varchar(255),
    primary key (id)
);


delete
from client.users
where id in (100, 102);

insert into  client.users (id, email, enabled, password, username)
values (100, '1', true, '{bcrypt}$2y$12$B5le4rjqinV9wp8zFH0a0elodBgl5rQE85xfAWH7WXZ3UtbjyG9vW', '1'),
 (102, '2', true, '{bcrypt}$2y$12$B5le4rjqinV9wp8zFH0a0elodBgl5rQE85xfAWH7WXZ3UtbjyG9vW', '2');

















