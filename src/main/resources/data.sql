create table questions(
    id INT not null auto_increment primary key,
    question varchar(255) NOT NULL,
    optionA varchar(255) not null,
    optionB varchar(255) not null,
    optionC varchar(255),
    optionD varchar(255),
    corrIdx tinyint unsigned not null,
    points tinyint unsigned not null,
    image BLOB);